package com.metu.ceng.webinar;

import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
public class Feature {

	private final String feature;
	private final int status;

	Feature(int status, String feature) {
		this.status = status;
		this.feature = feature;
	}
	
	public int getStatus() {
		return status;
	}

	public String getFeature() {
		return feature;
	}

}
