public class Week3Main {
	public static void main(String[] args) {
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		System.out.println("============== 1 ============");
		//1.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//a.
		System.out.println(ages[ages.length-1]-ages[0]);
		
		//b.
		int[] temp = {3, 9, 23, 64, 2, 8, 28, 93, 57};
		ages =  temp; /*cannot use a constant array 
		unless ages is being initialized, so I made a new one called temp to assign it to ages */
		System.out.println(ages[ages.length-1]-ages[0]);
		
		//c.
		int sum = 0;
		for(int i = 0; i<ages.length; i++) {
			sum += ages[i];
		}
		double average = (double)sum/ages.length;
		System.out.println(average);
		
		System.out.println("========= 2 ===========");
		/*
		 * 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 * a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		 * b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		 * */
		
		//2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//a.
		sum = 0;
		for(String name : names) {
			sum += name.length();
		}
		average = (double)sum/names.length;
		System.out.println(average);
		
		//b.
		String concatenation = "";
		for(String name : names) {
			concatenation += name + " ";
		}
		System.out.println(concatenation);
		
		/*
		 * 5.	Create a new array of int called nameLengths.
		 * Write a loop to iterate over the previously created names array and
		 * add the length of each name to the nameLengths array.
		 * 
		 */
		System.out.println("======= 5 ==========");
		int[] nameLengths = new int[names.length];
		for(int i = 0; i<names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		/*
		 * 6.	Write a loop to iterate over the nameLengths array and calculate
		 * the sum of all the elements in the array. Print the result to the console.
		 * 
		 */
		System.out.println("======= 6 ==========");
		sum = 0;
		for(int element : nameLengths) {
			sum += element;
		}
		System.out.println(sum);
		
		
		
		System.out.println("======= 7 ==========");

	}
	
	/*
	 * 7.	Write a method that takes a String, word, and an int, n, as arguments and returns
	 * the word concatenated to itself n number of times.
	 * (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	 */
	public static String concatenator(String word, int n) {
		String str ="";
		for(int i = 0; i<n; i++) {
			str += word;
		}
		return str;
	}
	
/*
 * 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
 * (the full name should be the first and the last name as a String separated by a space).
 */
	public static String fullNameMaker(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	/*
	 * 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	 */
	public static boolean arrayTester(int[] input) {
		int sum = 0;
		for(int number : input) {
			sum += number;
		}
		if(sum>100) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	 */
	public static double arrayAverage(double[] input) {
		double sum = 0;
		for(double n : input) {
			sum += n;
		}
		return (double)sum/input.length;
	}
	
	/*
	 * 11.	Write a method that takes two arrays of double and returns true if the average
	 * of the elements in the first array is greater than the average of the elements in the second array.
	 */
	public static boolean arrayComparer(double[] arr1, double[] arr2) {
		if(arrayAverage(arr1)>arrayAverage(arr2)) {
			return true;
		} else {
			return false;
		}
	}
	
/*
 * 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
 * and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
 */
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if(isHotOutside && moneyInPocket > 10.50) {
		return true;
	} else {
		return false;
	}
}

/*
 * 13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
 */

//This method evaluates whether a product is good depending on how many reviews it has and its star rating.
//(e.g. you wouldn't trust a product with 5 star rating and only 1 review)
//it takes in a star rating and the number of reviews as input.
public static boolean isProductTrustworthy(double stars, int numberOfReviews) {
	//minimum star rating for review.
	double starsThreshold = 4.5;
	//minimum number of reviews
	int minReviews = 10;
	
	if(stars >= starsThreshold && numberOfReviews >= minReviews) {
		return true;
	}
	return false;
}
	
}
