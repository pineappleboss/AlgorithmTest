package onehundred;
/**
 * 计算一组数列,2/1,3/2,5/3,8/5,13/8,...前二十项之和
 * @author TKQ
 *
 */
public class Tewntytwo {
public static void main(String[] args) {
	double sum=0;
	double x=1,y=2;
	for (int i = 1; i <= 20; i++) {		
			sum=sum+y/x;
			double temp=x;//先将x存起来
			x=y;
			y=y+x;
			
	}
	System.out.println(sum);
}
}
