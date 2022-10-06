package com.metu.ceng.webinar;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("static")
public class FeatureProperties {


	private final List<Feature> features;

	public FeatureProperties(List<Feature> features) {
		this.features = features;
	}

	public List<Feature> getFeatures(){
		return this.features;
	}

}
