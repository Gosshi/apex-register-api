package gosshi.apexregisterapi.controller;


import gosshi.apexregisterapi.domain.Mode;
import gosshi.apexregisterapi.domain.ModeList;
import gosshi.apexregisterapi.repository.ModeRepository;
import gosshi.apexregisterapi.service.MapService;
import gosshi.apexregisterapi.service.ModeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/mode")
public class ModeController {
    private static final Logger logger = LoggerFactory.getLogger(ModeController.class);
    private final ModeService modeService;
    private ModeRepository modeRepository;

    public ModeController(ModeService modeService) {
        this.modeService = modeService;
    }

    @GetMapping(path = "find", produces = MediaType.APPLICATION_JSON_VALUE)
    public ModeList find() {
        return this.modeService.find();
    }


    @GetMapping(path = "get")
    public Optional<Mode> get(@RequestParam Long modeId) {
        return this.modeService.get(modeId);
    }

    @PostMapping(path = "add")
    public void add(@RequestParam String modeName) {
        Mode mode = new Mode();
        mode.setModeName(modeName);
        mode.setDeleteFlag(false);
        this.modeService.add(mode);
    }

    @PatchMapping(path = "update", produces = "application/json")
    public void set(@RequestBody Mode mode) {
        this.modeService.set(mode);
    }

    @DeleteMapping(path = "delete/{modeId}", produces = "application/json")
    public void remove(@PathVariable Long modeId) {
        this.modeService.remove(modeId);
    }

}
