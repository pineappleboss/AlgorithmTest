package onehundred;

import java.util.Scanner;

/**
 * 根据输入星期几的单词判断是星期几
 * @author TKQ
 *
 */
public class Twentysix {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String num=scanner.nextLine();
	char[] charArray = num.toCharArray();
	switch (charArray[0]) {
	case 'm':
		System.out.println("monday");
		break;
	case 'w':
		System.out.println("wenday");
		break;
	case 'f':
		System.out.println("friday");
		break;
	default:
		System.out.println("无法判断");
		break;
	}
}
}
