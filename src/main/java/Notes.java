class Notes {
	public static void main(String args[]) {

		//creating an array

		//declare the array

		int[] arr;
		//initialize it

		arr = new int[5]; //the number inside the square brackets is the size(length) of the array
		//arrays have a default value according to their data type.
		//for integers it is 0.

		//use the keys to store a value
		arr[0] = 6;
		arr[1] = 5;
		arr[2] = 14;
		arr[3] = 99;
		arr[4] = 6;

		// System.out.println(arr[4]);

		arr = new int[]{1, 3, 5, 7, 9, 11, 13};

		// System.out.println(arr[4]);

		int[] arr2 = {1, 3, 5}; //you can only omit the new int[] part if you are declaring and assigning on the same line.

		// System.out.println(arr[0]);

		// System.out.println(arr);  //DONT DO THIS, this prints out the refernce, not the value.  we don't care about the references.
		
		//modifying arrays - overwriting a value using its key

		System.out.println(arr[6]);
		arr[6] = 1;

		System.out.println(arr[0]);

		func(arr);
		System.out.println(arr[0]);

		String arr3[] = func2();
		System.out.println(arr3[0]);
		
	}
	//functions and arrays

	public static void func(int[] arr) { //this will alter the array outside of the function as well.  Therefore we don't need to return anything and can use void as our return type.
		arr[0] = 5;
	}

	public static String[] func2() { //specifies the return type as an int array
		String[] arr = {"Hello", "World", "!"};
		return arr;
	}
}
