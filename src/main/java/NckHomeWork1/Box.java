package NckHomeWork1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {

	private ArrayList<T> fruits;
	private float weight;

	public Box() {
		fruits = new ArrayList<>();
		weight = 0.0f;
	}

	public Box(T... fruit) {
		fruits = new ArrayList<>(Arrays.asList(fruit));
	}

	public ArrayList<T> getFruits() {
		return fruits;
	}

	public float getWeight() {
		if (fruits.size() == 0) {
			weight = 0.0f;
		} else {
			weight = fruits.size() * fruits.get(0).getWeight();
		}
		return weight;
	}

	public boolean compare(Box<? extends Fruit> box) {
		return Math.abs(this.weight - box.weight) < 0.00001f;
	}

	public void shiftFruits(Box<T> box) {
		box.fruits.addAll(fruits);
		fruits.clear();
	}

	public void addFruit(T fruit) {
		fruits.add(fruit);
	}
}
