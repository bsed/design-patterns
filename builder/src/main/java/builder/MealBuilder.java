package builder;

public abstract class MealBuilder {
	Meal meal = new Meal();
	/**
	 * 准备食物
	 */
	public abstract void buildFood();
	/**
	 * 准备饮料
	 */
	public abstract void buildDrink();

	public Meal getMeal() {
		return meal;
	}
}
