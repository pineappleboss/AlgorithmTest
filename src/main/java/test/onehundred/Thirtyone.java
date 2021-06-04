package test.onehundred;

import java.util.Scanner;

/**
 * 写一个函数，输入奇数是调用1/1+1/3+1/5+1/7+...+1/n，输入偶数是调用1/2+1/4+1/6+...+1/n。
 * @author TKQ
 *
 */
public class Thirtyone {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	double n = scanner.nextInt();
	double sum=0;
	for (double i=(n%2==0?2:1); i <= n; i+=2) {//三目运算符
		sum=sum+1/i;
		System.out.println(sum);
	}
	System.out.println(sum);
}
}
