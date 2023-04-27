package br.com.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import br.com.core.BaseTeste;


public class TestForm  extends BaseTeste{
	
	@Test
	public void createNewRecord()   {
		pageHome.selectCombo();
		pageHome.clicarBotaoAddRecord();
		pageForm.setName();
		pageForm.setLastName();
		pageForm.setfirstName();
		pageForm.setPhone();
		pageForm.setAdressOne();
		pageForm.setAdressTwo();
		pageForm.setCity();
		pageForm.setState();
		pageForm.setPostalCode();
		pageForm.setCountry();
		pageForm.setEmployeeNumber();
		pageForm.setCreditLimit();
		pageForm.clickButtonSave();	
		assertEquals("Your data has been successfully stored into the database. Edit Record or Go back to list", dsl.getText(By.xpath("//p[.='Your data has been successfully stored into the database. Edit Record or Go back to list']")));
	}
	
	@Test
	public void recreateRecordAndDelete(){
		createNewRecord();
		pageForm.clickButtonGoBack();
		pageHome.setNameSearch();
		pageHome.clickCheckBox();
		pageHome.clickButtonDelete();
		assertEquals("Are you sure that you want to delete this 1 item?", dsl.getText(By.xpath("//p[contains(., 'Are you sure that you want to delete this 1 item?')]")));
		pageHome.clickButtonDeletePopUp();
		assertEquals("Your data has been successfully deleted from the database.", dsl.getText(By.xpath("//p[contains(., 'Your data has been successfully deleted from the database.')]")));
	}
}
