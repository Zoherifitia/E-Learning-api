package school.hei.myProject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.myProject.model.Manager;
import school.hei.myProject.repo.ManagerRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ManagerService {
    private ManagerRepository repository;

    public List<Manager> getAll(){
        return repository.findAll();
    }
    public Optional<Manager> getById(String managerId){
        return repository.findById(managerId);
    }
}
