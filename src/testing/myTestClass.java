package testing;

import java.util.Arrays;
import java.util.Scanner;

public class myTestClass {

//	static String repeatWord(String userWord, int numTimes) {
//		
//	    // WRITE YOUR CODE HERE
//	
//	    String result = "";
//		for(int i = 0; i < numTimes; i++){
//			result +=userWord;
//	    }
//        return result;
//	}
//
//
//
//
//
///***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 
////	}
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int numTimes;
//		String userWord;
//		userWord = "hop ";
//		numTimes = 4;
//		System.out.println(repeatWord(userWord,numTimes));
//	}
	
	
//	public static void main(String[] args) {
//        System.out.println(divideNums(5, 0));
//    }
//    static double divideNums(int a, int b){
//        return a/b;
//    }
//    
//    public static int returnSum(int x, int y, int z){
//		int answer = x + y + z;
//        return answer;
//    }
//    public static void main(String[] args) {
//        int a = 10, b = 10, c = 10;
//        System.out.println(returnSum(a,b,c));
//    }
//    
//	static int sumOfDigits(int digits) {
//	    
//	    // WRITE YOUR CODE HERE
//		int result = 0;
//        while (digits > 0) {
//        	result += digits % 10; // get the first number
//        	digits /= 10; //delete the last number
//        }
//
//        return result;
//	}
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int digits = 53;
//		int sumAll = sumOfDigits(digits);
//		System.out.println("The sum of all digits for the value " + digits + " is " + sumAll + ".");
//	}
	
//	public static void main(String[] args) {
//	int addItUp = followTheMath(10, 5, 8, 11);
//}
//	static int followTheMath(int num1, int num2, int num3, int num4){
//	    int total = 0;
//	    if (num1 < num4){
//	        total += num2;
//	    }
//	    if (num2 == num3){
//	        total += num4;
//	    } else {
//	        total += num1;
//	    }
//	    total += num3;
//	    return num3;
//	}
	
//	static boolean passwordChecker(String password) {
//		
//		// WRITE YOUR CODE HERE
//		if (password.length() >= 8 && 
//			    (password.contains("!") ||
//			     password.contains("$") ||
//			     password.contains("%") || 
//			     password.contains("&"))) {
//			         return true;
//			     }
//			return false;
//	}
//	
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String password = "passwordcheck";
//        boolean meetsRequirement = passwordChecker(password);
//		if (meetsRequirement) {
//		    System.out.println(password + " meets the requirements.");
//		} else {
//		    System.out.println(password + " does not meet the requirements.");
//		}
//	}
	
//	public static void main(String[] args) {
//	    String iCanRetire = readyForTheBeach(64);
//	    System.out.println(iCanRetire);
//	}
//	
//	static String readyForTheBeach(int age){
//	    if (age < 30){
//	        return "Only if you built Facebook or Google";
//	    }
//	    if (age < 50){
//	        return "Perhaps if you lived a frugal life and worked a couple of jobs at a time.";
//	    }
//	    if (age < 65){
//	        return "You are getting closer...";
//	    } else {
//	        return "You can call it quits!";
//	    }
//	}
	
//		static int avgNameLength(String[] names) {
//			
//			// WRITE YOUR CODE HERE
//				
//			int totalLength = 0;
//
//	        // Traverse the array to calculate the total length of all names
//	        for (String name : names) {
//	            totalLength += name.length();
//	        }
//
//	        // Calculate and return the average length
//	        return totalLength / names.length;
//	   
//			
//			
//			
//	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//		}
//
//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//			String[] names;
//			names = new String[5];
//			names[0] = "Jose";
//			names[1] = "James";
//			names[2] = "Roberto";
//			names[3] = "Theodore";
//			names[4] = "Fred";
//			
//			int avgLength = avgNameLength(names);
//			System.out.println("The average name length is " + avgLength + ".");
//		}
	
			// WRITE YOUR CODE HERE
//		public static int rectanglePerimeter(int length, int width) {
//			int perimeter = length * 2 + width * 2;
//			return perimeter;
//		}
//			
//			
//			
//
//	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//		public static void main(String[] args) {
//			Scanner in = new Scanner(System.in);
//		    int length = 4;
//			int width = 4;
//			int perimeter = rectanglePerimeter(length, width);
//			System.out.println("The rectangle has a perimeter of " + perimeter + ".");
//		}

	
//	public static void main(String[] args) {
//
//        int[] numbers = {1, 1, 1, 1, 1};
//        int sum = 0;
//        for (int number : numbers){
//	        sum += number;
//	    }
//        System.out.println(sum);
//	}
	
	static void addX(int[] arr, int x) {
		System.out.println("**Original**"); // Keep this print statement
		
         // WRITE YOUR CODE HERE FOR PART 1
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Print original value
            arr[i] += x; // Add x to each element
        }

        	// or 
//        for (int a : arr) {
//            System.out.println(a); // Print original value
//            a += x; // Add x to each element
//        }


    
//    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	
//		System.out.println("**New Array**"); // Keep this print statement
//    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//
//        // WRITE YOUR CODE HERE FOR PART 2 
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]); // Print updated value
//        }
//
//
//
//
//    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 
//	}
//	public static void main(String[] args) {
////		Scanner in = new Scanner(System.in);
//		int x;
//		int[] arr = { 5, 10, 44, -4, 10 };
//		x = 10;
//		addX(arr, x);
//	}
        
//        public static void main(String[] args){
//            String[] firstNames = {"Mike", "Joe", "Brian", "Nick", "Carl"};
//            String [] lastNames = {"Jones", "Thompson", "Walton", "Bird", "Jordan"};
//            System.out.println(firstNames[1] + " " + lastNames[3]);
//        }
        
//    	static void changeTwo(int a, int b, int[] arr) {
//    		/****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
//
//    		        // WRITE YOUR CODE HERE
//    		        arr[0] = a;
//    		        int lastIndex = arr.length - 1; 
//    		        arr[lastIndex] = b;
//    		         for (int number : arr){
//    		             System.out.println(number);
//    		         }
//    		         
//    		         
//    		         
//    		         
//    		         
//    		        
//    		/****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/ 	
//    			}
//
//    			public static void main(String[] args) {
//    				Scanner in = new Scanner(System.in);
//    				int a,b;
//    				a = 1;
//    				b = 1;
//    				int[] arr = { 3, 7, 0, 4, -6, 10, 55 };
//    				changeTwo(a, b, arr);
//    			}
 
//        public static void main(String[] args){
//            int[] arr = new int[5];
//            arr[3] = 12;
//            System.out.println(arr.length);
//        }
        
//    	static void charArray(String userWord) {
//        /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//
//            // WRITE YOUR CODE HERE FOR
//
//    		char[] charArray = new char[userWord.length()];
//
//            // Populate the char array with characters from userWord
//            for (int i = 0; i < userWord.length(); i++) {
//                charArray[i] = userWord.charAt(i);
//            }
//
//            // Print each element of the char array
//             for (char c : charArray) {
//                System.out.println(c);
//            }
//  
//
//        /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	
//    	}
//    	public static void main(String[] args) {
//    		Scanner in = new Scanner(System.in);
//    		String word;
//    		word = "Hello";
//    		charArray(word);
//    	}
        
//    	static char[] wordToArray(String userWord) {
//    	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//
//    	        // WRITE YOUR CODE HERE
//    		    char[] charArray = new char[userWord.length()];
//    			for (int i = 0; i < userWord.length(); i++) {
//    			    charArray[i] = userWord.charAt(i);
//    			}
//    			
//    			return charArray;
//
//    	    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	 
//    		}
//
//    		 public static void main(String[] args) {
//    			Scanner in = new Scanner(System.in);
//    			String userWord;;
//    			userWord = in.nextLine();
//    			System.out.println("Your array is: ");
//    			System.out.println(Array.toString(wordToArray(userWord)));
//    		}
//    	}
        
//        public static void main(String[] args) {
//    	String[] passwords = new String[3];
//        
//        passwords[0] = "421499!";
//        passwords[1] = "cVTT1290?";
//        passwords[2] = "11?1!cV32A";
//
//        for ( String str : passwords ){
//            if (str.length() > 7 && str.contains("?")){
//                System.out.println(str);
//            }
//        } 
//	}
//        
        
//    	static int[] buildArray(int num) {
//    	    
//    	    // WRITE YOUR CODE HERE
//    		int[] numArray = new int[num];
//    		
//    		for(int i = 0; i < num; i++) {
//    			numArray[i] = i;
//    		}
//    			
//    		return numArray;
//
//
//
//
//
//    	/****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
//    		}
//    		public static void main(String[] args) {
//    			Scanner in = new Scanner(System.in);
//    			int num;
//    			num = 8;
//    			System.out.println("Your array is: ");
//    			System.out.println(Arrays.toString(buildArray(num)));
//    		}
    		
//        static int createInt(int num1, int num2, int num3, int num4, int num5, int num6) {
//        	/****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
//
//        	        // WRITE YOUR CODE HERE
//        		int[] arrayInt = {num1, num2, num3, num4, num5, num6};
//        		return arrayInt[arrayInt.length - 1];
//        		
//        	        
//        	/****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
//        		}
//        		public static void main(String[] args) {
//        			Scanner in = new Scanner(System.in);
//        			int num1, num2, num3, num4, num5, num6; 
//        			num1 = 1;
//        			num2 = 2;
//        			num3 = 3;
//        			num4 = 4;
//        			num5 = 5;
//        			num6 = 9;
//        			int returnedInt = createInt(num1, num2, num3, num4, num5, num6);
//        			System.out.println("The last number of the array is " + returnedInt + ".");
//        		}

//        static void newArray(String word1, String word2, String word3, String[] arr) {
//        	
//        	// WRITE YOUR CODE HERE
//        	String[] newArray = {word1, word2, word3};
//        	
//        	String[] combinedArray = new String[arr.length + newArray.length];
//        	
//        	for (int i = 0; i < arr.length; i++) {
//                combinedArray[i] = arr[i];
//            }
//
//            // Add elements from newArr into combinedArray
//            for (int i = 0; i < newArray.length; i++) {
//                combinedArray[arr.length + i] = newArray[i];
//            }
//	
//        	for(String team : combinedArray)
//            System.out.println(team);	
//        		
//        	
//        /****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
//        	}
//
//        	public static void main(String[] args) {
//        		Scanner in = new Scanner(System.in);
//        		String[] arr = {"Astros", "Reds", "Phillies", "Dodgers", "Angels"};
//        		String word1, word2, word3;
//        		word1 = "Yankees";
//        		word2 = "Orioles";
//        		word3 = "Mariners";
//        		newArray(word1, word2, word3, arr);
//        		
//        	}
        
//        int[] arr = { -11, 43, 901, 72, -5};
//        int[] arr2 = arr.clone();
//
//        System.out.println(arr2[3]);
//        	}

	
    static void reverseArray(int a, int b, int c, int d, int e) {
		
		int[] arr = {a, b, c, d, e};

    /****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
	
	// WRITE YOUR CODE HERE
	int[] reverseArr = new int[arr.length];
	
	for (int i = 0; i < arr.length; i++)
	{
		reverseArr[i] += arr[arr.length -1 -i];
	}
		
	for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
	}
    for (int i = 0; i < reverseArr.length; i++) {
        System.out.println(reverseArr[i]);
    }

		
		
		
		
	
		
    /****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c,d,e;
		a = 50;
		b = 25;
		c = 0;
		d = 25;
		e = 26;
		reverseArray(a, b, c, d, e);
	}
}       

	
	