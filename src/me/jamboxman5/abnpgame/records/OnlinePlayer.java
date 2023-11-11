package me.jamboxman5.abnpgame.records;

import java.net.InetAddress;

import me.jamboxman5.abnpgame.packets.Packet00Login;

public class OnlinePlayer {

	private String username;
	private int worldX;
	private int worldY;
	private double rotation;
	private String activeWeapon;
	
	public InetAddress ipAddress;
	public int port;
	
	public OnlinePlayer(Packet00Login packet, InetAddress address, int port) {
		username = packet.getUsername();
		worldX = packet.getX();
		worldY = packet.getY();
		rotation = 0;
		activeWeapon = "M4A1";
		
		this.ipAddress = address;
		this.port = port;
	}
	
	public String getUsername() { return username; }
	public int getX() { return worldX; }
	public int getY() { return worldY; }
	public double getRotation() { return rotation; }
	public String getWeapon() { return activeWeapon; }
	
}
