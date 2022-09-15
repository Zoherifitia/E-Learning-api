package school.hei.myProject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import school.hei.myProject.model.Course;
import school.hei.myProject.service.CourseService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@AllArgsConstructor
public class CourseController {
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourse() {
        return courseService.getAll();
    }

    @GetMapping("/courses/{id}")
    public Optional<Course> getcoursById(@PathVariable String coursId) {
        return courseService.getById(coursId);
    }

    @PutMapping("/courses")
    public List<Course> createOrUptadeCourses(@RequestBody List<Course> toWrite) {
        return courseService.saveAll(toWrite);
    }

    @PutMapping("/courses/{id}")
    public Course createOrUpdateOneCourses(@RequestBody Course toWrite) {
        return courseService.saveOne(toWrite);
    }
}
