package com.solera.bankbackend.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private double balance;

    @ManyToOne
    private User user;
    @OneToMany
    private List<Transaction> transactionList;
}
