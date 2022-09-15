package school.hei.myProject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import school.hei.myProject.model.Group;
import school.hei.myProject.service.GroupService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@AllArgsConstructor
public class GroupController {
    private GroupService groupService;

    @GetMapping("/groups")
    public List<Group> getAllGroups(){
        return groupService.getAll();
    }
    @GetMapping("/groups/{id}")
    public Optional<Group> getGroupById(@PathVariable String groupId){
        return groupService.getById(groupId);
    }

    @PutMapping("/groups")
    public Group createOrUpdateGroups(@RequestBody Group toWrite){
        return groupService.saveOne(toWrite);
    }
}
