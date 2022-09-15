package school.hei.myProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.myProject.model.Teacher;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,String> {


}
