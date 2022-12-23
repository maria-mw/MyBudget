package com.javaProjects.myBudget.services;

import com.javaProjects.myBudget.dto.TransactionTypesDTO;
import com.javaProjects.myBudget.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepositoryService transactionRepositoryService;

    public List<TransactionTypesDTO> getAllTransactionTypes () {
        return (transactionRepositoryService
                .findAll())
                .stream()
                .map(this::convertToTransactionTypesDTO)
                .collect(Collectors.toList());
    }

    private TransactionTypesDTO convertToTransactionTypesDTO (Transaction transaction) {
        TransactionTypesDTO transactionTypesDTO = new TransactionTypesDTO();
        transactionTypesDTO.setId(transaction.getId());
        transactionTypesDTO.setDate(transaction.getDate());
        transactionTypesDTO.setSum(transaction.getSum());
        transactionTypesDTO.setDescription(transaction.getDescription());
        transactionTypesDTO.setType(transaction.getSubCategory().getCategory().getType().getTitle());
        return transactionTypesDTO;
    }

    public List<TransactionTypesDTO> getAllInTransactions() {
        return (transactionRepositoryService
                .findAll())
                .stream()
                .map(this::convertToTransactionTypesDTO)
                .filter(c -> c.getType().equals("зачисление"))
                .collect(Collectors.toList());
    }

    public List<TransactionTypesDTO> getAllOutTransactions() {
        return (transactionRepositoryService
                .findAll())
                .stream()
                .map(this::convertToTransactionTypesDTO)
                .filter(c -> c.getType().equals("списание"))
                .collect(Collectors.toList());
    }

}
