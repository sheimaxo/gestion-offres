package tn.esprit.revision.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class DataCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDs;
    private String region;
    @Temporal(TemporalType.DATE)
    private Date dateFabrication;
    private int espaceLibreDisque;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="datacenter")
    private Set<VirtualMachine> VirtualMachines;
    public DataCenter() {
    }

    public DataCenter(int idDs, String region, Date dateFabrication, int espaceLibreDisque) {
        this.idDs = idDs;
        this.region = region;
        this.dateFabrication = dateFabrication;
        this.espaceLibreDisque = espaceLibreDisque;
    }
}
