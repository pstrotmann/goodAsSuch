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
        new Politiker(name:'Sokrates',geburtsort:'Athen',geschlecht:'m',ausbildung:'Philosoph',herkunft:'Bürger')
                .save(flush: true, failOnError: true)
        new Politiker(name:'Platon',geburtsort:'Delphi',geschlecht:'m',ausbildung:'Philosoph',herkunft:'Adel')
                .save(flush: true, failOnError: true)
        //new Politiker(...).save(flush: true, failOnError: true)
        Politiker politiker = new Politiker(name:'Polos',geburtsort:'Delphi',geschlecht:'m',ausbildung:'Philosoph',herkunft:'Sklave').save(flush: true, failOnError: true)
        //new Politiker(...).save(flush: true, failOnError: true)
        //new Politiker(...).save(flush: true, failOnError: true)
        assert true, "TODO: Provide a setupData() implementation for this generated test suite"
        politiker.id
    }

    void "test get"() {
        setupData()

        expect:
        politikerService.get(1) != null
        politikerService.get(2) != null
        politikerService.get(3) != null
        politikerService.get(4) == null
    }

    void "test list"() {
        setupData()

        when:
        List<Politiker> politikerList = politikerService.list(max: 3, offset: 0)

        then:
        politikerList.size() == 3
        //assert true, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        politikerService.count() == 3
    }

    void "test delete"() {
        Long politikerId = setupData()

        expect:
        politikerService.count() == 3

        when:
        politikerService.delete(politikerId)
        sessionFactory.currentSession.flush()

        then:
        politikerService.count() == 2
    }

    void "test save"() {
        when:
        assert true, "TODO: Provide a valid instance to save"
        Politiker politiker =
                new Politiker(name:'Xanthippe',
                        geburtsort:'Kreta',
                        geschlecht:'d',
                        ausbildung:'Philosoph',
                        herkunft:'Bürger')
        politikerService.save(politiker)
        then:
        politiker.id != null
    }
}
