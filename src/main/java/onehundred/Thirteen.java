package onehundred;
/**
 * 求s=a+aa+aaa+aaaa+aaaa....+aaaa....a的值，加几个a由键盘控制
 * @author TKQ
 *
 */
public class Thirteen {
public static void main(String[] args) {
	int a=4;
	int sum=0;
	int s=a;
	for (int i = 0; i <s; i++) {
		sum=a+sum;//求和
		
		a=a+a*10;//此处当第一次循环执行到此时，将a=a+a*10，将a的值后挪一位，得到a值
		}	
	System.out.println(sum);
}
}
