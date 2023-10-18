public class _09BuilderPatternDemo {
   public static void main(String[] args) {
   
      MealBuilder mealBuilder = new MealBuilder();

      Meal vegMeal = mealBuilder.prepareVegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " + vegMeal.getCost());

      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
      System.out.println("\n\nNon-Veg Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " + nonVegMeal.getCost());

      Meal vegPizza = mealBuilder.preparePizza();
      System.out.println("\n\nveg Pizza");
      vegPizza.showItems();
      System.out.println("Total Cost" +vegPizza.getCost());

   }
}//The word water is not "water"
