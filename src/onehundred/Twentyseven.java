package onehundred;

import java.util.Scanner;

/**
 * 求一个3*3矩阵对角线元素之和
 * @author TKQ
 *
 */
public class Twentyseven {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int [][] arr=new int[3][3];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			arr[i][j]=scanner.nextInt();
		}
	}
	int sum=0;
	int x=0;
	int y=0;
	int a=0;
	int b=2;
	for (int i = 0; i < arr.length; i++) {
		sum=sum+arr[x][y];
		sum+=arr[a][b];
		x++;
		y++;
		a++;
		b--;
	}
	System.out.println(sum);
}
}
