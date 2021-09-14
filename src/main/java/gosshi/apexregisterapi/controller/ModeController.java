package gosshi.apexregisterapi.controller;


import gosshi.apexregisterapi.domain.Mode;
import gosshi.apexregisterapi.domain.ModeList;
import gosshi.apexregisterapi.service.ModeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/mode")
public class ModeController {
    private static final Logger logger = LoggerFactory.getLogger(ModeController.class);
    private ModeService modeService;

    public ModeController() {
    }

    @GetMapping(path = "", produces = "application/json")
    public ModeList find(@RequestParam(name = "modeName", required = false) String modeName) {
        return this.modeService.find(modeName);
    }


    @GetMapping(path = "/{modeId}", produces = "application/json")
    public Optional<Mode> get(@PathVariable Long modeId) {
        return this.modeService.get(modeId);
    }

    @PostMapping(path = "", produces = "application/json")
    public void add(@RequestBody Mode mode) {
        this.modeService.add(mode);
    }

    @PatchMapping(path = "/{modeId}", produces = "application/json")
    public void set(@PathVariable Long modeId, @RequestBody Mode mode) {
        this.modeService.set(mode);
    }

    @DeleteMapping(path = "/{modeId}", produces = "application/json")
    public void remove(@PathVariable Long modeId) {
        this.modeService.remove(modeId);
    }

}
