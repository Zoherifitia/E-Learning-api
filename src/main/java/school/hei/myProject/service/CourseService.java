package school.hei.myProject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.myProject.model.Course;
import school.hei.myProject.repo.CourseRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CourseService {
    private CourseRepository courseRepository;

    public List<Course> getAll(){
        return courseRepository.findAll();
    }

    public Optional<Course> getById(String idCourse){
        return courseRepository.findById(idCourse);
    }

    public List<Course> saveAll(List<Course> courses){
        return courseRepository.saveAll(courses);
    }

    public Course saveOne(Course course){
        return courseRepository.save(course);
    }


}
