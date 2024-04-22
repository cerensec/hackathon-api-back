package fr.hackathon.apiback.domain.ports.api;

import fr.hackathon.apiback.domain.Produit;
import fr.hackathon.apiback.domain.ports.spi.IProduitDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService implements IProduitService {

    private final IProduitDao iProduitDao;

    public ProduitService(IProduitDao iProduitDao) {
        this.iProduitDao = iProduitDao;
    }

    @Override
    public List<Produit> recupererProduits() {
        return this.iProduitDao.recupererProduits();
    }
}
