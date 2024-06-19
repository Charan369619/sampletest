package ArraylistDemo1;

public class Arraysum {

	public static void main(String[] args) {
		int[] array1= {1,2,3};
		int[] array2= {1,2,3};
		int[] sumArray=new int[array1.length];
		for (int i=0;i<array1.length;i++) {
			sumArray[i]= array1[i]+array2[i];
		}
		System.out.println("Array1:"+java.util.Arrays.toString(array1));
		System.out.println("Array2:"+java.util.Arrays.toString(array2));
		System.out.println("Sum of both arrays:"+java.util.Arrays.toString(sumArray));
		

	}

}
