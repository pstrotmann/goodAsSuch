package goodassuch

import grails.gorm.services.Service

@Service(Politiker)
interface PolitikerService {

    Politiker get(Serializable id)

    List<Politiker> list(Map args)

    Long count()

    void delete(Serializable id)

    Politiker save(Politiker politiker)

}