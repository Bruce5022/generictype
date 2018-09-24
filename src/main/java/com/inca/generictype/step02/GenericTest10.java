package com.inca.generictype.step02;

/**
 * 用泛型方法实现不同数据的转换
 * @author Bruce
 *
 */
public class GenericTest10 {

	public static void main(String[] args) {
		Object obj="szw";
//		String name = (String) obj;需要强转,不太好
		String name=autoConvert(obj);
		System.out.println(name);
	}

	public static <T> T autoConvert(Object obj) {
		return (T) obj;
	}
}
