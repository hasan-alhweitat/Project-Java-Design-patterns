package dp.facadeUniversity_part_3;

import java.util.Scanner;

public class TestUnivercityDetials {

	public static void main(String[] args) {
		int p = 0;
		UniversityDetails s = new UniversityDetails();
		while (p != 3) {
			System.out.println("*************");
			System.out.println("University: -");
			System.out.println("1 - School 1.");
			System.out.println("2 - School 2.");
			System.out.println("3 - Exit.");
			System.out.print("Enter Choice: -  ");
			p = new Scanner(System.in).nextInt();
			switch (p) {
			case 1: {

				s.school1();
			}
				break;
			case 2: {

				s.school2();
			}
				break;
			case 3: {
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: the try choice number correct");
			}
		}
	}
}
