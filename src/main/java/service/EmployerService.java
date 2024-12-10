package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Employer;
import repository.EmployerRepository;

@Service
public class EmployerService {

    @Autowired
    private EmployerRepository employerRepository;

    public Employer findEmployerByEmailAndPassword(String email, String password) {
        return employerRepository.findByEmailAndPassword(email, password);
    }

	public void saveEmployer(Employer employer) {
		// TODO Auto-generated method stub
		
	}
}
