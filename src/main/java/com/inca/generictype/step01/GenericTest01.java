package com.inca.generictype.step01;

import java.util.ArrayList;

/**
 * 
 * 用泛型问题 
 * 1.定义好集合数据类型后,放入非此类型的数据,编译报错
 * 2.取出数据不用强转,系统知道类型
 * 
 * @author Bruce
 *
 */
public class GenericTest01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Bruce");
		System.out.println(list);
		String object = list.get(0);
		System.out.println(object);

	}
}
//******************************************//
//[Bruce]
//Bruce