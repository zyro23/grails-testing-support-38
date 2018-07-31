package myapp

import grails.gorm.transactions.Transactional

@Transactional
class DummyService {

	DummyDataService dummyDataService

	Dummy get(Long id) {
		return dummyDataService.get(id)
	}

}
