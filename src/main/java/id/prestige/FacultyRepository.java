package id.prestige;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacultyRepository extends JpaRepository<Faculties, Integer> {
    List<Faculties> findByNameContaining(String text);
}
