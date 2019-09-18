package Assignments.Sep18;

import java.util.Scanner;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 18-Sep-2019
 *
 */

public class FormMinNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		while (n > 0) {
			String str = scn.next();

			int[] arr = new int[str.length() + 1];

			int count = 1;

			for (int i = 0; i <= str.length(); i++) {

				if (i == str.length() || str.charAt(i) == 'I') {

					arr[i] = count++;

					for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
						arr[j] = count++;
					}
					
					// change
					
					// for (int j = i; j >= 0 && str.charAt(j) != 'I'; j--) {
					// arr[j] = count++;
					// }
				}

			}

			for (int val : arr) {
				System.out.print(val);
			}
			System.out.println();

			n--;
		}
	}
}
