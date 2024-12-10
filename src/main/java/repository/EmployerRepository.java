package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Employer;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
    Employer findByEmailAndPassword(String email, String password);
}
