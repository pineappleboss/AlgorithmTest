package onehundred;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 分解质因数
 * @author TKQ
 *
 */
public class One {
	public static void main(String[] args) {
		int n=56156;
		int k=2;
		while (k<=n) {
//			if(k==n) {
//				System.out.print(k+" ");
//			}
			if(n%k==0) {
				System.out.print(k+" ");
				n=n/k;
				
			}else {
				k++;
			}	
		}
		
	}
}
