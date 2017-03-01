package factory;
/**
 * 专门用于创建披萨的工厂类
 * @author kelvin
 *
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizze();
		}

		return pizza;
	}
}
