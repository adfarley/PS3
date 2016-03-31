package base;
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		
	}
	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	public void withdraw(double withdrawAmount) {
		this.balance = balance - withdrawAmount;
	}
	public void deposit(double depositAmount) {
		this.balance = balance + depositAmount;
	}
}