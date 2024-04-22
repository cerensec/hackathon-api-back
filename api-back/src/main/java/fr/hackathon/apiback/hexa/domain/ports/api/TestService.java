package fr.hackathon.apiback.hexa.domain.ports.api;

import fr.hackathon.apiback.hexa.domain.Test;
import fr.hackathon.apiback.hexa.domain.ports.spi.IDao;
import org.springframework.stereotype.Service;

@Service
public class TestService implements IService{

    private final IDao dao;

    public TestService(IDao dao) {
        this.dao = dao;
    }

    @Override
    public Test add(Test test) {
        return dao.add(test);
    }
}
