import java.util.Arrays;

public class Sudoku {
   public static boolean isValid(char num, char[][] board, int row, int col) {
	for(int i = 0; i < 9; i++) {
	  if(num == board[row][i]){
		return false;
	  }
	}
	
	for(int i = 0; i < 9; i++) {
	  if(num == board[i][col]) {
		return false;
	  }
	}
	  
	for(int i = 0; i < 9; i++) {
	  if(board[row - (row % 3) + (i / 3)][col - (col % 3) + (i % 3)] == num) {
		return false;
	  }
	}
	return true;
  }

  public static boolean solve(char[][] board) {

	for(int i = 0; i < board.length; i++) {
	  for(int j = 0; j < board[0].length; j++) {
		if(board[i][j] == '.') {
		  for(char e = '1'; e <='9'; e++) {
			char c = e;
			if(isValid(c, board, i, j)) {
			  board[i][j] = c;
			  if(solve(board)) {
				return true;
			  } else {
				board[i][j] = '.';
			  }
		  }
		}
		return false;
	  }
	}
  }
	return true;
  } 
  public static void main(String[] args) {
	char[][] board = {
	  {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
	  {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
	  {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
	  {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
	  {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
	  {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
	  {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
	  {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
	  {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
	};
	boolean res = solve(board);
	if(res) {
	  System.out.println(Arrays.deepToString(board));
	} else {
	  System.out.println("This sudoku could not be solved");
	}
//	System.out.println(Arrays.deepToString(board));
  }
}
