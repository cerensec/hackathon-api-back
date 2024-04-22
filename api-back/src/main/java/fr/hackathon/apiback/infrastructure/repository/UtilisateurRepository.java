package fr.hackathon.apiback.infrastructure.repository;

import fr.hackathon.apiback.domain.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {


    public Utilisateur add(final Utilisateur utilisateur);
    public Utilisateur getUtilisateurBy(final long ID);
    public Utilisateur update(final Utilisateur utilisateur);
    public void delete(final Utilisateur utilisateur);


}
