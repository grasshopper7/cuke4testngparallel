package testngparallel;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class FirstNg {
	
	private long dur;
	
	@BeforeSuite
	public void befSuite() {
		//System.out.println("BEFORE SUITE " + System.currentTimeMillis());
		dur = System.currentTimeMillis();
	}
	
	@AfterSuite
	public void aftSuite() {
		//System.out.println("AFTER SUITE " + System.currentTimeMillis());
		dur = System.currentTimeMillis() - dur;
		System.out.println("DURATION - " + (dur/1000.00) + " secs");
	}

	/*@Test
	public void n1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("n1----" + Thread.currentThread().getId());
	}
	
	@Test
	public void n2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("n2----" + Thread.currentThread().getId());
	}
	
	@Test
	public void n3() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("n3----" + Thread.currentThread().getId());
	}
	
	@Test
	public void n4() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("n4----" + Thread.currentThread().getId());
	}*/
	
	@Test(dataProvider = "dp1", description="f one")
	public void f1(Integer n, String s) throws InterruptedException {
		System.out.println("DP FIR ----" + Thread.currentThread().getId() + "----" + System.currentTimeMillis());
		Thread.sleep(4000);
	}

	/*@Test(dataProvider = "dp2", description="f two")
	public void f2(Integer n, String s) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("f12----" + Thread.currentThread().getId() + "----" + n + "----" + s);
	}*/

	@DataProvider(parallel = true)
	public Object[][] dp1() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" },
				new Object[] { 4, "d" }};
	}
	
	/*@DataProvider(parallel = true)
	public Object[][] dp2() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" },
				new Object[] { 4, "d" }, new Object[] { 5, "e" }, new Object[] { 6, "f" }, new Object[] { 7, "g" },
				new Object[] { 8, "h" }, };
	}*/
}
