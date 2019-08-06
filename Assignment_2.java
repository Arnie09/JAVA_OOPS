/* 1.Write a program in java which takes a string as input using commandlineargument and check whether it is a pallindrome or not 
   2.Write a program to accept the following city names names as argument in the command line and sort them in alphabetical order.
   for example city name= ( Kolkata, Chennai, Mumbai,Delhi, bangalore , Ahmedabad)
   3.Write a program in 2d array to print the following pattern :
	
	i.	1			ii.	*
		1 0				* *
		1 0 1			* * *
		1 0 1 0			* * * *
*/
class Assignment_2{

	/*function to print patterns */
	public static void print_pattern(int limit){
		char matrix[][] = new char[limit][];
		for(int i =0;i<limit;i++){
			matrix[i] = new char[i+1];
		}
		for(int i = 0;i<limit;i++){
			for (int j = 0;j<i+1;j++){
				if(i>=j){
					if(j%2 == 1)
						matrix[i][j] = '0';
					else
						matrix[i][j] = '1';
				}
			}
		}
		for(int i = 0;i<limit;i++){
			for(int j= 0;j<i+1;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		for(int i = 0;i<limit;i++){
			for (int j = 0;j<i+1;j++){
				if(i>=j){
					matrix[i][j] = '*';
				}
				else
					matrix[i][j] = ' '; 
			}
		}
		for(int i = 0;i<limit;i++){
			for(int j= 0;j<i+1;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	/*function to arrange the city names in ascending order */
	public static void sort_cities(String cities[],int length){
		System.out.println("Unsorted array of cities: ");
		for(int i = 0;i<length;i++){
			System.out.print(cities[i]+" ");
		}
		System.out.println();

		for(int i = 0;i<length;i++){
			for (int j = 0;j<length-i-1;j++){
				if (cities[j].compareTo(cities[j+1])>0){
					String swap = cities[j+1];
					cities[j+1] = cities[j];
					cities[j] = swap;
				}
			}
		}
		for(int i = 0;i<length;i++){
			System.out.print(cities[i]+" ");
		}
		System.out.println();
	}

	/*function to check pallindrome */
	public static void checkPallin(String word){
		String rev_string = "";
		for(char ch: word.toCharArray()){
			rev_string = ch+rev_string;
		}
		if(rev_string.equalsIgnoreCase(word))
			System.out.println("The string is pallindrome!");
		else
			System.out.println("The string is not pallindrome!");
		
	}

	/* maindriver function*/
	public static void main(String args[]){
		int choice = 0;
		choice  = Integer.parseInt(args[0]);

		if(choice  == 1){
			String word = args[1];
			checkPallin(word);
		}
		else if (choice == 2){
			int length = Integer.parseInt(args[1]);
			String city_list[] = new String[length];
			for(int i = 0;i<length;i++){
				city_list[i] = args[i+2];
			}
			sort_cities(city_list,length);
		}
		else if (choice == 3){
			int limit = Integer.parseInt(args[1]);
			print_pattern(limit);
		}
	}
}