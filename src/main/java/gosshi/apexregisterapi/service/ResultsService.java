package gosshi.apexregisterapi.service;


import gosshi.apexregisterapi.domain.Results;
import gosshi.apexregisterapi.domain.ResultsList;
import gosshi.apexregisterapi.repository.ResultsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResultsService {
    private static final Logger logger = LoggerFactory.getLogger(ResultsService.class);
    private ResultsRepository repository;

    public ResultsService(ResultsRepository repository){
        this.repository = repository;
    }

    public ResultsList find() {
        ResultsList resultsList = new ResultsList();
        resultsList.setResults(this.repository.findAll());
        return resultsList;
    }

    public Optional<Results> get(Long resultsId) {
        return this.repository.findById(resultsId);
    }


    public void add(Results results) {
        this.repository.save(results);
    }


    public void set(Results results) {
        this.repository.save(results);
    }

    public void remove(Long resultsId) {
        this.repository.deleteById(resultsId);
    }
}
