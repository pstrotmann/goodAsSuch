package goodassuch

import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
@Rollback
class PolitikerTestDivers extends Specification {

    PolitikerService politikerService

    void "test save&count"() {
        Politiker p =
        new Politiker(name:'Polos'
                ,geburtsort:'Delphi'
                ,geschlecht:'d'
                ,ausbildung:'Philosoph'
                ,herkunft:'Sklave')
        try {
            p.save(flush: true
                 , failOnError: true)
        } catch (Exception e)
           {println("Save Politiker failed!")
           println(e.printStackTrace())}
        expect:
        politikerService.count() == 1
    }
}
