package com.statefarm.chatbot.service;

import com.statefarm.chatbot.common.pojo.DialogFlowReq;
import com.statefarm.chatbot.common.pojo.DialogFlowRes;
import com.statefarm.chatbot.common.pojo.SpeechToTextRequest;
import com.statefarm.chatbot.common.pojo.SpeechToTextRes;
import com.statefarm.chatbot.transulation.TransulationRequest;
import com.statefarm.chatbot.transulation.TransulationRestMapping;

public interface TransulationService {
	public abstract TransulationRestMapping getTheTextTransulated(TransulationRequest req);
	public abstract SpeechToTextRes getTextForSpeech(SpeechToTextRequest req);
	public abstract DialogFlowRes getDialogFlow(DialogFlowReq req);
	
}
