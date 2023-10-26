package ExceptionHandling;

public class Student {

	public static int getMarks(String name)

	{
		System.out.println("getting marks for: " + name);

		if (name.equals("Suchi")) {

			try {
				int i = 9 / 3;
				return 90;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				System.exit(1);
				return 80;
			}
			finally {
				System.out.println("final marks.");
				return 50;
			}
		} else if (name.equals("Abhi")) {
			return 90;
		} else if (name.equals("Riya")) {
			return 80;
		} else {
			System.out.println("Student not found ....");
			throw new MyException("student not found exception");
		}
	}

	public static void main(String args[]) {
		int m=getMarks("Suchi");
		System.out.println(m);
	}

}
