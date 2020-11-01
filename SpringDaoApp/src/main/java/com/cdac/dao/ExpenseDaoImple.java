package com.cdac.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Expense;
@Repository
public class ExpenseDaoImple implements ExpenseDao{
		@Autowired
		private JdbcTemplate jdbcTemplate;
	public void insertExpense(Expense expense) {
		String q = " insert into expense(item_name,price,pur_date,user_id) values('"+expense.getItemName()+"',"+expense.getPrice()+","+expense.getPurchaseDate()+","+expense.getUserId()+")";
		System.out.println(q);
		jdbcTemplate.update(q);
		System.out.println("done");
	}

	public void deleteExpense(int expenseId) {
		String q = " delete from expense where expense_id = "+expenseId;
		System.out.println(q);
		jdbcTemplate.update(q);
		System.out.println("done");
	}

	
	public void updateExpense(Expense expense) {
		String q = " update expense set item_name ='"+expense.getItemName()+"', price = "+expense.getPrice()+", pur_date = "+expense.getPurchaseDate()+",where expense_id = "+expense.getExpenseId()+")";
		System.out.println(q);
		jdbcTemplate.update(q);
		System.out.println("done");
	}

	public List<Expense> selectAll(int userId) {
		List<Expense> list = jdbcTemplate.query("select * from expense where user_id = "+userId, new ResultSetExtractor<List<Expense>>() {
			
			public List<Expense> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Expense> li = new ArrayList<Expense>();
				while(rs.next()) {
					Expense expense = new Expense();
					expense.setExpenseId(rs.getInt("expense_id"));
					expense.setItemName(rs.getString("item_name"));
					expense.setPrice(rs.getFloat("price"));
					expense.setPurchaseDate(rs.getString("pur_date"));
					li.add(expense);
				}
				return li;
			}
		});
		return list;
	}

	public Expense selectExpense(int expenseId) {
	Expense expense = jdbcTemplate.query("select * from expwnse where expense_id = "+expenseId, new ResultSetExtractor<Expense>() {

			public Expense extractData(ResultSet rs) throws SQLException, DataAccessException {
				Expense expense = new Expense();
				expense.setExpenseId(rs.getInt("expense_id"));
				expense.setItemName(rs.getString("item_name"));
				expense.setPrice(rs.getFloat("price"));
				expense.setPurchaseDate(rs.getString("pur_date"));
			
				return expense;
			}
		});
		return expense;
	}

	

}
