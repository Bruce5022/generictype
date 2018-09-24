package com.inca.generictype.step03;

public class Test {

	public static void main(String[] args) {

		// 这里希望返回的也是Person,但确实Object,怎么处理呢?
//		GenericDao02 dao=new GenericDao02();
//		dao.add(new Person());
//		Object p = dao.findById(0);
		GenericDao03<Person> dao=new GenericDao03<Person>();
		dao.add(new Person());
		Person p = dao.findById(0);
		// 泛型类中的static方法,不能通用泛型类型
	}
}
