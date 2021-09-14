package gosshi.apexregisterapi.controller;

import gosshi.apexregisterapi.domain.Legends;
import gosshi.apexregisterapi.domain.LegendsList;
import gosshi.apexregisterapi.service.LegendsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/legends")
public class LegendsController {
    private static final Logger logger = LoggerFactory.getLogger(LegendsController.class);
    private LegendsService legendsService;

    public LegendsController() {

    }

    @GetMapping(path = "", produces = "application/json")
    public LegendsList find(@RequestParam(name = "legendsName", required = false) String legendsName) {
        return this.legendsService.find(legendsName);
    }

    @GetMapping(path = "/{legendsId}", produces = "application/json")
    public Optional<Legends> get(@PathVariable Long legendsId) {
        return this.legendsService.get(legendsId);
    }

    @PostMapping(path = "", produces = "application/json")
    public void add(@RequestBody Legends legends) {
        this.legendsService.add(legends);
    }

    @PatchMapping(path = "/{legendsId}", produces = "application/json")
    public void set(@PathVariable String legendsId, @RequestBody Legends legends) {
        this.legendsService.set(legends);
    }

    @DeleteMapping(path = "/{legendsId}", produces = "application/json")
    public void remove(@PathVariable Long legendsId) {
        this.legendsService.remove(legendsId);
    }

}
