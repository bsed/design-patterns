package singleton;

/**
 * 用“双重检查加锁”，在getInstance()中减少使用同步
 * 
 * @author kelvin
 *
 */
public class Singleton3 {
	/*
	 * 利用静态变量来记录Singleton3的唯一实例 volatile 关键字确保：当instance变量被初始化成Singleton3实例时，
	 * 多个线程正确地处理instance变量
	 * 
	 */
	private volatile static Singleton3 instance;

	/*
	 * 构造器私有化，只有Singleton类内才可以调用构造器
	 */
	private Singleton3() {

	}

	/*
	 * 
	 * 检查实例，如果不存在，就进入同步区域
	 */
	public static Singleton3 getInstance() {
		if (instance == null) {
			synchronized (Singleton3.class) { // 进入同步区域
				if (instance == null) { // 在检查一次，如果为null，则创建
					instance = new Singleton3();
				}
			}
		}

		return instance;
	}
}
