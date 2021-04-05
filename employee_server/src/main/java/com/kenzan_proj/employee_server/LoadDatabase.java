package com.kenzan_proj.employee_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
	
	private static final Logger log = 
			LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Employee("Michael", 'G', "Scott", "03/15/1965", "02/10/1990")));
			log.info("Preloading " + repository.save(new Employee("Jim", 'D', "Halpert", "10/01/1978", "11/27/2000")));
			log.info("Preloading " + repository.save(new Employee("Dwight", 'K', "Schrute", "01/20/1968", "05/03/1995")));
			log.info("Preloading " + repository.save(new Employee("Pam", 'M', "Beesly", "03/25/1979", "08/16/1996")));
			log.info("Preloading " + repository.save(new Employee("Stanley", 'B', "Hudson", "10/3/1951", "12/30/1987")));
			log.info("Preloading " + repository.save(new Employee("Jan", 'N', "Levinson", "07/17/1963", "06/11/1988")));
		};
	}

}
