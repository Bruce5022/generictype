package com.inca.generictype.step00;

/**
 * 基本数据类型==就相等 引用数据类型的数据==值一样,但结果不一样的
 * 
 * @author Bruce
 *
 */
public class EqualsTest02 {

	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		System.out.println(n == m);// true

		String str = new String("hello");
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1 == str2);// false

		str1 = str;
		str2 = str;
		System.out.println(str1 == str2);// true
	}
}
//总结来说：
//1）对于==，如果作用于基本数据类型的变量，则直接比较其存储的 “值”是否相等；
//　　如果作用于引用类型的变量，则比较的是所指向的对象的地址
//2）对于equals方法，注意：equals方法不能作用于基本数据类型的变量
//　　如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；
//　　诸如String、Date等类对equals方法进行了重写的话，比较的是所指向的对象的内容。