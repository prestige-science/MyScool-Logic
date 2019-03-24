package id.prestige;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyController {
    @Autowired
    FacultyRepository facultyRepository;

    @GetMapping("/faculty/{id}")
    public Faculties show(@PathVariable String id) {
        int idFaculty = Integer.parseInt(id);
        return facultyRepository.findOne(idFaculty);
    }
}
