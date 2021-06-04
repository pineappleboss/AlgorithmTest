package test.onehundred;
/**
 * 将一个数插入已排好序的数组中，类似于选择排序的某一步骤
 * @author TKQ
 *
 */
public class twentyeight {
	public static void main(String[] args) {
		int arr[]= {8,2,9,6,4};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j>=0&&(arr[j]<arr[j+1]); j--) {//此处是插入排序的精髓所在，for
				//for循环执行次数由下一个数是否大于前一个数来决定，最多执行i次，最少执行0次。
				int temp =arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
