package HackerBlocks;

public class FahrenheitScale {

	public static void main(String[] args) {
		int min = 0;
		int max = 300;
		int step = 20;
		int current = min;
		while (current <= max) {
		double celsius = ((5.0 / 9) * (current - 32));
//			int celsius = (int)((5.0 / 9) * (current - 32));
			System.out.println(current + "\t" + celsius);
			current = current + step;

		}

	}

}
