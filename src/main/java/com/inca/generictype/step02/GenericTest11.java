package com.inca.generictype.step02;

/**
 * 初始化数组
 * @author Bruce
 *
 */
public class GenericTest11 {

	public static void main(String[] args) {
		initArray(new String[3],"szw");
	}

	public static <T> void initArray(T[] a, T obj) {
		for (int i = 0; i < a.length; i++) {
			a[i] = obj;
		}
	}
}
