package com.example.library.repo.impl;

import com.example.library.model.Loan;
import com.example.library.repo.LoanRepository;

import java.util.*;
import java.util.stream.Collectors;

public class InMemoryLoanRepository implements LoanRepository {
    private final List<Loan> loans = new ArrayList<>();
    @Override public void add(Loan loan) { loans.add(loan); }
    @Override public List<Loan> forUser(String userId) {
        return loans.stream().filter(l -> l.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
