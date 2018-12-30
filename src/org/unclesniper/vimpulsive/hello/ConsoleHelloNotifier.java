package org.unclesniper.vimpulsive.hello;

import org.unclesniper.vimpulsive.VimSession;

public class ConsoleHelloNotifier implements HelloNotifier {

	public ConsoleHelloNotifier() {}

	public void sessionConnected(VimSession session) {
		System.out.println("Session #" + session.getSessionID() + " connected.");
		System.out.flush();
	}

	public void sessionEnding(VimSession session) {
		System.out.println("Session #" + session.getSessionID() + " ending.");
		System.out.flush();
	}

	public void sessionDying(VimSession session) {
		System.out.println("Session #" + session.getSessionID() + " dying.");
		System.out.flush();
	}

}
