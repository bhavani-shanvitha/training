package wrapper;

public class wrapperclass {
	public static void main(String[] args) {
		char s='S';
		Character c=Character.valueOf(s);
		
		Character c1=s;
		
		Character c2=(Character)s;
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
//		int a=16;
//		Integer a1=a;
//		System.out.println(a1.hashCode());
//		
		//unboxing
		Float F=3.2f;
		float f=F;
		float f1=F.intValue();
		float f2=(float)F;
		System.out.println(F);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
	}

}
