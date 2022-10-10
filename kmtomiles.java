package hello;
import java.util.Scanner;
public class kmtomiles {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the kilometers you want to convert\n");
			double a = sc.nextDouble();
			double m = 0.621*a;
			System.out.println("miles="+ m);

		}

	}

