package fun.hijklmn.basicJava.multistatus;


class UseFul{
	
	public void f() {}
	
	public void g() {}
	
}

class MoreUseFul extends UseFul{
	
	public void f() {}
	
	public void g() {}

	public void u() {}
	
	public void v() {}
	
	public void w() {}
	
}

/**
 * 
 * @Desc:down case
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Feb 25, 2019-11:37:05 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:RTTI.java
 * @Tags:
 */
public class RTTI {

	public static void main(String[] args) {
		
		UseFul[] useful = {new UseFul(), new MoreUseFul()};
		useful[0].f();
		useful[1].g();
		
		// useful[1].u();
		((MoreUseFul)useful[1]).u();
		
		if(useful[0] instanceof MoreUseFul) {
			((MoreUseFul)useful[0]).u();
		}
		//((MoreUseFul)useful[0]).u();
		
	}
	
}
