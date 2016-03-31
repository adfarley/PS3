package testbase;
import java.util.Date;
import static org.junit.Assert.*;
import base.Account;
import Exceptions.InsufficientFundsException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Exceptions.InsufficientFundsException;

public class AccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AccountTest() {
	Account testaccount = new Account(1122, 20000, 4.5);
	testaccount.withdraw(2500);
	testaccount.deposit(3000);
	
	System.out.println("the balance is "+ testaccount.getBalance());
	System.out.println("the monthly interest is " + testaccount.getMonthlyInterestRate());
	System.out.println("the account was created on " + testaccount.getDateCreated());
	}
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException {
		Account c = new Account(101,0,4.5);
		c.deposit(500.00);
		assertEquals("$400 Expected, actual is $500",(long)c.getBalance(),(long)500.00);
        c.withdraw(900);
	}
}
