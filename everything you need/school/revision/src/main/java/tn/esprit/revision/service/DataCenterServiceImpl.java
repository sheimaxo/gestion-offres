package tn.esprit.revision.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.revision.entity.DataCenter;
import tn.esprit.revision.repository.IDataCenterRepo;
@Service
public class DataCenterServiceImpl implements IDataCenterService{
    @Autowired
    IDataCenterRepo iDataCenterRepo;
    @Override
    public void ajouterDc(DataCenter datacenter) {
        this.iDataCenterRepo.save(datacenter);

    }
}
