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
	public String detectedSourceLanguage;

	public TransulationRes() {
		super();
	}
	
	public TransulationRes(String translatedText, String detectedSourceLanguage) {
		super();
		this.translatedText = translatedText;
		this.detectedSourceLanguage = detectedSourceLanguage;
	}

	public String getDetectedSourceLanguage() {
		return detectedSourceLanguage;
	}

	public void setDetectedSourceLanguage(String detectedSourceLanguage) {
		this.detectedSourceLanguage = detectedSourceLanguage;
	}

	public String getTranslatedText() {
		return translatedText;
	}

	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}

	@Override
	public String toString() {
		return "TransulationRes [translatedText=" + translatedText + ", detectedSourceLanguage="
				+ detectedSourceLanguage + "]";
	}

}
