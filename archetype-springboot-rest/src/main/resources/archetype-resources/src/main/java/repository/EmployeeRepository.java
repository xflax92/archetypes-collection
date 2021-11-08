package ${package}.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ${package}.model.EmployeeEntity;

@Repository
public interface EmployeeRepository
        extends JpaRepository<EmployeeEntity, Long> {

}