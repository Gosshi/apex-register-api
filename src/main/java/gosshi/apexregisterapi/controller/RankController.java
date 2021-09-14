package gosshi.apexregisterapi.controller;

import gosshi.apexregisterapi.domain.Rank;
import gosshi.apexregisterapi.domain.RankList;
import gosshi.apexregisterapi.service.RankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/rank")
public class RankController {
    private static final Logger logger = LoggerFactory.getLogger(RankController.class);
    private RankService rankService;

    public RankController(RankService rankService) {
        this.rankService = rankService;
    }

    @GetMapping(path = "find", produces = MediaType.APPLICATION_JSON_VALUE)
    public RankList find() {
        return this.rankService.find();
    }

    @GetMapping(path = "get")
    public Optional<Rank> get(@RequestParam Long rankId) {
        return this.rankService.get(rankId);
    }

    @PostMapping(path = "add")
    public void add(@RequestBody String rankName) {
        Rank rank = new Rank();
        rank.setRankName(rankName);
        rank.setDeleteFlag(false);
        this.rankService.add(rank);
    }

    @PatchMapping(path = "update", produces = "application/json")
    public void set(@RequestBody Rank rank) {
        this.rankService.set(rank);
    }

    @DeleteMapping(path = "delete/{rankId}")
    public void remove(@PathVariable Long rankId) {
        this.rankService.remove(rankId);
    }

}
