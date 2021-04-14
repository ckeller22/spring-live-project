package com.example.springliveproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TransactionServiceTests {

    TransactionService transactionService = new TransactionService();

    @Test
    public void transactionServiceTest() {

        assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());

    }

}
