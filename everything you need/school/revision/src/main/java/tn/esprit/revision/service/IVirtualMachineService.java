package tn.esprit.revision.service;

import tn.esprit.revision.entity.VirtualMachine;

public interface IVirtualMachineService {
    public int ajouterVm(VirtualMachine vm);
    public void affecterVmuser(int idvm,int iduser);
}
