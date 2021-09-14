package gosshi.apexregisterapi.service;

import gosshi.apexregisterapi.domain.Mode;
import gosshi.apexregisterapi.domain.ModeList;
import gosshi.apexregisterapi.repository.ModeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ModeService {
    private static final Logger logger = LoggerFactory.getLogger(ModeService.class);
    private ModeRepository repository;

    public ModeList find(String modeName) {
        ModeList modeList = new ModeList();
        modeList.setMode(this.repository.findAll());
        return modeList;
    }


    public Optional<Mode> get(Long modeId) {
        return this.repository.findById(modeId);
    }


    public void add(Mode mode) {
        this.repository.save(mode);
    }


    public void set(Mode mode) {
        this.repository.save(mode);
    }


    public void remove(Long modeId) {
        this.repository.deleteById(modeId);
    }
}
