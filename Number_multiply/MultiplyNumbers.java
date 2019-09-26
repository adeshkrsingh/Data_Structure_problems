import java.io.*;
import java.util.*;

class MultiplyNumbers {
	public static void main(String args[]) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number 1 : ");
		// String s1 = bReader.readLine();
		String s1 = "25";
		System.out.print("Enter Number 2 : ");
		// String s2 = bReader.readLine();
		String s2 = "31";
		int l1 = s1.length();
		int l2 = s2.length();
		int lR = l1 + l2 + 1;
		char[] finalResult = new char[lR];
		char[] tempResult = new char[lR];
		for(int k = 0; k < lR; k++) {
			finalResult[k] = 0;
			tempResult[k] = 0;
		}

		int multiplierOffset = 0;
		int carry = 0;
		for(int i = l1 -1; i >= 0; i--) {
			for(int k = 0; k < lR; k++) {
				tempResult[k] = 0;
			}


			for(int j = l2 -1; j >= 0 ; j-- ) {
				int tMultiply = (s1.charAt(i) - '0' ) * (s2.charAt(j) - '0');
				String ss  = ((tMultiply % 10) + carry) + "";
				tempResult[lR - 1 - j - multiplierOffset] = ss.charAt(0);
				System.out.println("multiplied saving position : " + (lR - 1 + j - multiplierOffset) );
				carry = tMultiply / 10;
			}

			int tcarry = 0;
			for(int k = lR - 1; k >= 0; k--) {
				int r = finalResult[k] + tempResult[k] + tcarry;
				String ss =  r + "";
				finalResult[k] = ss.charAt(0);
				tcarry = r / 10;
			}

			System.out.println("TempTResult in "+ i +": ");
			for(int k = 0; k < lR; k++) {
				System.out.print(tempResult[k] + " |");
			}
			System.out.println("finalResult : in "+ i +":");
			for(int k = 0; k < lR; k++) {
				System.out.print(finalResult[k] + "|");
			}
			System.out.println();
			multiplierOffset++;
		}

		System.out.println("====== Java ======="+ s1 + s2);
	}
}
