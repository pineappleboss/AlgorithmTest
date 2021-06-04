package test.onehundred;
/**
 * 打印出菱形
 * @author TKQ
 *
 */
public class Twentyone {
public static void main(String[] args) {
	int k=3;//用来打印空格时使for循环内的条件产生变化
	for (int i = 1; i <=7; i+=2) {

		for (int j = k; j >0 ; j--) {
			System.out.print(" ");
		}
		k--;
		for (int j = i; j >0; j--) {

			System.out.print("*");
		}

		System.out.println();
	}
	for (int i = 5; i >0; i-=2) {
		k++;
		for (int j = 0; j <=k ; j++) {
			System.out.print(" ");
		}
		for (int j = i; j >0; j--) {
			System.out.print("*");
		}
		System.out.println();
	}

}
}
