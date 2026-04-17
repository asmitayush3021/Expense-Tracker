package com.expensetracker.controller;

import com.expensetracker.dto.*;
import com.expensetracker.service.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {


    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @PostMapping
    public ExpenseResponseDTO addExpense(@Valid @RequestBody ExpenseRequestDTO dto) {
        return service.addExpense(dto);
    }

    @GetMapping
    public List<ExpenseResponseDTO> getAllExpenses() {
        return service.getAllExpenses();
    }

    @GetMapping("/{id}")
    public ExpenseResponseDTO getExpense(@PathVariable Long id) {
        return service.getExpenseById(id);
    }

    @PutMapping("/{id}")
    public ExpenseResponseDTO updateExpense(@PathVariable Long id,
                                            @Valid @RequestBody ExpenseRequestDTO dto) {
        return service.updateExpense(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable Long id) {
        service.deleteExpense(id);
        return "Expense deleted successfully";
    }
}