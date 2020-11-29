package onehundred;
/**
 * 猴子吃桃问题,第一天吃了总数一半加一个，第十天还剩一个，求第一天摘了多少
 * @author TKQ
 *
 */
public class ninteen {
public static void main(String[] args) {
	int sum=1;
	for(int i=10;i>0;i--) {
		sum=(sum+1)*2;
	}
	System.out.println(sum);
}
}
