package fun.hijklmn.basicJava.object;

/**
 * 
 * 
 * @Desc:
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:May 5, 20199:04:18 PM
 * @WhereBuilding:home
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:SpaceShipDelegation.java
 * @Tags:
 */
public class SpaceShipDelegation {

	private String name;
	
	private SpaceShipControls spaceShipControls = new SpaceShipControls();
	
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	
	public void back(int velocity) {
		spaceShipControls.back(velocity);
	}
	
	public void down(int velocity) {
		spaceShipControls.down(velocity);
	}
	
	public void forward(int velocity) {
		spaceShipControls.forward(velocity);
	}
	
	public void left(int velocity) {
		spaceShipControls.left(velocity);
	}
	
	public void right(int velocity) {
		spaceShipControls.right(velocity);
	}
	
	public void turboBoost() {
		spaceShipControls.turboBoost();
	}
	
	public void up(int velocity) {
		spaceShipControls.up(velocity);
	}
	
	public static void main(String[] args) {
		SpaceShipDelegation delegation = new SpaceShipDelegation("NASA Protector");
		delegation.forward(200);
	}
	
}
