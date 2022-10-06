package com.metu.ceng.webinar.service;

public interface ChatMessagingService{

	public abstract int getStatus();
	public abstract void setStatus(int status); // 0: INACTIVE, 1:ACTIVE
	
}
