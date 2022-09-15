package school.hei.myProject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.myProject.model.Teacher;
import school.hei.myProject.repo.TeacherRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeacherService {
    private TeacherRepository teacherRepository;

    public  List<Teacher> getAll(){
        return teacherRepository.findAll();
    }
    public Optional<Teacher> getById(String id){
        return teacherRepository.findById(id);
    }
    public List<Teacher> saveAll(List<Teacher> teachers){
        return teacherRepository.saveAll(teachers);
    }
}
