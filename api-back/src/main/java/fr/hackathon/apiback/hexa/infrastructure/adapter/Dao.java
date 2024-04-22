package fr.hackathon.apiback.hexa.infrastructure.adapter;

import fr.hackathon.apiback.hexa.domain.Test;
import fr.hackathon.apiback.hexa.domain.ports.spi.IDao;
import fr.hackathon.apiback.hexa.infrastructure.repository.TestRepository;

public class Dao implements IDao {
    private final TestRepository testRepository;

    public Dao(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Test add(Test test) {
        return this.testRepository.add(test);
    }
}
