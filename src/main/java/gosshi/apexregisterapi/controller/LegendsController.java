package gosshi.apexregisterapi.controller;

import gosshi.apexregisterapi.domain.Legends;
import gosshi.apexregisterapi.domain.LegendsList;
import gosshi.apexregisterapi.service.LegendsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/legends")
public class LegendsController {
    private static final Logger logger = LoggerFactory.getLogger(LegendsController.class);
    private LegendsService legendsService;

    public LegendsController(LegendsService legendsService) {
        this.legendsService = legendsService;
    }

    @GetMapping(path = "find", produces = MediaType.APPLICATION_JSON_VALUE)
    public LegendsList find() {
        return this.legendsService.find();
    }

    @GetMapping(path = "get", produces = "application/json")
    public Optional<Legends> get(@RequestParam Long legendsId) {
        return this.legendsService.get(legendsId);
    }

    @PostMapping(path = "add", produces = "application/json")
    public void add(@RequestParam String legendsName) {
        Legends legends = new Legends();
        legends.setLegendsName(legendsName);
        legends.setDeleteFlag(false);
        this.legendsService.add(legends);
    }

    @PatchMapping(path = "update", produces = "application/json")
    public void set(@RequestBody Legends legends) {
        this.legendsService.set(legends);
    }

    @DeleteMapping(path = "delete/{legendsId}", produces = "application/json")
    public void remove(@PathVariable Long legendsId) {
        this.legendsService.remove(legendsId);
    }

}
