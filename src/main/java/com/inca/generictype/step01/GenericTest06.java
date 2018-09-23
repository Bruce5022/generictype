package com.inca.generictype.step01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * 通配符的使用:
 *  <U> Class<? extends U> asSubclass(Class<U> clazz) 类这个 类对象来表示由指定的类对象表示的类的子类
 *  问号:表示任意类型
 *  应用尝试,做一个能打印任意集合内容的方法,怎么写呢?
 *  做好了之后,如果这个方法不是打印集合,而是存值呢,别人传来数字类型集合,方法放进去一个字符串的,也不好啊
 * @author Bruce
 *
 */
public class GenericTest06 {

	public static void main(String[] args) {
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("史战伟");
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(1);
		printContent(slist);
		printContent(ilist);
	}
	public static void printContent(Collection<?> list) {
		for (Object a : list) {
			System.out.println(a);
		}
		
	}
}
