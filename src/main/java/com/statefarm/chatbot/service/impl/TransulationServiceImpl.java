package com.statefarm.chatbot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.statefarm.chatbot.common.pojo.ServerStatusResponsePojo;
import com.statefarm.chatbot.common.pojo.TransulationApiRes;
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
			String url = "https://translation.googleapis.com/language/translate/v2?key=AIzaSyCTk529HcSlUQLfwpsON72gHlJtPnOUHO4";
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

}
