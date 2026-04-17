package com.expensetracker.service;

import com.expensetracker.dto.*;

import java.util.List;

public interface ExpenseService {

    ExpenseResponseDTO addExpense(ExpenseRequestDTO dto);

    List<ExpenseResponseDTO> getAllExpenses();

    ExpenseResponseDTO getExpenseById(Long id);

    ExpenseResponseDTO updateExpense(Long id, ExpenseRequestDTO dto);

    void deleteExpense(Long id);
}