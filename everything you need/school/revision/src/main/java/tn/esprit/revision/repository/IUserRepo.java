package tn.esprit.revision.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.revision.entity.User;

@Repository
public interface IUserRepo extends CrudRepository<User,Integer> {
}
