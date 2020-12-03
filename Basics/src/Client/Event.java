package Client;

import java.awt.Point;

public interface Event {
	void onClientConnect(String clientName, String message);

	void onClientDisconnect(String clientName, String message);

	void onMessageReceive(String clientName, String message);

	void onChangeRoom();

	void onSyncDirection(String clientName, Point direction);

	void onSyncPosition(String clientName, Point position);

	void onGetRoom(String roomName);

	void onResize(Point p);

	void onChangeTeam(int number);

	void onSetPlayerColor(int teamId, String clientName);
}