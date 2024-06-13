package StreamDemoPack;

import java.util.*;
import java.util.stream.Collectors;

class Dish{
	 private int calories;
	    private String name;

	    

		public Dish(int calories, String name) {
	        this.calories = calories;
	        this.name = name;
	    }

	    public int getCalories() {
	        return calories;
	    }

	    public String getName() {
	        return name;
	    }
	    public void setCalories(int calories) {
			this.calories = calories;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Dish [calories=" + calories + ", name=" + name + "]";
		}
}

public class StreamSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> menu=Arrays.asList("");
//		HashMap<Integer, String> menu1=new HashMap<>();
//		
		
//		
		List<Dish> menu=List.of(new Dish(200,"salad"),
								new Dish(300,"vegaitable"),
								new Dish(400,"burger"),
								new Dish(500,"suger")
								);
		
		
		 List<String> lowCaloricDishesName = menu.parallelStream()
		            .filter(d -> d.getCalories() < 400)
		            .sorted(Comparator.comparing(Dish::getCalories))
		            .map(Dish::getName)
		            .collect(Collectors.toList());
		 
		 System.out.println(lowCaloricDishesName);
	}

	

}
