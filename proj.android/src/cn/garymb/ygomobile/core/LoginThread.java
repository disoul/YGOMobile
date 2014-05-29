package cn.garymb.ygomobile.core;

import org.apache.http.client.HttpClient;

import cn.garymb.ygomobile.core.IBaseConnection.TaskStatusCallback;
import cn.garymb.ygomobile.net.http.BaseHttpConnector;
import cn.garymb.ygomobile.net.http.DataHttpConnector;

public class LoginThread extends InstantThread {

	public LoginThread(TaskStatusCallback callback, HttpClient client) {
		super(callback, client);
	}

	@Override
	protected BaseHttpConnector initConnector(HttpClient client) {
		return new DataHttpConnector(client);
	}
}