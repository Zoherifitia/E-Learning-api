package school.hei.myProject.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import school.hei.myProject.model.Manager;
import school.hei.myProject.service.ManagerService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@AllArgsConstructor
public class ManagerController {
    private ManagerService managerService;

    @GetMapping(value = "/managers")
    public List<Manager> getAllManagers(){
        return managerService.getAll();
    }
    @GetMapping(value = "/managers/{id}")
    public Optional<Manager> getManagerById(@PathVariable String idManager){
        return managerService.getById(idManager);
    }
}
