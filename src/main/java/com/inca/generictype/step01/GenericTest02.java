package com.inca.generictype.step01;

import java.util.ArrayList;
/**
 * 
 *  不用泛型的问题
 * 1.编译不报错
 * 2.获取元素,不知道数据类型
 * 3.强转失败报错
 * 4.有编译警告,看着不爽
 * 
 * @author Bruce
 *
 */
public class GenericTest02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Bruce");
		list.add('a');
		list.add(11);
		list.add(new Object());
		list.addAll(new ArrayList());
		System.out.println(list);
		Integer object = (Integer) list.get(0);
		System.out.println(object);

	}
}
//******************************************//

//打印日志:
//	[Bruce, a, 11, java.lang.Object@383534aa]
//			Exception in thread "main" java.lang.ClassCastException: java.base/java.lang.String cannot be cast to java.base/java.lang.Integer
//				at com.inca.generictype.step01.GenericTest01.main(GenericTest01.java:15)
	