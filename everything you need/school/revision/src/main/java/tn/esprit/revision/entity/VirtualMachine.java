package tn.esprit.revision.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VirtualMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVm;
    private String os;
    private int tailleDisque;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    @ManyToOne
    DataCenter datacenter;
    public VirtualMachine() {
    }

    public VirtualMachine(int idVm, String os, int tailleDisque, Etat etat) {
        this.idVm = idVm;
        this.os = os;
        this.tailleDisque = tailleDisque;
        this.etat = etat;
    }
}
