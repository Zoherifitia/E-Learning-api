package school.hei.myProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.myProject.model.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager,String> {
}
