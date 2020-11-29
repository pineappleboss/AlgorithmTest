package onehundred;
/**
 * 完数：一个数恰好等于他的因子之和就是完数
 * @author TKQ
 *
 */
public class Fourteen {
public static void main(String[] args) {
	
	for (int i = 0; i <=1000; i++) {
		int sum=0;
		for (int j = 1; j <=i/2; j++) {	//注意此处条件，一个数大于其一半的数，不可能是他的因数		
			if (i%j==0) {
				sum=sum+j;
			}
			if(sum==i) {
				System.out.print(i+" ");
			}			
		}
	}
}
}
