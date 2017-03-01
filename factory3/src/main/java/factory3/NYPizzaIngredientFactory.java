package factory3;

/**
 * 创建具体的原料工厂。该具体工厂只需要继承PizzaIngredientFactory，然后实现里面的方法即可。
 * 纽约原料工厂：NYPizzaIngredientFactory.java。
 * 
 * @author kelvin
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Clams createClams() {
		return new FreshClams();
	}

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] =  {new Veggies(),new Veggies(),new Veggies(),new Veggies()};
		return veggies;
	}

}
