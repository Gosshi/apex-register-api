package gosshi.apexregisterapi.service;


import gosshi.apexregisterapi.domain.Map;
import gosshi.apexregisterapi.domain.MapList;
import gosshi.apexregisterapi.repository.MapRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MapService {
    private static final Logger logger = LoggerFactory.getLogger(MapService.class);
    private MapRepository repository;

    public MapService(MapRepository repository){
        this.repository = repository;
    }

    public MapList find() {
        MapList mapList = new MapList();
        mapList.setMap(this.repository.findAll());
        return mapList;
    }


    public Optional<Map> get(Long mapId) {
        return this.repository.findById(mapId);
    }


    public void add(Map map) {
        this.repository.save(map);
    }


    public void set(Map map) {
        this.repository.save(map);
    }

    public void remove(Long mapId) {
        this.repository.deleteById(mapId);
    }
}
