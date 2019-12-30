package proxy.staticproxy;

public class Test {

	public static void main(String[] args) {
		
		Person jason = new Student("Jason");

		Person monitor = new StudentsProxy(jason);
		
		monitor.giveMoney();

	}

}
