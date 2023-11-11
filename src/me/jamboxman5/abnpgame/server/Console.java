package me.jamboxman5.abnpgame.server;

import java.util.Iterator;
import java.util.Scanner;

import me.jamboxman5.abnpgame.records.OnlinePlayer;

public class Console extends Thread {
	
	GameServer server;
	
	public Console(GameServer server) {
		this.server = server;
	}
	
	public void run() {
		boolean done = false;
		Scanner sc = new Scanner(System.in);
		while (!done) {
			String cmd = sc.next();
			String output = "";
			Iterator<OnlinePlayer> itr = server.getConnectedPlayers().iterator();
			if (cmd.equalsIgnoreCase("getplayers")) {
				if (!itr.hasNext()) output = "Empty server.";
				while (itr.hasNext()) {
					output += itr.next().getUsername();
					if (itr.hasNext()) output += ", ";
				}
			} else if (cmd.equalsIgnoreCase("done")) {
				done = true;
				output = "Server closing.";
			} else {
				output = "Not recognized.";
			}
			System.out.println(output);
		}
		sc.close();

	}

}
