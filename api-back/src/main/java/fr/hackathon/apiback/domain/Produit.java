package fr.hackathon.apiback.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data

public class Produit {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "catalogueId")
    private Catalogue catalogue;
    
}
