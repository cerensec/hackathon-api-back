package fr.hackathon.apiback.infrastructure.adapter;

import fr.hackathon.apiback.domain.Utilisateur;
import fr.hackathon.apiback.domain.ports.spi.IUtilisateurDao;
import fr.hackathon.apiback.infrastructure.repository.UtilisateurRepository;

public class UtilisateurDao implements IUtilisateurDao {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurDao(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur add(Utilisateur utilisateur) {
        return this.utilisateurRepository.add(utilisateur);
    }
}
