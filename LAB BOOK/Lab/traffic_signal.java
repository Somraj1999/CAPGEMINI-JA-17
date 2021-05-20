import java.util.Scanner;

public class LAB1_OP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Choose 1 FOR RED SIGNAL");
		System.out.println("Choose 2 FOR YELLOW SIGNAL");
		System.out.println("Choose 3 FOR GREEN SIGNAL");
		System.out.println("CHOOSE YOUR SELECTION:");
		int a=s.nextInt();
		switch (a) {
		case 1:
			System.out.println("STOP");
			break;

		case 2:
			System.out.println("READY");
			break;

		case 3:
			System.out.println("GO");
			break;

		default:
			break;
		}

	}

}
