package com.abiramim.springexpensetracker.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.springexpensetracker.models.Expense;
import com.sathish.springexpensetracker.models.User;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	public List<Expense> findByCreatedAtBetween(String startCreatedAt,String endCreatedAt);
	public List<Expense> findByUserAndCreatedAtBetween(User user, String startCreatedAt, String endCreatedAt);
	public void deleteByUserAndId(User user,Long id);
}
