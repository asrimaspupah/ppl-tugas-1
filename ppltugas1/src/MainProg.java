import java.util.Vector;

import packagea.*;


public class MainProg implements X {

	public int W() {
		return 2;
	}

	public static void main(String[] args) {
		ABB a = new ABB();
		P p = new P();
		Q q = new Q();
		
		Vector<Integer> v = new Vector(AllConts.N);
		
		a.f();
		
		for (int i=0; i<v.capacity(); i++) {
			v.add(i);
			System.out.println(v.get(i));
		}

	}

}
