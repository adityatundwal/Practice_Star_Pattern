package practice_all;
import java.util.Scanner;

public class Rough {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int space = n - 1;
		int star = 1;

		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			int count = row;
			while (j <= star) {
				System.out.print(count + " ");
				if (j <= star / 2) {
					count++;
				} else {
					count--;
				}
				j++;
			}

			space--;
			row++;
			star += 2;
			System.out.println();
		}
		
		}
		}
	