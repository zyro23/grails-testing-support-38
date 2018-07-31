package myapp

import grails.gorm.services.Service

@Service(Dummy)
interface DummyDataService {

	Dummy get(Long id)

}