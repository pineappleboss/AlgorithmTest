package test.onehundred;
/**
 * 将报数序号为三的
 * @author TKQ
 *
 */
public class Thrity {
public static void main(String[] args) {
		boolean arr[]=new boolean[6];
		int num=0;
		int count=arr.length;
		int index=0;
		while (count>1) {
			if (arr[index]==false) {
				num++;

			}
			if (num==3) {
				arr[index]=true;
				count--;
				num=0;
			}
			index++;
			if (index==arr.length-1) {
				index=0;

		}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==false) {
				System.out.println(i);
			}
		}
}
}
