package builder;

/**
 * 套餐A、套餐B。这个两个套餐都是实现抽象套餐类。
 * @author kelvin
 */
public class MealA extends MealBuilder {
	  public void buildDrink() {
	        meal.setDrink("一杯可乐");
	    }

	    public void buildFood() {
	        meal.setFood("一盒薯条");
	    }
}
