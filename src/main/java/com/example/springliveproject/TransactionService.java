package com.example.springliveproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(int accountNumber) {
        ArrayList<Transaction> list = new ArrayList<>();
        list.add(new Transaction("credit", 1234567, "USD", 100.00, "acme", "acme.png"));
        return list;
    }
}
