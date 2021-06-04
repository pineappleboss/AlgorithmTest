package test.onehundred;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 输入某年某月某日，判断这是这一年的第几天
 * @author TKQ
 *
 */
public class Eighteen {
public static void main(String[] args) {
	Calendar calendar1 = Calendar.getInstance();
	Scanner scanner=new Scanner(System.in);
	int year=scanner.nextInt(),month=scanner.nextInt(),date=scanner.nextInt();
	calendar1.set(year, month+1, date);
	Calendar calendar2 = Calendar.getInstance();
	calendar2.set(year, 0, 0);

}
}
