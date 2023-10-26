package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		try {
			throw new Exception("user not found exception");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("--------------------");
		String data = null;
		if (data == null) {
			try {
				throw new Exception("Data Not Found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			System.out.println(data.length());
		} catch (NullPointerException e) {
			System.out.println("can not calculate the lenght");
		}

		System.out.println("Bye");
	}

}
