package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface DeptRepository extends JpaRepository<Dept, Long> {

}