package com.cognizant.account;


import com.cognizant.account.model.Loan;

import java.util.ArrayList;
import java.util.List;

public class LoanData {

    public static List<Loan> getLoans() {
        List<Loan> loans = new ArrayList<>();

        loans.add(new Loan("H00987987972342", "car", 400000, 3258, 18));
        loans.add(new Loan("H00112233445566", "home", 1200000, 10234, 120));

        return loans;
    }
}

