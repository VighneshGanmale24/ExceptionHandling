package customException;


public class PinCodeNotFoundException extends Exception {
	
	private static String message = "____pinCode Not Found !!!____";

	public PinCodeNotFoundException() {
		this(message);
	}

	public PinCodeNotFoundException(String message) {
		super(message);
	}

}
