package com.inca.generictype.step01;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 编译器编译完之后,会去掉类型信息,因此ArrayList<Integer>和ArrayList<String>编译之后,运行时Class文件是一样的
 * 
 * @author Bruce
 *
 */
public class GenericTest03 {

	public static void main(String[] args) {
		List<String> slist = new ArrayList<String>();
		List<Integer> ilist = new ArrayList<Integer>();
		// 内存地址是一样的
		System.out.println(slist.getClass() == ilist.getClass());

	}
}
