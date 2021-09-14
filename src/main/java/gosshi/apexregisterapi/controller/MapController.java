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

    public MapController() {
    }

    @GetMapping(path = "", produces = "application/json")
    public MapList find(@RequestParam(name = "mapName", required = false) String mapName) {
        return this.mapService.find(mapName);
    }


    @GetMapping(path = "/{mapId}", produces = "application/json")
    public Optional<Map> get(@PathVariable Long mapId) {
        return this.mapService.get(mapId);
    }

    @PostMapping(path = "", produces = "application/json")
    public void add(@RequestBody Map map) {
        this.mapService.add(map);
    }

    @PatchMapping(path = "/{mapId}", produces = "application/json")
    public void set(@PathVariable Long mapId, @RequestBody Map map) {
        this.mapService.set(map);
    }

    @DeleteMapping(path = "/{mapId}", produces = "application/json")
    public void remove(@PathVariable Long mapId) {
        this.mapService.remove(mapId);
    }

}
