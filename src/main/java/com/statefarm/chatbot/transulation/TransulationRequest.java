package com.statefarm.chatbot.transulation;

/**
 * 
 * @author navaneethkumarbuddi
 *
 */
public class TransulationRequest {
	private String q;
	private String target;
	private String alt;
	private String source;

	public TransulationRequest() {
		super();
	}

	public TransulationRequest(String q, String target, String alt, String source) {
		super();
		this.q = q;
		this.target = target;
		this.alt = alt;
		this.source = source;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "TransulationRequest [q=" + q + ", target=" + target + ", alt=" + alt + ", source=" + source + "]";
	}

}
