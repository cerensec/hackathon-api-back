package fr.hackathon.apiback.application.dto;

import lombok.Data;

@Data
public class OutDto {
    Long id;
    String nom;
    String prenom;
    String login;
    String mail;
    String password;
    String roles;
}
