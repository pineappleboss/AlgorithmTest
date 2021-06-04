package test.onehundred;
/**
 * 二分查找递归实现
 * 必须是有序数组
 * @author TKQ
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {2,5,4,6,9,8};
		sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		int i = binarySearch(arr,0,arr.length-1,8);
		System.out.println(i);
	}
public static int[] sort(int[] arr) {//插入排序
	for (int i = 0; i < arr.length; i++) {
		for (int j = i; j >0&&(arr[j]<arr[j-1]); j--) {
			int temp=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;
		}
	}
	return arr;

}
public static int binarySearch(int[] arr,int low,int height,int data) {
	int mid=(low+height)/2;	//递归必有返回值
	if(low<=height) {
		if(arr[mid]>data) {
			return binarySearch(arr,low,mid-1,data);
		}else if(arr[mid]<data) {
			return binarySearch(arr,mid+1,height,data);
		}else {
			return mid;
		}
	}
	return mid;
}
}
