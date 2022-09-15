package school.hei.myProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.myProject.model.Student;


import java.util.Arrays;
import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student,String> {

}
