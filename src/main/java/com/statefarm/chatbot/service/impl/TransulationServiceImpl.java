package com.statefarm.chatbot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.statefarm.chatbot.common.pojo.DialogFlowReq;
import com.statefarm.chatbot.common.pojo.DialogFlowRes;
import com.statefarm.chatbot.common.pojo.ServerStatusResponsePojo;
import com.statefarm.chatbot.common.pojo.SpeechToTextRequest;
import com.statefarm.chatbot.common.pojo.SpeechToTextRes;
import com.statefarm.chatbot.service.TransulationService;
import com.statefarm.chatbot.transulation.TransulationRequest;
import com.statefarm.chatbot.transulation.TransulationRestMapping;

@Service
public class TransulationServiceImpl implements TransulationService {
	public static final Logger log = LoggerFactory.getLogger(TransulationServiceImpl.class);

	@Override
	public TransulationRestMapping getTheTextTransulated(TransulationRequest req) {
		TransulationRestMapping res = new TransulationRestMapping();
		ServerStatusResponsePojo serverRes = new ServerStatusResponsePojo();
		try {
			RestTemplate restTemplate = new RestTemplate();
			String url = "https://translation.googleapis.com/language/translate/v2?key=AIzaSyBvC4ANk0PMYNZppsBv4DJ0dtxZ05gOS4U";
			res = restTemplate.postForObject(url, req, TransulationRestMapping.class);

		} catch (Exception e) {
			log.error("Exception occured while making the API call to the google API" + e.getMessage());
			serverRes.setErrorMessage("Error occured while making the API call to the google API");
			serverRes.setResponseCode(500);
			serverRes.setSuccess(false);
			res.setServerRes(serverRes);
			return res;
		}
		serverRes.setErrorMessage("SUCCESS");
		serverRes.setResponseCode(200);
		serverRes.setSuccess(true);
		res.setServerRes(serverRes);
		return res;
	}

	@Override
	public SpeechToTextRes getTextForSpeech(SpeechToTextRequest req) {
		SpeechToTextRes res = new SpeechToTextRes();
		ServerStatusResponsePojo serverRes = new ServerStatusResponsePojo();
		try {
			RestTemplate restTemplate = new RestTemplate();
			String url = "https://speech.googleapis.com/v1/speech:recognize?key=AIzaSyBvC4ANk0PMYNZppsBv4DJ0dtxZ05gOS4U";
			res = restTemplate.postForObject(url, req, SpeechToTextRes.class);

		} catch (Exception e) {
			log.error("Exception occured while making the API call to the google API" + e.getMessage());
			serverRes.setErrorMessage("Error occured while making the API call to the google API");
			serverRes.setResponseCode(500);
			serverRes.setSuccess(false);
			res.setServerRes(serverRes);
			return res;
		}
		serverRes.setErrorMessage("SUCCESS");
		serverRes.setResponseCode(200);
		serverRes.setSuccess(true);
		res.setServerRes(serverRes);
		return res;
	}

	@Override
	public DialogFlowRes getDialogFlow(DialogFlowReq req) {
		String accessToken = "ya29.a0Ael9sCOkKlBmw2v20P2xpUCgnCz5Yel7LOeSmKaDqpwYhxbB6RpiHvdQECTlAdyRtHmo5sED3cRK_hCigPd_7j1JxHR2BFSGz3OB2F-DoD8o1io11EqQWeHya83f40Z0r2J3jBSRGFYBcRYOygqn3IWuSwmFoAaCgYKATUSARISFQF4udJhX9TYkbo3Rb7ewXAybbNSgw0165";
		DialogFlowRes res = new DialogFlowRes();
		ServerStatusResponsePojo serverRes = new ServerStatusResponsePojo();
		try {
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", "Bearer " + accessToken);
			HttpEntity<DialogFlowReq> requestEntity = new HttpEntity<>(req, headers);
			String url = "https://dialogflow.googleapis.com/v2/projects/webassistant-aegd/agent/sessions/1234:detectIntent";
			res = restTemplate.postForObject(url, requestEntity, DialogFlowRes.class);
			System.out.println(res);

		} catch (Exception e) {
			log.error("Exception occured while making the API call to the google API" + e.getMessage());
			serverRes.setErrorMessage("Error occured while making the API call to the google API");
			serverRes.setResponseCode(500);
			serverRes.setSuccess(false);
			res.setServerRes(serverRes);
			return res;
		}
		serverRes.setErrorMessage("SUCCESS");
		serverRes.setResponseCode(200);
		serverRes.setSuccess(true);
		res.setServerRes(serverRes);
		return res;
	}

}
