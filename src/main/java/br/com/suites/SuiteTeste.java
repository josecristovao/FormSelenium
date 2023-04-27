package br.com.suites;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import br.com.core.DriverFactory;
import br.com.test.TestForm;


@RunWith(Suite.class)
@SuiteClasses({
	TestForm.class
	
	
})
public class SuiteTeste {

	@AfterClass
	public static void tearDown() {
		DriverFactory.killDriver();
	}
}