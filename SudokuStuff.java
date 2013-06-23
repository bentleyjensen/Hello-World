/**
 * 
 */
package edu.delta.cs.sudoku;

/**
 * @author bentley.jensen
 * 
 */
public class SudokuStuff {

  /**
   * @param args
   */

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  static int[][] boxes = {
      // This is boxes sudoku
                { 5, 3, 4, 6, 7, 2, 1, 9, 8 }, // Box 0
                { 6, 7, 8, 1, 9, 5, 3, 4, 2 }, // Box 1
                { 9, 1, 2, 3, 4, 8, 5, 6, 7 }, // Box 2
                { 8, 5, 9, 4, 2, 6, 7, 1, 3 }, // Box 3
                { 7, 6, 1, 8, 5, 3, 7, 9, 1 }, // Box 4
                { 4, 2, 3, 7, 9, 1, 8, 5, 6 }, // Box 5
                { 9, 6, 1, 2, 8, 7, 3, 4, 5 }, // Box 6
                { 5, 3, 7, 4, 1, 9, 2, 8, 6 }, // Box 7
                { 2, 8, 4, 6, 3, 5, 1, 7, 9 }, // Box 8
        };
        
        static int[][] rows = { // This is rows sudoku
          {5,3,4,6,7,8,9,1,2}, // Row 0
          {6,7,2,1,9,5,3,4,8}, // Row 1
          {1,9,8,3,4,2,5,6,7}, // Row 2
          {8,5,9,7,6,1,4,2,3}, // Row 3
          {4,2,6,8,5,3,7,9,1}, // Row 4
          {7,1,3,9,2,4,8,5,6}, // Row 5
          {9,6,1,5,3,7,2,8,4}, // Row 6
          {2,8,7,4,1,9,6,3,5}, // Row 7
          {3,4,5,2,8,6,1,7,9}, // Row 8
      };
      static int[][] columns = { // This is columns sudoku
          {5,6,1,8,4,7,9,2,3}, // Column 0
          {3,7,9,5,2,1,6,8,4}, // Column 1
          {4,2,8,9,6,3,1,7,5}, // Column 2
          {6,1,3,7,8,9,5,4,2}, // Column 3
          {7,9,4,6,5,2,3,1,2}, // Column 4
          {8,5,2,1,3,4,7,9,6}, // Column 5
          {9,3,5,4,7,8,3,6,1}, // Column 6
          {1,4,6,2,9,5,8,3,7}, // Column 7
          {2,8,7,3,1,6,4,5,9}, // Column 8
      };

  

}
