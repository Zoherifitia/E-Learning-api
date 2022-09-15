package school.hei.myProject.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import school.hei.myProject.model.Student;
import school.hei.myProject.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping(value = "/students")
    public List<Student> getAllStudents(){
        return studentService.getAll();
    }

    @GetMapping(value = "/students/{id}")
    public Optional<Student> getStudentById(@PathVariable String studentId){
        return studentService.getById(studentId);
    }

    @PutMapping(value = "/students")
    public List<Student> createOrUpdateStudent(@RequestBody List<Student> toWrite){
        return studentService.saveAll(toWrite);
    }
}
