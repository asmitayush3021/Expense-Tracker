package com.expensetracker.dto;

import lombok.*;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class ExpenseResponseDTO {

    private Long id;
    private String title;
    private double amount;
    private String category;
    private LocalDate date;
    private String description;
    // Getters & Setters
}