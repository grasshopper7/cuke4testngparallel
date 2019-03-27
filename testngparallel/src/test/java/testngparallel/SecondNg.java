package testngparallel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondNg {

	@Test(dataProvider = "dp22", description="f two")
	public void f22(Integer n, String s) throws InterruptedException {
		System.out.println("DP SEC ----" + Thread.currentThread().getId() + "----" + System.currentTimeMillis());
		Thread.sleep(4000);
	}

	@DataProvider(parallel = true)
	public Object[][] dp22() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" },
				new Object[] { 4, "d" }};
	}
	
}
