
public class AssociateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Write a function that takes two array(string) of same size,
//the thrid perimeter is one string
//Expectation: it returns the corresponding index of the string if it exists
//First array = ["Fruit", "Vegetable", "Fish", "Mammal"]
//Second array = ["Mango", "Carrot", "Catfish", "Ape"]
//Third perimeter = vegetable
//the function should return carrot

		String array1[] = { "Fruit", "Vegetable", "Fish", "Mammal" };
		String array2[] = { "Mango", "Carrot", "Catfish", "Ape" };

		findAssociateData(array1, array2, "Vegetable");
	}

	public static void findAssociateData(String arr1[], String arr2[], String key) {

		for (int i = 0; i < arr1.length; i++) {
			if (key.equals(arr1[i])) {
				System.out.println(arr2[i]);
			}
		}

	}
}