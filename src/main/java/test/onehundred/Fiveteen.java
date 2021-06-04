package test.onehundred;
/**
 * 球从100米降落，每次降落高度为原来的一半，求落地10次后的经过距离
 * @author TKQ
 *
 */
public class Fiveteen {
public static void main(String[] args) {
	int height=100;
	int sum=0;

	for (int i = 0; i < 10; i++) {
		int even=0;
		even=height+height/2;//下一次反弹落地高度和一共移动距离分开计算
		sum=sum+even;
		height=height/2;

	}
	System.out.println(sum);
}
}
