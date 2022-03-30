package customException;

public class PinCode {

	public static void main(String[] args) {
		try {
			System.out.println(pinCodeNotFound(416012));
		} catch (PinCodeNotFoundException e) {
			e.printStackTrace();

		}
	}

	private static boolean pinCodeNotFound(int pinCode) throws PinCodeNotFoundException {

		if (pinCode == 416202)
			return true;
		else {
			throw new PinCodeNotFoundException();
		}
	}

}
