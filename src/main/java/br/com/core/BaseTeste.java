package br.com.core;

import static br.com.core.DriverFactory.getDriver;
import static br.com.core.DriverFactory.killDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import br.com.page.FormPage;
import br.com.page.HomePage;

public class BaseTeste {

	protected FormPage pageForm;
	protected HomePage pageHome;
	protected DSL dsl;

	@Before
	public void setup() {
		getDriver().get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
		pageHome = new HomePage();
		pageForm = new FormPage();
		dsl = new DSL();
	}

	@Rule
	public TestName testName = new TestName();

	@After
	public void tearDown() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File archive = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(archive, new File(
				"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));

		if (Properties.CLOSE_BROWSER) {
			killDriver();
		}
	}
}
