package try_catch_finally;

public class Try_Catch {

	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 5, 8, 4 };
		int b = 0, res;

		try {
			res = a[7] / b;
		} catch (ArithmeticException e) {
			System.out.println("Can't " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally Block");

		}

	}

}
