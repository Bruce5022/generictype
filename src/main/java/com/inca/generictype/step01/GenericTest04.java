package com.inca.generictype.step01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 运行期通过反射获取集合类型,往里面加入其它非此类型的其它值,是可以的 运行期已经经过编译环节了
 * 
 * @author Bruce
 *
 */
public class GenericTest04 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		List<Integer> ilist = new ArrayList<Integer>();
//		ilist.add("abc");//这时不行的
		Method method = ilist.getClass().getMethod("add", Object.class);
		method.invoke(ilist, "abc");
		Object val = ilist.get(0);
		System.out.println(val);
	}
}
