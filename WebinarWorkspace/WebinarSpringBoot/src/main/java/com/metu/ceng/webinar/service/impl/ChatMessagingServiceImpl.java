package com.metu.ceng.webinar.service.impl;

import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.metu.ceng.webinar.FeatureProperties;
import com.metu.ceng.webinar.service.ChatMessagingService;

@Service
public class ChatMessagingServiceImpl implements ChatMessagingService {

	private String serviceName = "chatMessaging";
	private int status = 0;
	
	
	public ChatMessagingServiceImpl(FeatureProperties featureProperties) {
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
