package com.metu.ceng.webinar.service.impl;

import org.springframework.stereotype.Service;

import com.metu.ceng.webinar.FeatureProperties;
import com.metu.ceng.webinar.service.PassPresenterService;

@Service
public class PassPresenterServiceImpl implements PassPresenterService {

	private String serviceName = "passPresenter";
	private int status = 0;
	
	
	public PassPresenterServiceImpl(FeatureProperties featureProperties) {
		for (int i = 0; i < featureProperties.getFeatures().size(); i++) {
			if(featureProperties.getFeatures().get(i).getFeature().equals(serviceName)){
				status = featureProperties.getFeatures().get(i).getStatus();
				break;
			}
		}
	}
	
	@Override
	public int getStatus() {
		return status;
		
	}

	@Override
	public void setStatus(int status) {
		this.status = status;
	}

}
