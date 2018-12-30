package org.unclesniper.vimpulsive.hello;

import org.unclesniper.vimpulsive.SessionLifecycleEvent;
import org.unclesniper.vimpulsive.SessionLifecycleListener;

public class HelloSessionLifecycleListener implements SessionLifecycleListener {

	private final HelloService service;

	public HelloSessionLifecycleListener(HelloService service) {
		this.service = service;
	}

	public HelloService getService() {
		return service;
	}

	public void sessionEnding(SessionLifecycleEvent event) {
		service.getNotifier().sessionEnding(event.getSession());
	}

}
