package ch10.lecture;

class NotExistIDException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NotExistIDException() {
		
	}
	public NotExistIDException(String message) {
		super(message);
	}
}
class WrongPasswordException extends Exception{
	public WrongPasswordException(String message) {
		super(message);
	}
}
public class LoginExample {
	public static void main(String[] args) {
		
		try {
			login("white", "12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue","54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void login(String id, String password) throws WrongPasswordException, NotExistIDException {
		// TODO Auto-generated method stub
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
