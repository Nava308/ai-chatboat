package com.statefarm.chatbot.transulation;

import java.io.Serializable;

import com.statefarm.chatbot.common.pojo.ServerStatusResponsePojo;

/**
 * 
 * @author navaneethkumarbuddi
 *
 */
public class TransulationRestMapping implements Serializable {
	private static final long serialVersionUID = 1L;
	public TransulationRestRes data;
	private ServerStatusResponsePojo serverRes;

	public TransulationRestMapping() {
		super();
	}

	public TransulationRestMapping(TransulationRestRes data) {
		super();
		this.data = data;
	}

	public TransulationRestMapping(TransulationRestRes data, ServerStatusResponsePojo serverRes) {
		super();
		this.data = data;
		this.serverRes = serverRes;
	}

	public ServerStatusResponsePojo getServerRes() {
		return serverRes;
	}

	public void setServerRes(ServerStatusResponsePojo serverRes) {
		this.serverRes = serverRes;
	}

	public TransulationRestRes getData() {
		return data;
	}

	public void setData(TransulationRestRes data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TransulationRestMapping [data=" + data + ", serverRes=" + serverRes + "]";
	}

}
