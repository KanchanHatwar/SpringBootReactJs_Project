package in.sp.bean;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer empid;
	private String empname;
	private Double empsal;
	private String empDept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empid, String empname, Double empsal, String empDept) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.empDept = empDept;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(Double empsal) {
		this.empsal = empsal;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empDept, empid, empname, empsal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empDept, other.empDept) && Objects.equals(empid, other.empid)
				&& Objects.equals(empname, other.empname) && Objects.equals(empsal, other.empsal);
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", empDept=" + empDept
				+ "]";
	}

	
}
