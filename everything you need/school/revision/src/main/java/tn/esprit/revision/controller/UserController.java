package tn.esprit.revision.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.revision.entity.DataCenter;
import tn.esprit.revision.entity.User;
import tn.esprit.revision.entity.VirtualMachine;
import tn.esprit.revision.service.*;

@RestController
@RequestMapping("/data")
public class UserController {
    @Autowired
    IUserService userService;
    @Autowired
    IDataCenterService dataCenterService;
    @Autowired
    IVirtualMachineService vmService;

    @PostMapping("/ajouteruser")
    public void ajouteruser(@RequestBody User u){
        userService.ajouterUser(u);
    }
    @PostMapping("/ajouter-dc")
    public void ajouterDc(@RequestBody DataCenter dataCenter){
        dataCenterService.ajouterDc(dataCenter);
    }
    @PostMapping("/ajouter-vm")
    public void ajouterVm(@RequestBody VirtualMachine vm){
        vmService.ajouterVm(vm);
    }
    @PutMapping("/affecter-vm-user/{id-vm}/{id-user}")
    public void affecterVmUser(@PathVariable("id-vm") int idVm, @PathVariable("id-user") int idUser){
        vmService.affecterVmuser(idVm, idUser);
    }
}
