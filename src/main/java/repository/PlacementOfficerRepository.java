package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.PlacementOfficer;

public interface PlacementOfficerRepository extends JpaRepository<PlacementOfficer, Long> {
    PlacementOfficer findByEmailAndPassword(String email, String password);
}