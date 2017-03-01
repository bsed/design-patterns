package builder;

/**
 * KFC的服务员，它相当于一个指挥者，它决定了套餐是的实现过程，然后给你一个完美的套餐。
 * 
 * @author kelvin
 *
 */
public class KFCWaiter {
	private MealBuilder mealBuilder;

	public void setMealBuilder(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}

	public Meal construct() {
		// 准备食物
		mealBuilder.buildFood();
		// 准备饮料
		mealBuilder.buildDrink();

		// 准备完毕，返回一个完整的套餐给客户
		return mealBuilder.getMeal();
	}
}
