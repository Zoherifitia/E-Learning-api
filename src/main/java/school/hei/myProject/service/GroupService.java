package school.hei.myProject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.myProject.model.Group;
import school.hei.myProject.repo.GroupRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GroupService {
    private GroupRepository repository;

    public List<Group> getAll(){
        return repository.findAll();
    }
    public Optional<Group> getById(String idGroup){
        return repository.findById(idGroup);
    }

    public Group saveOne(Group group){
        return repository.save(group);
    }
}
