package payroll;

import java.util.List;
import java.util.Objects;

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

	  @Override
	  public boolean equals(Object o) {

	    if (this == o)
	      return true;
	    if (!(o instanceof Dept))
	      return false;
	    Dept dept = (Dept) o;
	    return Objects.equals(this.deptId, dept.deptId) && Objects.equals(this.deptName, dept.deptName);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(this.deptId, this.deptName);
	  }

	  @Override
	  public String toString() {
	    return "Department{" + "id=" + this.deptId + ", name='" + this.deptName +"'}'";
	  }
}
