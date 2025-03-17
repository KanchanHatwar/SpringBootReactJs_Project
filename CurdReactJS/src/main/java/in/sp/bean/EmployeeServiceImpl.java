package in.sp.bean;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
@Autowired
	private EmployeeRespository repo;
	@Override
	public Integer saveEmployee(Employee e) {
     Integer id= repo.save(e).getEmpid();
 
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list=repo.findAll();
		return list;
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		
		Optional<Employee> opt=repo.findById(id);
		 
		
		Employee emp=opt.orElseThrow(()-> new EmployeeNotFoundException("Employee Not Exit"));
		
		
		return emp;
	
	}

//	@Override
//	public void updateOneEmployee(Employee e) {
//
//          repo.save(e);
//		
//	}

	@Override
	public void deleteOneEmployee(Integer id) {
       Employee emp=getOneEmployee(id);
       
       repo.delete(emp);

		
	}

}
