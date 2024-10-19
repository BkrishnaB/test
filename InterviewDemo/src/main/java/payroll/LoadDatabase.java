package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository,DeptRepository deptrepo) {

    return args -> {
      log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar",1l)));
      log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief",2l)));
      log.info("Preloading " + deptrepo.save(new Dept("burglars")));
      log.info("Preloading " + deptrepo.save(new Dept("thieves")));    };
  }
}