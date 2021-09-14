package gosshi.apexregisterapi.service;


import gosshi.apexregisterapi.domain.Account;
import gosshi.apexregisterapi.domain.AccountList;
import gosshi.apexregisterapi.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    private static final Logger logger = LoggerFactory.getLogger(AccountService.class);
    private AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public AccountList find() {
        AccountList accountList = new AccountList();
        accountList.setAccounts(this.repository.findAll());
        return accountList;
    }

    public Optional<Account> get(Long accountId) {
        return this.repository.findById(accountId);
    }


    public void add(Account account) {
        this.repository.save(account);
    }


    public void set(Account account) {
        this.repository.save(account);
    }


    public void remove(Long accountId) {
        this.repository.deleteById(accountId);
    }

}
