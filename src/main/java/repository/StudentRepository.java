package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom method to find student by email and password
    Student findByEmailAndPassword(String email, String password);
}
