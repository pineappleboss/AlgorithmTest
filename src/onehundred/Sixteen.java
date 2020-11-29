package onehundred;
/**
 * 1,2,3,4组成不同的无重复三位数字
 * @author TKQ
 *
 */
public class Sixteen {
public static void main(String[] args) {
	int n=0;
	for (int i = 1; i < 5; i++) {
		for (int j = 1; j < 5; j++) {
			for (int k = 1; k < 5; k++) {
				if(i!=j&&j!=k&&i!=k) {
					n++;
					System.out.print(i*100+j*10+k+" ");					
				}
				
			}
		}
	}
	System.out.println("共有"+n);
}
}
