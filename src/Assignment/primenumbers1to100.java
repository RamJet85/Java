package Assignment;

public class primenumbers1to100 {

	public static void main(String[] args) {
		
		int number = 100, count;

		for (int i = 1; i <= number; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
			 count++;
			 break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }


	}

}
}
