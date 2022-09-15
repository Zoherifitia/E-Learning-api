package school.hei.myProject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.myProject.model.Student;
import school.hei.myProject.repo.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository repository;

    public List<Student> getAll(){
        return repository.findAll();
    }

    public Optional<Student> getById(String studentId){
        return repository.findById(studentId);
    }

    public List<Student> saveAll(List<Student> students){
        return repository.saveAll(students);
    }
    public Student save(Student student){
        return repository.save(student);
    }
}
