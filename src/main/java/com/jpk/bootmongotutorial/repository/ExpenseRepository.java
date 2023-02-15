package com.jpk.bootmongotutorial;

import com.jpk.bootmongotutorial.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
    public Expense findExpenseByName(String name);
}
