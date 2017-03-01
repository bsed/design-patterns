package singleton;

public class Singleton1 {
	// 利用静态变量来记录Singleton的唯一实例
	private static Singleton1 instance;

	/*
	 * 构造器私有化，只有Singleton类内才可以调用构造器
	 */
	private Singleton1() {

	}

	public static synchronized Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}

		return instance;
	}
}
