package NckHomeWork1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This program is my homework on Java 3 GeekBrain courses
 * <p>
 * * @author  Nick1986
 * * @version 1.0
 * * @since   2021-04-09
 */

public class MainHW1 {

	public static void main(String[] args) {

		Integer[] array = {22, 87, 648, 245, 2, 0, 184, 5, 56, 15};
		System.out.println(Arrays.toString(array));
		swapTwoArrayElements(array, 2, 4);
		System.out.println(Arrays.toString(array));

		ArrayList<Integer> arrayList = convertArrayToArrayList(array);
		System.out.println(arrayList);


		Apple apple1 = new Apple();
		Orange orange1 = new Orange();

		Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
		Box<Orange> orangeBox = new Box<>(new Orange());

		System.out.println("Apple weight: " + apple1.getWeight());
		System.out.println("Orange weight: " + orange1.getWeight());

		System.out.println("Apple box weight: " + appleBox.getWeight());
		System.out.println("Orange box weight: " + orangeBox.getWeight());

		appleBox.addFruit(apple1);
		System.out.println("Add apple: " + appleBox.getWeight());
		orangeBox.addFruit(orange1);
		System.out.println("Add orange: " + orangeBox.getWeight());

		System.out.println("Compare Apples and Oranges box weight: " + appleBox.compare(orangeBox));
	}


	public static <T> void swapTwoArrayElements(T[] array, int firstIndex, int secondIndex) {

		if (array == null) {
			System.out.println("Array is not initialized");
			return;
		}
		if (firstIndex < 0 || firstIndex > array.length - 1) {
			System.out.println("fristIndex out of array bounds");
			return;
		}
		if (secondIndex < 0 || secondIndex > array.length - 1) {
			System.out.println("secondIndex out of array bounds");
			return;
		}
		if (firstIndex == secondIndex) return;

		T tmp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = tmp;
	}

	/**
	 * Convert array to ArrayList
	 *
	 * @param <T>   type of array data
	 * @param array array of values
	 * @return new ArrayList with values from array
	 */
	public static <T> ArrayList<T> convertArrayToArrayList(T[] array) {

		if (array == null) {
			System.out.println("Array is not initialized");
			return null;
		} else {
			return new ArrayList<>(Arrays.asList(array));
		}
	}
}
