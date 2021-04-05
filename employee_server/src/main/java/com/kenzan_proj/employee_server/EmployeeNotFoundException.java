package com.kenzan_proj.employee_server;

class EmployeeNotFoundException extends RuntimeException {
	
	EmployeeNotFoundException(long id) {
	    super("Could not find employee " + id);
	  }

}
