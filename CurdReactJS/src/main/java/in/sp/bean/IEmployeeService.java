package in.sp.bean;

import java.util.List;

public interface IEmployeeService {
  Integer saveEmployee(Employee e);
   List<Employee> getAllEmployee();
  Employee  getOneEmployee(Integer id);
//  void updateOneEmployee(Employee e);
  void deleteOneEmployee(Integer id);
   
}
