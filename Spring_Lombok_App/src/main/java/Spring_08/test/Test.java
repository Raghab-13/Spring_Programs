package Spring_08.test;

import Spring_08.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is for parameterized constructor
		Person p=new Person(1,"fg","df",1233234,"12/12/2024");
		System.out.println(p);
		Person p1=new Person();
		p1.setPid(101);
		p1.setPname("raghab");
		System.out.println(p1.getPname());
		//System.out.println(p);
	}

}
