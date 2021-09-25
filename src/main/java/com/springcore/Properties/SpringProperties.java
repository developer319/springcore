package com.springcore.Properties;

import java.util.Properties;

public class SpringProperties {

	private Properties prop;

	public SpringProperties() {
		super();
	}

	public SpringProperties(Properties prop) {
		super();
		this.prop = prop;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "SpringProperties [prop=" + prop + "]";
	}
}
