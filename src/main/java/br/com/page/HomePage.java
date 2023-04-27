package br.com.page;

import static br.com.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.core.ReadProperties;

public class HomePage extends BasePage {

	private ReadProperties readProperties;

	public HomePage() {
		this.readProperties = new ReadProperties();
	}

	public void selectCombo() {
		dsl.selectCombo("switch-version-select", this.readProperties.getCombo());
	}

	public void clicarBotaoAddRecord() {
		dsl.clickLink("Add Record");
	}

	public void setNameSearch() {
		dsl.write(By.xpath("//input[@placeholder='Search CustomerName']"), this.readProperties.getName());
		WebDriverWait wait = new WebDriverWait(getDriver(),15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(.,'Teste Sicredi')]")));;
	}

	public void clickCheckBox() {
		dsl.clickCheck(By.xpath("//input[@class='select-row']"));
	}

	public void clickButtonDelete() {
		dsl.clickButton(By.xpath("//span[@class='text-danger' and .='Delete']"));
		WebDriverWait wait = new WebDriverWait(getDriver(),15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(., 'Are you sure that you want to delete this 1 item?')]")));;
		
	}

	public void clickButtonDeletePopUp() {
		WebDriverWait wait = new WebDriverWait(getDriver(),15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-danger delete-multiple-confirmation-button']")));;
		dsl.clickButton(By.xpath("//button[@class='btn btn-danger delete-multiple-confirmation-button']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(., 'Your data has been successfully deleted from the database.')]")));;
	}
}
