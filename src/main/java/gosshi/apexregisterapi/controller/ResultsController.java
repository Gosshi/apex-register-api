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

    public ResultsController(ResultsService resultsService) {
        this.resultsService = resultsService;

    }

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultsList find() {
        return this.resultsService.find();
    }

    @GetMapping(path = "get")
    public Optional<Results> get(@RequestBody Long resultsId) {
        return this.resultsService.get(resultsId);
    }

    @PostMapping(path = "add")
    public void add(@RequestBody Results results) {
        this.resultsService.add(results);
    }

    @PatchMapping(path = "update", produces = "application/json")
    public void set(@RequestBody Results results) {
        this.resultsService.set(results);
    }

    @DeleteMapping(path = "delete/{resultId}")
    public void remove(@PathVariable Long resultsId) {
        this.resultsService.remove(resultsId);
    }

}
