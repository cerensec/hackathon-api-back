package fr.hackathon.apiback.application.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class InDto {
    Long id;
    String nom;
    String prenom;
    String login;
    String mail;
    String password;
    String roles;
}
