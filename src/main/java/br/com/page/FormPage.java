package br.com.page;

import static br.com.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.core.BasePage;
import br.com.core.ReadProperties;

public class FormPage extends BasePage {
	
	private ReadProperties readProperties;
	
	public FormPage() {
		this.readProperties = new ReadProperties();
	}
	
	public void setName() {
		dsl.write("field-customerName", this.readProperties.getName());

	}

	public void setLastName() {
		dsl.write("field-contactLastName", this.readProperties.getLastName());

	}

	public void setfirstName() {
		dsl.write("field-contactFirstName", this.readProperties.getFirstName());

	}

	public void setPhone() {
		dsl.write("field-phone", this.readProperties.getPhone());

	}

	public void setAdressOne() {
		dsl.write("field-addressLine1", this.readProperties.getAdressOne());

	}

	public void setAdressTwo() {
		dsl.write("field-addressLine2", this.readProperties.getAdressTwo());

	}

	public void setCity() {
		dsl.write("field-city", this.readProperties.getCity());

	}

	public void setState() {
		dsl.write("field-state", this.readProperties.getState());

	}

	public void setPostalCode() {
		dsl.write("field-postalCode", this.readProperties.getPostalCode());

	}

	public void setCountry() {
		dsl.write("field-country", this.readProperties.getCountry());

	}

	public void setEmployeeNumber() {
		dsl.write("field-salesRepEmployeeNumber", this.readProperties.getEmployeeNumber());

	}

	public void setCreditLimit() {
		dsl.write("field-creditLimit", this.readProperties.getCreditLimit());

	}

	public void clickButtonSave() {
		dsl.clickButton("form-button-save");
		WebDriverWait wait = new WebDriverWait(getDriver(),15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Edit Record')]")));;
	}

	public void clickButtonGoBack() {
		dsl.clickLink("Go back to list");
	}
}
