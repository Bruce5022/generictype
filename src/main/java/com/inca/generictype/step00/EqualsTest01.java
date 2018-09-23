package com.inca.generictype.step00;

/**
 * 重新认识==和equals的区别
 * 
 * @author Bruce
 *
 */
public class EqualsTest01 {

	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);// false
		System.out.println(str1.equals(str2));// true
	}
}
