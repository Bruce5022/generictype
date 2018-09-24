package com.inca.generictype.step03;

public class GenericDao02 {
	// 这里的T是方法上的,相互之间并没有任何约束的,怎么让有约束呢?
	// 答案:定义到类上
	
	public <T> void add(T p) {
	}

	public <T> T findById(int id) {
		return null;
	}
}
