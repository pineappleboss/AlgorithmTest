package onehundred;

import java.util.Scanner;

/**
 * 输入一个数判断是不是回文数
 * @author TKQ
 *
 */
public class Twentyfiven {
public static void main(String[] args) {
name();	
}
public static void name() {
	Scanner scanner=new Scanner(System.in);
	String num=scanner.nextLine();
	char[] charArray = num.toCharArray();
	int h=charArray.length-1;
	int l=0;
	while(h>l+1) {//此条件很重要
		if (charArray[h]!=charArray[l]) {
			System.out.println("不是回文数");
			return;//只要有一位不满足，则不是回文数
		}
		h--;
		l++;
	}
	System.out.println("是一个回文数");//能执行到此处，说明是回文数。
}
}
