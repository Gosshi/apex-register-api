package gosshi.apexregisterapi.controller;

import gosshi.apexregisterapi.domain.Results;
import gosshi.apexregisterapi.domain.ResultsList;
import gosshi.apexregisterapi.service.ResultsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/results")
public class ResultsController {
    private static final Logger logger = LoggerFactory.getLogger(ResultsController.class);
    private ResultsService resultsService;

    public ResultsController() {

    }

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultsList find(@RequestParam(name = "resultsName", required = false) Long resultsId) {
        return this.resultsService.find(resultsId);
    }

    @GetMapping(path = "/{resultsId}", produces = "application/json")
    public Optional<Results> get(@PathVariable Long resultsId) {
        return this.resultsService.get(resultsId);
    }

    @PostMapping(path = "", produces = "application/json")
    public void add(@RequestBody Results results) {
        this.resultsService.add(results);
    }

    @PatchMapping(path = "/{resultsId}", produces = "application/json")
    public void set(@PathVariable Long resultsId, @RequestBody Results results) {
        this.resultsService.set(results);
    }

    @DeleteMapping(path = "/{resultsId}", produces = "application/json")
    public void remove(@PathVariable Long resultsId) {
        this.resultsService.remove(resultsId);
    }

}
