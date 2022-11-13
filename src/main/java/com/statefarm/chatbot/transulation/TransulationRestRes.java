package com.statefarm.chatbot.transulation;

import java.util.ArrayList;

public class TransulationRestRes {
	private ArrayList<TransulationRes> translations = new ArrayList<>();

	public ArrayList<TransulationRes> getTranslations() {
		return translations;
	}

	public TransulationRestRes() {
		super();
	}

	public TransulationRestRes(ArrayList<TransulationRes> translations) {
		super();
		this.translations = translations;
	}

	public void setTranslations(ArrayList<TransulationRes> translations) {
		this.translations = translations;
	}

	@Override
	public String toString() {
		return "TransulationRestRes [translations=" + translations + "]";
	}

}
