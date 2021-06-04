package test.onehundred;
/**
 * 打印出杨辉三角
 * 第一步先构建二维数组
 * @author TKQ
 *
 */
public class Twentynine {

	public static void main(String[] args) {
		int arr[][]=new int[10][];//10行，列数待定;//10行，列数待定
		for (int i = 0; i <arr.length; i++) {//重要性质；第i行有i个数，但是小标要少个一
			arr[i]=new int[i+1];//
		}
		for (int k = 0; k < arr.length; k++) {
			arr[k][0]=1;
		}
		//遍历二维数组
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int odds=1;

				for (int k = 1; k <= j; k++) {
					odds=odds*(i-k+1)/k;//核心在于此，这个元素等于前一个元素除以这一行数减去
					//这一行多少个数加一除以多少个数
					arr[i][k]=odds;
				}
			}
		}
		for (int[] is : arr) {
			for(int i:is) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}
