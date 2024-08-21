package tn.esprit.revision.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.revision.entity.User;
import tn.esprit.revision.entity.VirtualMachine;
import tn.esprit.revision.repository.IUserRepo;
import tn.esprit.revision.repository.IVirtualMachineRepo;

@Service
public class VirtualMachineServiceImpl implements IVirtualMachineService{

    @Autowired
    IVirtualMachineRepo iVirtualMachineRepo;
    @Autowired
    IUserRepo userRepo;
    @Override
    public int ajouterVm(VirtualMachine vm) {
     return    this.iVirtualMachineRepo.save(vm).getIdVm();


    }

    @Override
    public void affecterVmuser(int idvm, int iduser) {
    VirtualMachine virtualMachine = this.iVirtualMachineRepo.findById(idvm).orElse(null);;
        User user = this.userRepo.findById(iduser).orElse(null);
        user.getVirtualMachines().add(virtualMachine);
        userRepo.save(user);
    }
}
