package tn.esprit.revision.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.revision.entity.DataCenter;

@Repository
public interface IDataCenterRepo extends CrudRepository<DataCenter, Integer> {
}
