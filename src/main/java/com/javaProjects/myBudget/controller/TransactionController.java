package com.javaProjects.myBudget.controller;

import com.javaProjects.myBudget.dto.TransactionTypesDTO;
import com.javaProjects.myBudget.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping ("/listTransactionTypes")
    public String listTransactionTypes (Model model) {
        List<TransactionTypesDTO> transactionTypesDTOList = transactionService.getAllTransactionTypes();
        model.addAttribute("list", transactionTypesDTOList);
        return "listTransactionTypesPage";
    }

    @GetMapping ("/listInTransactions")
    public String listInTransactions (Model model) {
        List<TransactionTypesDTO> transactionTypesDTOList = transactionService.getAllInTransactions();
        model.addAttribute("list", transactionTypesDTOList);
        return "listInTransactionsPage";
    }

    @GetMapping ("/listOutTransactions")
    public String listOutTransactions (Model model) {
        List<TransactionTypesDTO> transactionTypesDTOList = transactionService.getAllOutTransactions();
        model.addAttribute("list", transactionTypesDTOList);
        return "listOutTransactionsPage";
    }
}
