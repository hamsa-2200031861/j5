package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Student;
import repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void registerStudent(Student student) {
        // Save the student to the database
        studentRepository.save(student);
    }

	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public Student findStudentByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

    // Other service methods can be added as needed
}
