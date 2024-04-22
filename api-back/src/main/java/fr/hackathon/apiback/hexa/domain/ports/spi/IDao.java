package fr.hackathon.apiback.hexa.domain.ports.spi;

import fr.hackathon.apiback.hexa.domain.Test;

public interface IDao {

    Test add(final Test test);
}
