package ma.fstt.atelier7jee.service;

import ma.fstt.atelier7jee.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeService {
    Employee save(Employee employee);
    Employee update(Long id, Employee employee);
    void delete(Long id);
    Optional<Employee> findById(Long id);
    List<Employee> findAll();
}
