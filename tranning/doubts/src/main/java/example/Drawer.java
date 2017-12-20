package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Drawer {

	private List<String> socks;

	public Drawer() {
		socks = new ArrayList<>();
	}

	public Drawer(String sock) {
		this();

		socks.add(sock);
	}

	public void addSock(String sock) {
		socks.add(sock);
	}

	public boolean removeSock(String sock) {
		return socks.remove(sock);
	}

	public List<String> getSocks() {
		return socks;
	}

	public void setSocks(List<String> socks) {
		this.socks = socks;
	}

	@Override
	public String toString() {

		StringBuilder str = new StringBuilder();

		for (String string : socks) {
			str.append(string + " ");
		}

		return str.toString();
	}
}
