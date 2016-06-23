/*Starting in the top left corner of a 2×2 grid, 
 and only being able to move to the right and down,
 there are exactly 6 routes to the bottom right corner.
 How many such routes are there through a 20×20 grid?*/
public class Problem15 {

	public static void main(String[] args) {
		int size = 20;
		long[][] grid = new long[size+1][size+1];
		//all cells have value 1
		for (int i = 0; i < size; i++) {
		    grid[i][size] = 1;
		    grid[size][i] = 1;
		}
		//start from bottom right corner and add values
		for (int i = size - 1; i >= 0; i--) {
		    for (int j = size - 1; j >= 0; j--) {
		        grid[i][j] = grid[i+1][j] + grid[i][j+1];
		    }
		}

		System.out.println(grid[0][0]);
	}

	
}
