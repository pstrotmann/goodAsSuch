package goodassuch

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PolitikerServiceSpec extends Specification {

    PolitikerService politikerService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Politiker(...).save(flush: true, failOnError: true)
        //new Politiker(...).save(flush: true, failOnError: true)
        //Politiker politiker = new Politiker(...).save(flush: true, failOnError: true)
        //new Politiker(...).save(flush: true, failOnError: true)
        //new Politiker(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //politiker.id
    }

    void "test get"() {
        setupData()

        expect:
        politikerService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Politiker> politikerList = politikerService.list(max: 2, offset: 2)

        then:
        politikerList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        politikerService.count() == 5
    }

    void "test delete"() {
        Long politikerId = setupData()

        expect:
        politikerService.count() == 5

        when:
        politikerService.delete(politikerId)
        sessionFactory.currentSession.flush()

        then:
        politikerService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Politiker politiker = new Politiker()
        politikerService.save(politiker)

        then:
        politiker.id != null
    }
}
