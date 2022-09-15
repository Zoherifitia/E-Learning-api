package school.hei.myProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.myProject.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,String> {
}
