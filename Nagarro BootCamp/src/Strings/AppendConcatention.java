package Strings;

public class AppendConcatention {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		append();
		long end = System.currentTimeMillis();

		System.out.println(end - start);

	}

	public static void append() {

		int n = 10000000;

		//String str = "";
		StringBuilder str=new StringBuilder(); // now not creating different memory location by copying ach and every element once again

		for (int i = 1; i <= n; i++)
			str.append(i);

	}

}
