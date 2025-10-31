package com.example.library.repo;

import com.example.library.model.Loan;

public interface LoanRepository
{
    void add(Loan loan);

    java.util.List<Loan> forUser(String userId);
}
