package onehundred;

import java.util.Scanner;
import java.util.concurrent.CancellationException;

/**
 * 给出一个不多于5位的正整数，求他是几位数，并逆序输出
 * @author TKQ
 *
 */
public class Twentyfour {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		String valueOf = String.valueOf(num);
		char[] charArray = valueOf.toCharArray();
		System.out.println("数字"+charArray.length+"位数");
		for (int i = charArray.length-1; i >=0 ; i--) {
			System.out.print(charArray[i]);
		}
	}

}
