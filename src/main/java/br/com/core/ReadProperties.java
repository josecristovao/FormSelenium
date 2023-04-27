package br.com.core;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {

	private Properties properties;
	private FileInputStream fileInputStreamFactories;

	public ReadProperties() {

		this.properties = new Properties();

		try {
			this.fileInputStreamFactories = new FileInputStream(

					System.getProperty("user.dir") + "/src/test/resources/factories.properties");

			this.properties.load(this.fileInputStreamFactories);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public String getCombo() {

		return this.properties.getProperty("combo");
	}

	public String getName() {

		return this.properties.getProperty("name");
	}

	public String getLastName() {

		return this.properties.getProperty("lastName");
	}

	public String getFirstName() {

		return this.properties.getProperty("firstName");
	}

	public String getPhone() {

		return this.properties.getProperty("phone");
	}

	public String getAdressOne() {

		return this.properties.getProperty("adressOne");
	}

	public String getAdressTwo() {

		return this.properties.getProperty("adressTwo");
	}

	public String getCity() {

		return this.properties.getProperty("city");
	}

	public String getState() {

		return this.properties.getProperty("state");
	}

	public String getPostalCode() {

		return this.properties.getProperty("postalCode");
	}

	public String getEmployeeNumber() {

		return this.properties.getProperty("employeeNumber");
	}

	public String getCountry() {

		return this.properties.getProperty("country");
	}

	public String getCreditLimit() {

		return this.properties.getProperty("creditLimit");
	}
}