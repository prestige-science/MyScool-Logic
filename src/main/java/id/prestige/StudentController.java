package id.prestige;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student/{id}")
    public Students show(@PathVariable String id) {
        int idStudent = Integer.parseInt(id);
        return studentRepository.findOne(idStudent);
    }
}
