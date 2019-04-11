package com.Go_Jek.Amazon.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {
	private Properties properties;

	private String url;
	private String userName;

	private String password;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void ReadProperty() throws IOException {

		String propertyFilePath = System.getProperty("user.dir") + "\\src\\resources\\config.properties";
		this.properties = new Properties();
		InputStream input;
		try {
			input = new FileInputStream(propertyFilePath);
			this.properties.load(input);
			this.setUrl(properties.getProperty("url"));
			this.setUserName(properties.getProperty("Username"));
			this.setPassword(properties.getProperty("Password"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
