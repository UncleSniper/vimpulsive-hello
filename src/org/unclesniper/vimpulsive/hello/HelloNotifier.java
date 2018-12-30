package org.unclesniper.vimpulsive.hello;

import org.unclesniper.vimpulsive.VimSession;

public interface HelloNotifier {

	void sessionConnected(VimSession session);

	void sessionEnding(VimSession session);

	void sessionDying(VimSession session);

}
