package fr.hackathon.apiback.domain.ports.spi;

import fr.hackathon.apiback.domain.Utilisateur;

public interface IUtilisateurDao {
    Utilisateur add(final Utilisateur utilisateur);
}

