package gosshi.apexregisterapi.service;


import gosshi.apexregisterapi.domain.Legends;
import gosshi.apexregisterapi.domain.LegendsList;
import gosshi.apexregisterapi.repository.LegendsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class LegendsService {
    private static final Logger logger = LoggerFactory.getLogger(LegendsService.class);
    private LegendsRepository repository;

    public LegendsList find(String legendsName) {
        LegendsList legendsList = new LegendsList();
        legendsList.setLegends(this.repository.findAll());
        return legendsList;
    }


    public Optional<Legends> get(Long legendsId) {
        return this.repository.findById(legendsId);
    }


    public void add(Legends legends) {
        this.repository.save(legends);
    }


    public void set(Legends legends) {
        this.repository.save(legends);
    }

    public void remove(Long legendsId) {
        this.repository.deleteById(legendsId);
    }
}
