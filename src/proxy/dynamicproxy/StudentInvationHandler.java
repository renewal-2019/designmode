package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现InvocationHandler接口的中介类,持有一个<T>类型的被代理对象
 * 在实例化StudentInvationHandler对象时,就可以指定特定类型的成员变量target
 *
 */
public class StudentInvationHandler<T> implements InvocationHandler {

	// invocationHandler持有的被代理对象
	T target;

	public StudentInvationHandler(T target) {
		this.target = target;
	}

	/**
	 * 所有执行代理对象的方法都会被替换成执行invoke方法,
	 *  proxy代表被代理对象 method代表正在执行的方法 
	 *  args表示调用目标方法时传入的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("代理执行" + method.getName() + "方法");
		MonitorUtil.start();
		
		Object result = method.invoke(target, args);
		
		MonitorUtil.finish(method.getName());
		return result;
	}

}
