package onehundred;
/**
 * 一个数加上100和加上168都是完全平方数，求该数
 * @author TKQ
 *
 */
public class seventeen {
public static void main(String[] args) {
	for(int i=0;i<10000;i++) {
		if(Math.sqrt(i+100)%1==0) {//Math.sqrt()此方法返回一个double数据
			if(Math.sqrt(i+168)%1==0) {
				System.out.println(i);
				break;
			}
		}
	}
}
}
