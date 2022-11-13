package com.statefarm.chatbot.service;

import com.statefarm.chatbot.transulation.TransulationRequest;
import com.statefarm.chatbot.transulation.TransulationRestMapping;

public interface TransulationService {
	public abstract TransulationRestMapping getTheTextTransulated(TransulationRequest req);
}
