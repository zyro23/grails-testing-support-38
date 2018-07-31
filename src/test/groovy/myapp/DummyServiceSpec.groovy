package myapp

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification


class DummyServiceSpec extends Specification implements DataTest, ServiceUnitTest<DummyService> {

	void setupSpec() {
		mockDataService DummyDataService
	}

	void "test mocked data service"() {
		expect:
		service.dummyDataService
	}

}
