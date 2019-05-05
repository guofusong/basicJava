package fun.hijklmn.basicJava.object;


class SpaceShipControls {

	void up(int velocity) {}
	void down(int velocity) {}
	void left(int velocity) {}
	void right(int velocity) {}
	void forward(int velocity) {}
	void back(int velocity) {}
	void turboBoost() {}
}

public class SpaceShip extends SpaceShipControls {
	
	private String name;
	
	public SpaceShip(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		SpaceShip spaceShip = new SpaceShip("NASA Protector");
		spaceShip.forward(100);
	}
	
}
