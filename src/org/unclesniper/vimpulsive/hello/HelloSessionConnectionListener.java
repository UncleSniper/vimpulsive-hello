package org.unclesniper.vimpulsive.hello;

import org.unclesniper.vimpulsive.SessionConnectionEvent;
import org.unclesniper.vimpulsive.SessionConnectionListener;

public class HelloSessionConnectionListener implements SessionConnectionListener {

	private final HelloService service;

	public HelloSessionConnectionListener(HelloService service) {
		this.service = service;
	}

	public HelloService getService() {
		return service;
	}

	public void sessionConnected(SessionConnectionEvent event) {
		event.getSession().addSessionLifecycleListener(new HelloSessionLifecycleListener(service));
		service.getNotifier().sessionConnected(event.getSession());
	}

	public void sessionDying(SessionConnectionEvent event) {
		service.getNotifier().sessionDying(event.getSession());
	}

}
