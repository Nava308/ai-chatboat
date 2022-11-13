package com.statefarm.chatbot.common.pojo;

import java.io.Serializable;
import java.util.ArrayList;

import com.statefarm.chatbot.transulation.TransulationRes;

/**
 * 
 * @author navaneethkumarbuddi
 *
 */
public class TransulationApiRes implements Serializable {

	private static final long serialVersionUID = 1L;

	private ArrayList<TransulationRes> translations = new ArrayList<>();

	private ServerStatusResponsePojo serverRes;

	public TransulationApiRes() {
		super();
	}

	public TransulationApiRes(ArrayList<TransulationRes> translations, ServerStatusResponsePojo serverRes) {
		super();
		this.translations = translations;
		this.serverRes = serverRes;
	}

	public ArrayList<TransulationRes> getTranslations() {
		return translations;
	}

	public void setTranslations(ArrayList<TransulationRes> translations) {
		this.translations = translations;
	}

	public ServerStatusResponsePojo getServerRes() {
		return serverRes;
	}

	public void setServerRes(ServerStatusResponsePojo serverRes) {
		this.serverRes = serverRes;
	}

	@Override
	public String toString() {
		return "TransulationApiRes [translations=" + translations + ", serverRes=" + serverRes + "]";
	}

}
