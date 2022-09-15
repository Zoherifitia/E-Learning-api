package school.hei.myProject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import school.hei.myProject.model.Teacher;
import school.hei.myProject.service.TeacherService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@AllArgsConstructor
public class TeacherController {
    private TeacherService teacherService;

    @GetMapping(value = "/teachers")
    public List<Teacher> getAllTeacher(){
        return teacherService.getAll();
    }

    @GetMapping(value = "/teachers/{id}")
    public Optional<Teacher> getTeacherById(@PathVariable String idTeacher){
        return teacherService.getById(idTeacher);
    }

    @PutMapping(value = "/teachers")
    public List<Teacher> creqteOrUpdateteacher(@RequestBody List<Teacher> toWrite){
        return teacherService.saveAll(toWrite);
    }
}
