package rushi.main.Strmline;

import rushi.main.demo.PrivateAcessmodifier;
//class AccessModifier extends PrivateAcessmodifier{

public class AccessModifier extends PrivateAcessmodifier  {
	

	public static void main(String[] args) {
		
		AccessModifier obj = new AccessModifier();
		
		//System.out.println("Private"+" "  + obj.a);
		System.out.println("Public"+" " +obj.b);
		System.out.println("Protected"+" " +obj.c);
		//System.out.println("default"+ "  " +obj.d);

	}

}
//}
