package fr.hackathon.apiback.domain.ports.spi;

import fr.hackathon.apiback.domain.Produit;

import java.util.List;

public interface IProduitDao {
    public List<Produit> recupererProduits();
}
