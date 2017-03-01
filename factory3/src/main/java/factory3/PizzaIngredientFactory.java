package factory3;

public interface PizzaIngredientFactory {

	/**
	 * 
	 * 在接口中，每个原料都有一个对应的方法创建该原料
	 * 该工厂为抽象工厂，负责创建所有的原料。
	 * @return
	 */
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClams();
}
