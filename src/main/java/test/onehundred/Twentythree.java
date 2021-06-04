package test.onehundred;
/**
 * 计算1！+2！+3！+...+20！的阶乘
 * @author TKQ
 *
 */
public class Twentythree {
public static void main(String[] args) {
	long sum=0;
	long fac=1;
	for (int i = 1; i <= 20; i++) {
		fac=fac*i;//非递归求阶乘方法
		sum=sum+fac;
		System.out.println(sum);
	}

}
}
