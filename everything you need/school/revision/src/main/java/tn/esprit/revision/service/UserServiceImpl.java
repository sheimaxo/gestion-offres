package tn.esprit.revision.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.revision.entity.User;
import tn.esprit.revision.repository.IUserRepo;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    IUserRepo iUserRepo;
    @Override
    public void ajouterUser(User u) {
        this.iUserRepo.save(u);

    }
}
