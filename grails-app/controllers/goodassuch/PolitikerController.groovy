package goodassuch

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class PolitikerController {

    PolitikerService politikerService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond politikerService.list(params), model:[politikerCount: politikerService.count()]
    }

    def show(Long id) {
        respond politikerService.get(id)
    }

    def create() {
        respond new Politiker(params)
    }

    def save(Politiker politiker) {
        if (politiker == null) {
            notFound()
            return
        }

        try {
            politikerService.save(politiker)
        } catch (ValidationException e) {
            respond politiker.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'politiker.label', default: 'Politiker'), politiker.id])
                redirect politiker
            }
            '*' { respond politiker, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond politikerService.get(id)
    }

    def update(Politiker politiker) {
        if (politiker == null) {
            notFound()
            return
        }

        try {
            politikerService.save(politiker)
        } catch (ValidationException e) {
            respond politiker.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'politiker.label', default: 'Politiker'), politiker.id])
                redirect politiker
            }
            '*'{ respond politiker, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        politikerService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'politiker.label', default: 'Politiker'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    def regPgm(Long id) {
        Politiker politiker = Politiker.find("from Politiker where id = ${id}")
        politiker.regierungsprogramm()
        redirect(uri: "/politiker/show/${id}")
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'politiker.label', default: 'Politiker'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
