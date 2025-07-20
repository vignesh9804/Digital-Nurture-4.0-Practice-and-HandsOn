package com.cognizant.account.controller;

import com.cognizant.account.LoanData;
import com.cognizant.account.model.Loan;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class LoanController {

    @GetMapping("loans/{number}")
    public Loan getLoanByNumber(@PathVariable String number) {
        List<Loan> loans = LoanData.getLoans();

        for (Loan loan : loans) {
            if (loan.getNumber().equals(number)) {
                return loan;
            }
        }
        return null;
    }
}
