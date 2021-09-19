package com.PracticeProgram;

import java.io.Console;
import java.util.Scanner;

public class HelloWorld {
	


	 public static void main(String[]args) {
		 //1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. 
			 //System.out.println("Hello World\nAshish"); 
		 
		 //2. Write a Java program to print the sum of two numbers.
			 //System.out.println(74 + 36);
		 
		 //3. Write a Java program to divide two numbers and print on the screen.
			 //System.out.println(50/3);
		 
		 /**
		  * 4. Write a Java program to print the result of the following operations.
		 System.out.println(-5 + 8 * 6);
		 System.out.println((55+9) % 9);
		 System.out.println(20 + -3*5 / 8);
		 System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		 **/
		 
		 /**5. Write a Java program that takes two numbers as input and display the product of two numbers.
		 Input first number: 25
		 Input second number: 5
		 Expected Output :
		 25 x 5 = 125
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Input first number: ");
		 int a = sc.nextInt();
		 System.out.println("Input second number:");
		 int b = sc.nextInt();
		 
		 System.out.println(a + " x " +b+ " = " +a*b);
		 **/
		 
		 /*6. Write a Java program to print the sum (addition), 
		  * multiply, subtract, divide and remainder of two numbers.
		  * Input first number: 125
		  * Input second number: 24
		  
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Input first number:");
		 int a = sc.nextInt();
		 
		 System.out.println("Input second number");
		 int b = sc.nextInt();
		 
		 System.out.println(a + " + " +b+ " = " +(a+b));
		 System.out.println(a + " - " +b+ " = " +(a-b));
		 System.out.println(a + " x " +b+ " = " +(a*b));
		 System.out.println(a + " / " +b+ " = " +(a/b));
		 System.out.println(a + " % " +b+ " = " +(a%b));
		 */
		 
		 /*7. Write a Java program that takes a number as input and 
		 	  prints its multiplication table upto 10.
		 	  Input a number: 8
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Input a number: ");
		 int a = sc.nextInt();
		 
		 for (int i = 1; i<= 10; i++) {
			 System.out.println(a + " x " +i+ " = " +(i*a));
		 }
		 */
		 
		 /*
		 8. Write a Java program to display the following pattern.

		    J    a   v     v  a                                                  
		    J   a a   v   v  a a                                                 
		 J  J  aaaaa   V V  aaaaa                                                
		  JJ  a     a   V  a     a
		 
		  
		    System.out.println("   J    a   v     v  a ");
	        System.out.println("   J   a a   v   v  a a");
	        System.out.println("J  J  aaaaa   V V  aaaaa");
	        System.out.println(" JJ  a     a   V  a     a");
	        
	        */
		 
		 /*
		  * 9. Write a Java program to compute the specified expressions 
		       and print the output.
			   ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
		  
		 System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		 */
		 
		 /*
		  * 10. Write a Java program to compute a specified formula.
		        4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
		 
		 System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		 
		 */
		 
		 /*
	11. Write a Java program to print the area and perimeter of a circle. 
				Radius = 7.5
				
				Expected Output
				Perimeter (C=2πr) is = 47.12388980384689
				Area (A = πr^2) is = 176.71458676442586
				
		  
		 System.out.println("Area is = " + (3.1416 * 7.5 * 7.5));
		 System.out.println("Perimeter is = " + (2 * 3.1416 * 7.5 ));
		 */
		 
		 /*
		   12. Write a Java program that takes three numbers 
		       as input to calculate and print the average of the numbers.
		  
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Number one is: ");
		 int a = sc.nextInt();
		 
		 System.out.println("Number two is: ");
		 int b = sc.nextInt();
		 
		 System.out.println("Number three is: ");
		 int c = sc.nextInt();
		 
		 System.out.println("Sum of numbers is: "+(a + b + c));
		 System.out.println("Average is: "+((a + b + c)/3));
		 */
		 
		 /*
		 13. Write a Java program to print the area(A=wl) 
		     and perimeter(P=2(l+w)) of a rectangle.
		     Width = 5.5 Height = 8.5
		 
		 Double Width = 5.5 ;
		 Double Height = 8.5;
		 
		 System.out.println("Area of rectangle is:"+(Width*Height));
		 System.out.println("Perimeter of rectangle is:"+(2*(Width+Height)));
		 */
		 
		/*
		  14. Write a Java program to print an American flag on the screen.
		 		* * * * * * ==================================                          
		 		 * * * * *  ==================================                          
		 		* * * * * * ==================================                          
		 		 * * * * *  ==================================                          
		 		* * * * * * ==================================                          
		 		 * * * * *  ==================================                          
		 		* * * * * * ==================================                          
		 		 * * * * *  ==================================                          
		 		* * * * * * ==================================                          
				==============================================                          
				==============================================                          
				==============================================                          
				==============================================                          
				==============================================                          
				==============================================
		 */
		 
		 /*
		 System.out.println("				* * * * * * ==================================                          \r\n" + 
		 		"		 		 * * * * *  ==================================                          \r\n" + 
		 		"		 		* * * * * * ==================================                          \r\n" + 
		 		"		 		 * * * * *  ==================================                          \r\n" + 
		 		"		 		* * * * * * ==================================                          \r\n" + 
		 		"		 		 * * * * *  ==================================                          \r\n" + 
		 		"		 		* * * * * * ==================================                          \r\n" + 
		 		"		 		 * * * * *  ==================================                          \r\n" + 
		 		"		 		* * * * * * ==================================                          \r\n" + 
		 		"				==============================================                          \r\n" + 
		 		"				==============================================                          \r\n" + 
		 		"				==============================================                          \r\n" + 
		 		"				==============================================                          \r\n" + 
		 		"				==============================================                          \r\n" + 
		 		"				==============================================");
		 		
		 		*/
		 
		 
		 /*
		  * 15. Write a Java program to swap two variables.
		  
		 
		 int a = 1;
		 int b = 2;
		 int temp;
		 
		 System.out.println("Before swapping: "+a+ " , " +b);
		 
//		 temp = a;
//		 a = b;
//		 b = temp;
		 
		 a = a + b;
		 b = a - b;
		 a = a - b;
		 
		 
		 System.out.println("After swapping: "+a+ " , " +b);
		 */
		 
		 /*
		  * 16. Write a Java program to print a face.

 +"""""+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+
		  
		 System.out.println(" +\"\"\"\"\"+");
		 System.out.println("[| o o |]");
		 System.out.println(" |  ^  |");
		 System.out.println(" | '-' |");
		 System.out.println(" +-----+");
		 */
		 
		 /*
		    17. Write a Java program to add two binary numbers.
				Input Data:
				Input first binary number: 10
				Input second binary number: 11
		  
		 
		 long binary1, binary2;
		  int i = 0, remainder = 0;
		  int[] sum = new int[20];
		  Scanner in = new Scanner(System.in);

		  System.out.print("Input first binary number: ");
		  binary1 = in.nextLong();
		  System.out.print("Input second binary number: ");
		  binary2 = in.nextLong();

		  while (binary1 != 0 || binary2 != 0) 
		  {
		   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
		   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
		   binary1 = binary1 / 10;
		   binary2 = binary2 / 10;
		  }
		  if (remainder != 0) {
		   sum[i++] = remainder;
		  }
		  --i;
		  System.out.print("Sum of two binary numbers: ");
		  while (i >= 0) {
		   System.out.print(sum[i--]);
		  }
		   System.out.print("\n"); 
		   
		   */
		 
		 /* 18. Write a Java program to multiply two binary numbers. 
				Input Data:
				Input the first binary number: 10
				Input the second binary number: 11
		  
		 long binary1, binary2, multiply = 0;
		  int digit, factor = 1;
		  Scanner in = new Scanner(System.in);
		  System.out.print("Input the first binary number: ");
		  binary1 = in.nextLong();
		  System.out.print("Input the second binary number: ");
		  binary2 = in.nextLong();
		  while (binary2 != 0)
		  {
		   digit = (int)(binary2 % 10);
		   if (digit == 1) 
		   {
		    binary1 = binary1 * factor;
		    multiply = binaryproduct((int) binary1, (int) multiply);
		   } 
		   else
		   {
		    binary1 = binary1 * factor;
		   }
		   binary2 = binary2 / 10;
		   factor = 10;
		  }
		  System.out.print("Product of two binary numbers: " + multiply+"\n");
		 }
		 static int binaryproduct(int binary1, int binary2) 
		 {
		  int i = 0, remainder = 0;
		  int[] sum = new int[20];
		  int binary_prod_result = 0;

		  while (binary1 != 0 || binary2 != 0) 
		  {
		   sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
		   remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
		   binary1 = binary1 / 10;
		   binary2 = binary2 / 10;
		  }
		  if (remainder != 0)
		  {
		   sum[i++] = remainder;
		  }
		  --i;
		  while (i >= 0) 
		  {
		   binary_prod_result = binary_prod_result * 10 + sum[i--];
		  }
		  return binary_prod_result;
		  
		  */
		 
		 /*
		 int n;
		 System.out.print("Input a Decimal Number : ");
		 Scanner in=new Scanner(System.in);
		 n=in.nextInt();
		 System.out.print("Binary number is:");
		 for(int i=-1;i<=n;i++){
		 System.out.print(n%2);
		 n=n/2;
		 }
		 */
		 
		 /* Write a Java program to check whether Java is installed on your computer.
		 
		 System.out.println("\nJava Version: "+System.getProperty("java.version"));
		    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
		    System.out.println("Java Home: "+System.getProperty("java.home"));
		    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
		    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
		    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
		   	*/
		 /*
		    32. Write a Java program to compare two numbers. 
				Input first integer: 25
				Input second integer: 39 
		  
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Input first integer : ");
		 int a = sc.nextInt();
		 
		 System.out.println("Input second integer : ");
		 int b = sc.nextInt();
		 
		 if(a==b) {
			 System.out.printf( "%d == %d\n", a, b );
		 }
		 if(a!=b) {
			 System.out.printf( "%d != %d\n", a, b );
		 }
		 if(a>=b) {
			 System.out.printf( "%d >= %d\n", a, b );
		 }
		 if(a<=b) {
			 System.out.printf( "%d <= %d\n", a, b );
		 }
		 if(a>b) {
			 System.out.printf( "%d > %d\n", a, b );
		 }
		 if(a<b) {
			 System.out.printf( "%d < %d\n", a, b );
		 }
		 */
		 /*
		  * 33. Write a Java program and compute the sum of the digits of an integer.
				Input an integer: 25
		  
		 Scanner input = new Scanner(System.in);
	        System.out.print("Input an integer: ");
	        long n = input.nextLong();
	        System.out.println("The sum of the digits is: " + sumDigits(n));

	    }

	    public static int sumDigits(long n) {
	        int sum = 0;
	        while (n != 0) {
	            sum += n % 10;
	            n /= 10;
	        }
	        return sum;
	        */
		 
		 /*
		  * 34. Write a Java program to compute the area of a hexagon.
				Area of a hexagon = (6 * s^2)/(4*tan(π/6))
		  
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.printf( "Input the length of a side of the hexagon: " );
		 Double d = sc.nextDouble();
		 System.out.print("The area of the hexagon is: " + hexagonArea(d)+"\n");
	    }
	    public static double hexagonArea(double d) {
	        return (6*(d*d))/(4*Math.tan(Math.PI/6));
	    
	    */
		 /*
		  * 37. Write a Java program to reverse a string. Go to the editor
				Input a string: The quick brown fox
		  
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Input a string: ");
	        char[] letters = scanner.nextLine().toCharArray();
	        System.out.print("Reverse string: ");
	        for (int i = letters.length - 1; i >= 0; i--) {
	            System.out.print(letters[i]);
	        }
	        System.out.print("\n");
	        */
		 
		 /*
		  * 38. Write a Java program to count the letters, spaces, numbers and other characters of an input string. 
				Expected Output
				The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
				letter: 23                                               
				space: 9                                                 
				number: 10                                               
				other: 6
		  
	        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
			count(test);

		}
		public static void count(String x){
			char[] ch = x.toCharArray();
			int letter = 0;
			int space = 0;
			int num = 0;
			int other = 0;
			
			for(int i = 0; i < x.length(); i++){
				if(Character.isLetter(ch[i])){
					letter ++ ;
				}
				else if(Character.isDigit(ch[i])){
					num ++ ;
				}
				else if(Character.isSpaceChar(ch[i])){
					space ++ ;
				}
				else{
					other ++;
				}
			}
			System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("other: " + other);
			*/
			
		 /*
		  * Write a Java program to input and display your password.
			Expected Output
			Input your Password:                                                    
			Your password was: abc@123
		  
			Console cons;
			if ((cons = System.console()) != null) {
				char[] pass_ward = null;
				try {
					pass_ward = cons.readPassword("Input your Password:");
					System.out.println("Your password was: " + new String(pass_ward));
				} finally {
					if (pass_ward != null) {
						java.util.Arrays.fill(pass_ward, ' ');
					}
				}
			} else {
				throw new RuntimeException("Can't get password...No console");
			}
			*/
		 
			/*
			    36. Write a Java program to compute the distance between two points on the
			     	surface of earth. Go to the editor
					Distance between the two points [ (x1,y1) & (x2,y2)]
					d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
					Radius of the earth r = 6371.01 Kilometers
					Input Data:
					Input the latitude of coordinate 1: 25
					Input the longitude of coordinate 1: 35
					Input the latitude of coordinate 2: 35.5
					Input the longitude of coordinate 2: 25.5
					Expected Output

					The distance between those points is: 1480.0848451069087 km 
			 
		 
		 Scanner input = new Scanner(System.in);
	        System.out.print("Input the latitude of coordinate 1: ");
	        double lat1 = input.nextDouble();
	        System.out.print("Input the longitude of coordinate 1: ");
	        double lon1 = input.nextDouble();
	        System.out.print("Input the latitude of coordinate 2: ");
	        double lat2 = input.nextDouble();
	        System.out.print("Input the longitude of coordinate 2: ");
	        double lon2 = input.nextDouble();

	        System.out.print("The distance between those points is: " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");
	    }

	    // Points will be converted to radians before calculation
	    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
	        lat1 = Math.toRadians(lat1);
	        lon1 = Math.toRadians(lon1);
	        lat2 = Math.toRadians(lat2);
	        lon2 = Math.toRadians(lon2);

	        double earthRadius = 6371.01; //Kilometers
	        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
	 */
		 /*
		 Scanner sc = new Scanner(System.in);
         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");

	        for(int i=1;i< rows+1 ;i++)
	        {
	            for(int j=i; j < rows+1 ;j++)
	            {
	                System.out.print(j + " ");
	            }
	            for(int k=1; k < i ;k++)
	            {
	                System.out.print(k + " ");
	            }
	            System.out.println();
	        }
	        
	        sc.close();
	        
	        */
	        
		 /*Q.1 Print this pattern
		 1 
		 2 3
		 4 5 6
		 7 8 9 10
		       
		 
	        System.out.println("How many rows you want in this pattern?");
	         
	        Scanner sc = new Scanner(System.in);
	         
	        int noOfRows = sc.nextInt();
	         
	        int value = 1;
	         
	        System.out.println("Here is your pattern :");
	         
	        for (int i = 1; i <= noOfRows; i++) 
	        {
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print(value+"\t");
	                 
	                value++;
	            }
	             
	            System.out.println();
	        }
	        */
		 
		 /*
		      1234
		       567
		        89
		         10 
		  
		 
	        int star=4;
	        int space=0;
	        int no=1;
	        
	        for(int  i=1;i<=4;i++)
	        {
	         
	        	for(int j=1;j<=space;j++)
	         {
	          
	        		System.out.print(" ");
	         }
	         
	        	for(int k=1;k<=star;k++)
	         {
	          
	        		System.out.print(no);
	           		no++;
	         }
	           	star--;
	           	space++;
	              	System.out.println();
	        }
	        
	        */
	        
	       /* 
	        write a boolean method called contains() which takes an array of int and an int;
	         and returns true if the array contains the given int,The methods signature is as 
	         follows: public static boolean contains(int[] array, int key)
	         
		 public static boolean contains(int[] arr, int item) {
		      for (int n : arr) {
		         if (item == n) {
		            return true;
		         }
		      }
		      return false;
		   }
		   public static void main(String[] args) {
		          int[] my_array1 = {
		            1789, 2035, 1899, 1456, 2013, 
		            1458, 2458, 1254, 1472, 2365, 
		            1456, 2265, 1457, 2456};
		      System.out.println(contains(my_array1, 2013));
		      System.out.println(contains(my_array1, 2015));
		      */
		      
		      /*
		       * initialize one array with the first 5 even numbers, 
		       * the Second array with the first five odd number, 
		       * and construct the third array such that each member 
		       * of the third array is the sum of corresponding elements of the first two arrays.
		       
		      int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		        int even = 0, odd = 0;
		 
		        // Loop to find even, odd sum
		        for (int i = 0; i < arr.length; i++) {
		            if (i % 2 == 0)
		                even += arr[i];
		            else
		                odd += arr[i];
		        }
		 
		        System.out.println("Even index positions sum: " + even);
		        System.out.println("Odd index positions sum: " + odd);
		        
		        */
		 
		 /*
		  * Write a program to remove duplicate sorted array
		  
		 
		 static int removeDuplicates(int arr[], int n)
		    {
		        // Return, if array is empty
		        // or contains a single element
		        if (n==0 || n==1)
		            return n;
		      
		        int[] temp = new int[n];
		         
		        // Start traversing elements
		        int j = 0;
		        for (int i=0; i<n-1; i++)
		            // If current element is not equal
		            // to next element then store that
		            // current element
		            if (arr[i] != arr[i+1])
		                temp[j++] = arr[i];
		         
		        // Store the last element as whether
		        // it is unique or repeated, it hasn't
		        // stored previously
		        temp[j++] = arr[n-1];  
		         
		        // Modify original array
		        for (int i=0; i<j; i++)
		            arr[i] = temp[i];
		      
		        return j;
		    }
		     
		    public static void main (String[] args)
		    {
		        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		        int n = arr.length;
		         
		        n = removeDuplicates(arr, n);
		  
		        // Print updated array
		        for (int i=0; i<n; i++)
		           System.out.print(arr[i]+" ");
		           
		           */
		 
		 
		 /*
		   write a java program that reads numbers from the user, until the number 0 
		   is encountered or 20 numbers have been inputed. the number must be saved an array. 
		   your program should scan the stored data and print the any of the following: 
		   a. How many numbers are < 50 
		   b. what is the average of all the numbers.
		 */
		    Scanner in = new Scanner(System.in);
	        int arr[] = new int[20];
	        int count = 0;
	        
	        System.out.println("Enter 20 numbers");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = in.nextInt();
	        }
	        // getting array length
	        int length = arr.length;
	 
	        // default sum value.
	        int sum = 0;
	        
	       // sum of all values in array using for loop
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	 
	        double average = sum / length;
	        System.out.println("Average of all numbers are : "+average);
	        
	        for (int i = 0; i < arr.length; i++) {

	        	if (arr[i] < 50 ) {
		        	count++;
	        		System.out.print(arr[i]+",");
		        	}
	        	}
	         System.out.print(" are less then 50. \n");
             System.out.println(count+" Number in the entered integer are less then 50.");
	   }
}
