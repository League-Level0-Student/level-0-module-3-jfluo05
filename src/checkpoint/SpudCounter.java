package checkpoint;

import java.nio.charset.MalformedInputException;

public class SpudCounter {
	public static void main(String[] args) {

		int n;
		for (n = 1; n < 8; n++) {

			if (n == 4) {
				System.out.print(n + ", ");
			} else {

				System.out.print(n + " Potato, ");
			}
		}
		System.out.println("more");
	}

	public SpudCounter() {
		// TODO Auto-generated constructor stub

	}

}
