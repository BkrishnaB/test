package payroll;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
class Dept {

	 private String deptName;
	 private @Id
	  @GeneratedValue Long deptId;
	 
	 @OneToMany(mappedBy = "deptId")
	 private List<Employee> emp;
	 
	 Dept(){};
	
	  Dept(String deptName) {

		    this.deptName = deptName;
		 
		  }
	 
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public List<Employee> getEmp() {
		
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
}
