
public class Ch_18_Multidimensional_2D_Array {

	public static void main(String[] args) {
		int [][] flats = new int[2][3];  //A 2-D array of 2 rows + 3 columns
		
		flats[0][0] =100;
		flats[0][1] =101;
		flats[0][2] =102;
		flats[1][0] =100;
		flats[1][1] =101;
		flats[1][2] =102;
		// ... and so on!
		System.out.println("Printing a 2-D array using for loop");
		for(int i=0;i<flats.length;i++) {
			for(int j=0;j<flats[i].length;j++) {
		System.out.print(flats[i][j]);
			System.out.print(" ");
		}
		System.out.println(" ");
		}
	}

}
