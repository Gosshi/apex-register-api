package gosshi.apexregisterapi.controller;

import gosshi.apexregisterapi.domain.Rank;
import gosshi.apexregisterapi.domain.RankList;
import gosshi.apexregisterapi.service.RankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/rank")
public class RankController {
    private static final Logger logger = LoggerFactory.getLogger(RankController.class);
    private RankService rankService;

    public RankController() {
    }

    @GetMapping(path = "", produces = "application/json")
    public RankList find(@RequestParam(name = "rankName", required = false) String rankName) {
        return this.rankService.find(rankName);
    }

    @GetMapping(path = "/{rankId}", produces = "application/json")
    public Optional<Rank> get(@PathVariable Long rankId) {
        return this.rankService.get(rankId);
    }

    @PostMapping(path = "", produces = "application/json")
    public void add(@RequestBody Rank rank) {
        this.rankService.add(rank);
    }

    @PatchMapping(path = "/{rankId}", produces = "application/json")
    public void set(@PathVariable Long rankId, @RequestBody Rank rank) {
        this.rankService.set(rank);
    }

    @DeleteMapping(path = "/{rankId}", produces = "application/json")
    public void remove(@PathVariable Long rankId) {
        this.rankService.remove(rankId);
    }

}
