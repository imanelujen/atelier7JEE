package ma.fstt.atelier7jee.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import ma.fstt.atelier7jee.entities.Employee;
import ma.fstt.atelier7jee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class EmployeeServiceImpl implements EmployeService {
    private final EmployeeRepository repo;

    @Override
    public Employee save(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public Employee update(Long id, Employee employee) {
        Employee e = repo.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        e.setFirstName(employee.getFirstName());
        e.setLastName(employee.getLastName());
        e.setEmail(employee.getEmail());
        e.setSalary(employee.getSalary());
        return repo.save(e);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return repo.findAll();
    }
}

