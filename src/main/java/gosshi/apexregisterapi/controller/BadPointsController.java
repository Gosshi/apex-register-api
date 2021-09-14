package gosshi.apexregisterapi.controller;

import gosshi.apexregisterapi.domain.BadPoints;
import gosshi.apexregisterapi.domain.BadPointsList;
import gosshi.apexregisterapi.service.BadPointsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/badPoints")
public class BadPointsController {
    private static final Logger logger = LoggerFactory.getLogger(BadPointsController.class);
    private BadPointsService badPointsService;

    public BadPointsController(BadPointsService badPointsService) {
        this.badPointsService = badPointsService;
    }

    @GetMapping(path = "find", produces = MediaType.APPLICATION_JSON_VALUE)
    public BadPointsList find() {
        return this.badPointsService.find();
    }

    @GetMapping(path = "get")
    public Optional<BadPoints> get(@RequestParam Long badPointsId) {
        return this.badPointsService.get(badPointsId);
    }

    @PostMapping(path = "add")
    public void add(@RequestBody String badPointsName) {
        BadPoints badPoints = new BadPoints();
        badPoints.setBadPointsName(badPointsName);
        badPoints.setDeleteFlag(false);
        this.badPointsService.add(badPoints);
    }

    @PatchMapping(path = "update", produces = "application/json")
    public void set(@RequestBody BadPoints badPoints) {
        this.badPointsService.set(badPoints);
    }

    @DeleteMapping(path = "delete/{badPointsId}")
    public void remove(@PathVariable Long badPointsId) {
        this.badPointsService.remove(badPointsId);
    }

}
