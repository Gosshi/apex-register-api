package gosshi.apexregisterapi.controller;


import gosshi.apexregisterapi.domain.Map;
import gosshi.apexregisterapi.domain.MapList;
import gosshi.apexregisterapi.service.MapService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/map")
public class MapController {
    private static final Logger logger = LoggerFactory.getLogger(MapController.class);
    private MapService mapService;

    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @GetMapping(path = "find", produces = "application/json")
    public MapList find() {
        return this.mapService.find();
    }


    @GetMapping(path = "get", produces = "application/json")
    public Optional<Map> get(@RequestParam Long mapId) {
        return this.mapService.get(mapId);
    }

    @PostMapping(path = "add", produces = "application/json")
    public void add(@RequestBody String mapName) {
        Map map = new Map();
        map.setMapName(mapName);
        map.setDeleteFlag(false);
        this.mapService.add(map);
    }

    @PatchMapping(path = "update", produces = "application/json")
    public void set(@RequestBody Map map) {
        this.mapService.set(map);
    }

    @DeleteMapping(path = "delete/{mapId}", produces = "application/json")
    public void remove(@PathVariable Long mapId) {
        this.mapService.remove(mapId);
    }

}
