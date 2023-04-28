import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many initial bacteria? ");
		long initial = input.nextLong();
		System.out.print("How many hours will the bacteria sit? ");
		long hours = input.nextLong();
		long bacteria = numBacteriaAlive(initial, hours);
		System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
	}

	public static long numBacteriaAlive(long initial, long hour) {
		if (hour == 0) return initial;
		return 3 * numBacteriaAlive(initial, hour - 1);
	}
}
