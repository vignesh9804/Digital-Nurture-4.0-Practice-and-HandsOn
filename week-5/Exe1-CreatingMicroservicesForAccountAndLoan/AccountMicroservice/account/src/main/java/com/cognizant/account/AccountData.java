package com.cognizant.account;

import java.util.ArrayList;
import java.util.List;

public class AccountData {

    public static List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account("00987987973432", "savings", 234343));
        accounts.add(new Account("00112233445566", "current", 500000));

        return accounts;
    }
}

