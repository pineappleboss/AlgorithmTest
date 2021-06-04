package test.onehundred;
/**
 * 给出m,n求其最大公约数和最小公倍数
 * 1，最大公约数求法为，从两数中小的一个开始遍历，直到找到m%i==0&&n%i==0数为止
 * 2，最小公倍数为，两数乘积除以最大公约数
 * @author TKQ
 *
 */
public class Twelve {
public static void main(String[] args) {
	int m= 55;
	int n=15;
	if(m<n) {//将较大的一个数放在前面
		int temp=m;
		m=n;
		n=temp;
	}
	if(m%n==0) {
		System.out.println("最大公约数"+n+"最小公倍数"+m);
	}else {
	for (int i = n; i >0; i--) {
		if(m%i==0&&n%i==0) {
			System.out.println("最大公约数"+i+"最小公倍数"+(m*n)/i);
			break;
		}
	}
	}
}
}
