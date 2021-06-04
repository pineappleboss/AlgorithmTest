package test.onehundred;

import java.util.Arrays;

/**
 * 完成arrayList
 *初始长度：10
 *负载因子：1
 *扩容：0.5
 * @author TKQ
 *
 */
public class MyArrayList {
	private static final int defaultLength=10;
	private Object[] dataObjects;
	private int size=0;
	public void MyArrayList() {
		this.MyArrayList(defaultLength);
	}
	public void MyArrayList(int length) {//构造方法
		dataObjects=new Object[length];
		}
	public void add(Object o) {//增加元素
		if(size>=dataObjects.length) {//如果超过负载因子就扩容
			dataObjects = Arrays.copyOf(dataObjects, dataObjects.length+(dataObjects.length/2));

		}
		dataObjects[size++]=o;
	}
	public void remove(int i) {//删除元素
			if(i<dataObjects.length-1) {
				for(int j=i;i<dataObjects.length-1;j++) {
					dataObjects[j]=dataObjects[j+1];
				}
				size--;
			}
		}
	public int getIndex(Object o) {//获得下标
		int index=0;
		for (int i = 0; i < dataObjects.length; i++) {
			if (dataObjects[i].equals(o)) {
				index=i;
			}
		}
		return index;

	}
	public int getSize() {//返回长度
			return size;
		}
}
