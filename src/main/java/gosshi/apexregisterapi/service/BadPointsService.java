package gosshi.apexregisterapi.service;


import gosshi.apexregisterapi.domain.BadPoints;
import gosshi.apexregisterapi.domain.BadPointsList;
import gosshi.apexregisterapi.repository.BadPointsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BadPointsService {
    private static final Logger logger = LoggerFactory.getLogger(BadPointsService.class);
    private BadPointsRepository repository;

    public BadPointsService(BadPointsRepository repository){
        this.repository = repository;
    }

    public BadPointsList find() {
        BadPointsList badPointsList = new BadPointsList();
        badPointsList.setBadPoints(this.repository.findAll());
        return badPointsList;
    }


    public Optional<BadPoints> get(Long badPointsId) {
        return this.repository.findById(badPointsId);
    }


    public void add(BadPoints badPoints) {
        this.repository.save(badPoints);
    }


    public void set(BadPoints badPoints) {
        this.repository.save(badPoints);
    }


    public void remove(Long badPointsId) {
        this.repository.deleteById(badPointsId);
    }
}
