package com.inca.generictype.step02;

/**
 * 交换数组中两个值的位置
 * 
 * @author Bruce
 *
 */
public class GenericTest08 {

	public static void main(String[] args) {
		String[] obj = new String[] { "史战伟", "Bruce" };
		System.out.print("前:");
		for (String o : obj) {
			System.out.print(o);
		}
		System.out.println();
		swap(obj, 0, 1);
		System.out.print("后:");
		for (String o : obj) {
			System.out.print(o);
		}
		//打印结果:前:
//				史战伟Bruce
//				后:Bruce史战伟

	}

	// 不知道数组类型吧,数组变成泛型数组
	/*public static void swap(int[] arr, int i, int j) {
	}*/
	// 变成数组如下,但T是什么东西呢,方法上说一下:
	/*public static void swap(T[] arr, int i, int j) {
	}*/
	// 声明新类型如下
	public static <T> void swap(T[] arr, int i, int j) {
		T tmp = arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
}
