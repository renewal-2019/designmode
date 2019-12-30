package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		
		//创建实例对象,即被代理对象
		Person jason = new Student("Jason");
		
		//创建与代理对象想关联的InvocationHandler
		InvocationHandler stuHandler = new StudentInvationHandler<Person>(jason);
		
		//创建一个代理对象stuProxy来代理jason，代理对象的每个执行方法都会替换执行Invocation中的invoke方法  
		Person stuProxy = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[] {Person.class}, stuHandler);
		
		stuProxy.giveMoney();
		
		Person dog = new Animal("dog");
		InvocationHandler aniHandler = new StudentInvationHandler<Person>(dog);
		Person aniProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[] {Person.class}, aniHandler);
		aniProxy.giveMoney();
		
	}

}
