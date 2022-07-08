
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

	}

}
