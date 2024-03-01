package customexceptions;

public class loginform {
	public static void main(String[] args) {
	String id="shannu";
	int pwd=123;
	if(id.equals("shannu")) {
		if(pwd==123) {
			System.out.println("login successfull");
		}
		else {
			try {
			InvalidPwdException e=new InvalidPwdException();
			throw e;
			}
			catch(InvalidPwdException e) {
				System.out.println("invalid pwd");
			}
		}
	}

}
}
