package demo


import grails.util.GrailsClassUtils
import org.grails.datastore.mapping.model.MappingContext
import org.grails.datastore.mapping.model.PersistentEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier

class ThingService {

    @Autowired
    @Qualifier('grailsDomainClassMappingContext')
    MappingContext mappingContext

    def report() {
        PersistentEntity persistentEntity = mappingContext.getPersistentEntity(Thing.name)

        int total = GrailsClassUtils.getStaticPropertyValue(persistentEntity.javaClass, 'totalItems') as int
        int inc = GrailsClassUtils.getStaticPropertyValue(persistentEntity.javaClass, 'incItems') as int

        println "Count of ${persistentEntity.name}: ${total} total, ${inc} inc"
    }
}
