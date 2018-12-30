package org.unclesniper.vimpulsive.hello;

import org.unclesniper.vimpulsive.Vimpulsive;
import org.unclesniper.vimpulsive.VimService;

public class HelloService implements VimService {

	private HelloNotifier notifier;

	public HelloService() {}

	public HelloNotifier getNotifier() {
		return notifier;
	}

	public void setNotifier(HelloNotifier notifier) {
		this.notifier = notifier;
	}

	public void bind(Vimpulsive server) {
		server.addSessionConnectionListener(new HelloSessionConnectionListener(this));
	}

}
