package gosshi.apexregisterapi.service;


import gosshi.apexregisterapi.domain.Rank;
import gosshi.apexregisterapi.domain.RankList;
import gosshi.apexregisterapi.repository.RankRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RankService {
    private static final Logger logger = LoggerFactory.getLogger(RankService.class);
    private RankRepository repository;

    public RankService(RankRepository repository){
        this.repository = repository;
    }

    public RankList find() {
        RankList rankList = new RankList();
        rankList.setRank(this.repository.findAll());
        return rankList;
    }


    public Optional<Rank> get(Long rankId) {
        return this.repository.findById(rankId);
    }


    public void add(Rank rank) {
        this.repository.save(rank);
    }


    public void set(Rank rank) {
        this.repository.save(rank);
    }


    public void remove(Long rankId) {
        this.repository.deleteById(rankId);
    }
}
