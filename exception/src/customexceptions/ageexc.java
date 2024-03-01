package customexceptions;

public class ageexc {
	public static void main(String[] args) {
		String name="shannu";
		int age=21;
		if(name.equals("shannu")) {
		if(age>=18) {
				System.out.println("valid");
			}
	
			else {
				try {
					invalidage  e=new invalidage ();
					throw e;
				}
				catch(invalidage  e) {
					System.out.println("invalid ");
				}
			}
		}

	}
}
