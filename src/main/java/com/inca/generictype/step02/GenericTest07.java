package com.inca.generictype.step02;

/**
 * 
 * @author Bruce
 *
 */
public class GenericTest07 {

	public static void main(String[] args) {
		/**
		 * java里比较奇怪的写法,已经声明了同一种类型的泛型,参数不是同一种类型的数据也不报错
		 * 但编译器会推断类型,比如2和3.5之和,快捷键获取参数类型是Number,其它的都是快捷键返回的
		 * 也就是说,编译器可以推断出参数的公共的具体类型
		 */
		Integer result1 = add(1, 2);
		Number result2 = add(2, 3.5);
		Object result3 = add("唉唉唉", 1);
		
	}

	// 怎么用泛型改造下面的三个方法

	/*public static int add(int a, int b) {
		return b + a;
	}

	public static float add(float a, float b) {
		return b + a;
	}

	public static double add(double a, double b) {
		return b + a;
	}*/
	// 怎么用泛型改造下面的三个方法 end
//	1.首先方法上声明一个变量类型T
//	2.参数类型和返回类型改造成T
	public static <T> T add(T a, T b) {
		return (T) null;
	}
	
}
