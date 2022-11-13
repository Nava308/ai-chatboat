package com.statefarm.chatbot.transulation;

import java.io.Serializable;

/**
 * 
 * @author navaneethkumarbuddi
 *
 */
public class TransulationRes implements Serializable {

	private static final long serialVersionUID = 1L;
	public String translatedText;

	public TransulationRes() {
		super();
	}

	public TransulationRes(String translatedText) {
		super();
		this.translatedText = translatedText;
	}

	public String getTranslatedText() {
		return translatedText;
	}

	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}

	@Override
	public String toString() {
		return "TransulationRes [translatedText=" + translatedText + "]";
	}

}
