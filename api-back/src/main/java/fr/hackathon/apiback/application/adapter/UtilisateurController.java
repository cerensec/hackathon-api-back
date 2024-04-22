package fr.hackathon.apiback.application.adapter;

import fr.hackathon.apiback.domain.Utilisateur;
import fr.hackathon.apiback.domain.ports.api.UtilisateurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/utilisateur")
public class UtilisateurController {
    private final UtilisateurService service;

    public UtilisateurController(UtilisateurService service) {
        this.service = service;
    }

    @PutMapping
    public ResponseEntity createUtilisateur(){
        this.service.add(new Utilisateur());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
