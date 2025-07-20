package com.cognizant.account.controller;

import com.cognizant.account.Account;
import com.cognizant.account.AccountData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AccountController {
    @GetMapping("accounts/{number}")
    public Account getAccountByNumber(@PathVariable String number) {
        List<Account> accounts = AccountData.getAccounts();

        for (Account account : accounts) {
            if (account.getNumber().equals(number)) {
                return account;
            }
        }
        return null;
    }
}
