package fr.hackathon.apiback.domain.ports.api;

import fr.hackathon.apiback.domain.Utilisateur;
import fr.hackathon.apiback.domain.ports.spi.IUtilisateurDao;
import fr.hackathon.apiback.infrastructure.adapter.UtilisateurDao;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService implements IUtilisateurService {

    private final IUtilisateurDao utilisateurDao;

    public UtilisateurService(IUtilisateurDao utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }

    public Utilisateur add(Utilisateur utilisateur){
        return utilisateurDao.add(utilisateur);
    }
}
