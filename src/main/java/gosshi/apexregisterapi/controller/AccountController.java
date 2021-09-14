package gosshi.apexregisterapi.controller;


import gosshi.apexregisterapi.domain.Account;
import gosshi.apexregisterapi.domain.AccountList;
import gosshi.apexregisterapi.repository.AccountRepository;
import gosshi.apexregisterapi.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/account")
public class AccountController {
    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
    private AccountService accountService;
    private AccountRepository accountRepository;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(path = "find", produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountList find() {
        return this.accountService.find();
    }

    @GetMapping(path = "get")
    public Optional<Account> get(@RequestParam Long accountId) {
        return this.accountService.get(accountId);
    }

    @PostMapping(path = "add")
    public void add(@RequestParam String accountName, @RequestParam String password, @RequestParam Boolean administratorFlag) {
        Account account = new Account();
        account.setAccountName(accountName);
        account.setPassword(password);
        account.setAdministerFlag(administratorFlag);
        account.setDeleteFlag(false);
        this.accountService.add(account);
    }

    @PatchMapping(path = "update", produces = "application/json")
    public void set(@RequestBody Account account) {
        this.accountService.set(account);
    }

    @DeleteMapping(path = "delete/{accountId}")
    public void remove(@PathVariable Long accountId) {
        this.accountService.remove(accountId);
    }

}
