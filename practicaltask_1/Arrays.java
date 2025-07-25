package practicaltask_1;

public class Arrays {
                                                               //OneDArray
	public static void main(String[] args) {
		 int[]  Rank = {2567, 245, 743, 7895};

	        for (int i = 0; i < Rank.length; i++) 
	        {
	            System.out.println("Rank " + (i + 1) + ": " + Rank[i]);
	        }
	        Rank[1]=1000;
	        System.out.println("The Second Rank in the array  is :"+Rank[1]);
	       
	        
	                                                          //TwoDArrays
	        System.out.println("2D_Martix:");
	        int[][] matrix = {
		            {25, 89},
		            {87, 28},
		            {111, 63}
		        };

		        for (int i = 0; i < matrix.length; i++) {
		            for (int j = 0; j < matrix[i].length; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println();
		        }
	}
}
		        
	        


