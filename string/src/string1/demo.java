package string1;

public class demo {
	public static void main(String[] args) {
		String s="hello";
		System.out.println(s);
		String s1="hello";
		System.out.println(s1==s);
		String s2=new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s+"world");
		s=s+"hi";
		System.out.println(s);
	}

}
