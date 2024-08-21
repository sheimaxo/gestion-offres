package tn.esprit.revision.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.revision.entity.VirtualMachine;

@Repository
public interface IVirtualMachineRepo extends CrudRepository<VirtualMachine,Integer> {
}
