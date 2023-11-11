package me.jamboxman5.abnpgame.packets;

import me.jamboxman5.abnpgame.server.GameServer;

public class Packet03Map extends Packet {

	private String mapName;
	
	public Packet03Map(byte[] data) {
		super(03);
		this.mapName = readData(data);
	}
	
	public Packet03Map(String map) {
		super(03);
		this.mapName = map;
	}

	@Override
	public void writeData(GameServer server) {
		server.sendDataToAllClients(getData());
	}

	@Override
	public byte[] getData() {
		return ("03" + this.mapName).getBytes();
	}
	
	public String getMap() { return mapName; }

}
