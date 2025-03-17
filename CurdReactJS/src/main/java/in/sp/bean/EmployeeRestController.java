package in.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
 
	@Autowired
	private IEmployeeService service;
	
	
	//1 save employee
	 
	@PostMapping("/save")
	public ResponseEntity<String> saveEmpolyee(
	
@RequestBody Employee employee
		  
			){
	Integer id=	service.saveEmployee(employee);
	
		return new ResponseEntity<String>
		("Employee '"+id+"' saved",HttpStatus.OK);
	}
	//2 featc all
	
	//3 fetch one
	
	//4 delete
	
	
	//5 Update
	
	
	
	
	
	
	
	
	
}
