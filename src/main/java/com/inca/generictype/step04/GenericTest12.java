package com.inca.generictype.step04;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Vector;

/**
 * 怎么知道applyVector接收的参数的实际类型呢?
 * 
 * @author Bruce
 *
 */
public class GenericTest12 {

	public static void main(String[] args) throws Exception {
		Method method = GenericTest12.class.getMethod("applyVector", Vector.class);
		Type[] types = method.getGenericParameterTypes();
		ParameterizedType type = (ParameterizedType) types[0];
		System.out.println(type.getRawType());
		System.out.println(type.getActualTypeArguments()[0]);
	}

	public static <T> void applyVector(Vector<T> v1) {

	}
}
