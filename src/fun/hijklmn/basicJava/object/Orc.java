package fun.hijklmn.basicJava.object;

/**
 * 
 * @Desc:father class
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 14, 2019-10:54:54 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:Orc.java
 * @Tags:
 */
class Villain{
	
	private String name;
	
	protected void set(String name) {
		this.name = name;
	}
	
	public Villain(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "I'm a Villain and my name is " + name;
	}
	
}

/**
 * 
 * 描述：learn 'protected'
 * @Author：guosong
 * @DateTime：2019年1月10日 下午10:18:13
 */
public class Orc extends Villain{

	private int orcNumber;
	
	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}
	
	public void change(String name, int orcNumber) {
		set(name);
		this.orcNumber = orcNumber;
	}
	
	public String toString() {
		return "Orc "+orcNumber+" : "+super.toString();
	}
	
	public static void main(String[] args) {
		Orc orc = new Orc("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}

}
