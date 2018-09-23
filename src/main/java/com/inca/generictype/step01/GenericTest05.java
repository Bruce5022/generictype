package com.inca.generictype.step01;

import java.util.ArrayList;

/**
 * 
 * jdk考虑与1.5之前版本的项目融合,允许了以下写法:
 * ArrayList<Integer> list1 = new ArrayList();
 * ArrayList list2 = new ArrayList<Integer>();
 *  如果出现下面问题,能否通过呢,通过了又会怎样的结果呢?
 * ArrayList ilist = new ArrayList<Integer>();
 * ArrayList<String> slist = ilist;
 * 如果是ArrayList<Integer> ilist = new ArrayList<Integer>()还能赋值给ArrayList<String>吗?
 * @author Bruce
 *
 */
public class GenericTest05 {

	public static void main(String[] args) {
		//验证1
		ArrayList ilist = new ArrayList<Integer>();
		ArrayList<String> slist = ilist;
		slist.add("史战伟");
		System.out.println(ilist.size());// 这时候size是1
		ilist.add(111111);
		System.out.println(slist.size());
		String string = slist.get(1);
		System.out.println(string);
//		最后一句报错了:
//			Exception in thread "main" 2
//			java.lang.ClassCastException: java.base/java.lang.Integer cannot be cast to java.base/java.lang.String
//				at com.inca.generictype.step01.GenericTest05.main(GenericTest05.java:25)
		//验证2
//		ArrayList<Integer> ilist2 = new ArrayList<Integer>();
//		ArrayList<String> slist =ilist2;
//		这时候每个集合都确定了自己的类型,所以,编译器就过不了了,第一种只是考虑兼容允许编译通过了
	}
}
