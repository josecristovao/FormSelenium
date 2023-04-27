package br.com.core;

import static br.com.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

	/********* Text ************/

	public void write(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void write(String id_campo, String texto) {
		write(By.id(id_campo), texto);
	}

	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}

	public String getText(String id) {
		return getText(By.id(id));
	}

	/********* Radio e Check ************/

	public void clickCheck(String id) {
		clickCheck(By.id(id));
	}

	public void clickCheck(By by) {
		getDriver().findElement(by).click();
	}

	/********* Combo ************/

	public void selectCombo(String id, String value) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(value);
	}

	/********* Button ************/

	public void clickButton(By by) {
		getDriver().findElement(by).click();
	}

	public void clickButton(String id) {
		clickButton(By.id(id));
	}

	/********* Link ************/

	public void clickLink(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}

}