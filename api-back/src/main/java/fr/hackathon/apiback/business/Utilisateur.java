package fr.hackathon.apiback.business;

import jakarta.persistence.*;

@Entity
public class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    String nom ;
    String prenom ;
    String login ;
    String email ;
    String password ;
}
