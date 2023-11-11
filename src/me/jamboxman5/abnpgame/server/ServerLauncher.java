package me.jamboxman5.abnpgame.server;

public class ServerLauncher {
	
	public static GameServer socketServer;
	public static Console console;
	public static boolean running = true;
	
	public static void main(String[] args) {
		socketServer = new GameServer();
		socketServer.start();
		
		console = new Console(socketServer);
		console.start();
	}

}
