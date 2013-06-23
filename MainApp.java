/**
 * 
 */
package edu.delta.cs.sudoku;

/**
 * @author bentley.jensen
 * @author cody.myers
 * 
 */
public class MainApp {

  /**
   * @param args
   */
  static SudokuStuff sudoku = new SudokuStuff();
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
   boolean works = true; //simple boolean tracking whether the sudoku works
                         //errors will default to false

   /**
    * @authorNote
    * The largest three for statements (they're tabbed, farthest left, int i)
    * walk through the first comparing boxes, rows, columns arrays
    * The second set (int j) walks through the indexes for whatever array
    * The third set (int l) walks though the indexes being compared to the first in the same array
    */
   for (int i = 0; i<9; i++){           // int i - walks through arrays 
     for (int j = 0; j<9; j++){         // int j - first comparing index
       for (int l = 0; l<9; l++){       // int l - second comparing index
         if (j !=l){                    //don't compare the same index to itself
           if (SudokuStuff.boxes[i][j]== SudokuStuff.boxes[i][l]){ //If the index values are the same
                works = false;          //default works to false for duplicate values
                System.out.println("Not valid. In box "+i+" item "+j+" and item "+l+" are the same.");      
           }     
         }
       }
     }
   }
   
   for (int i = 0; i<9; i++){           // int i - walks through arrays 
     for (int j = 0; j<9; j++){         // int j - first comparing index
       for (int l = 0; l<9; l++){       // int l - second comparing index
         if (j !=l){                    //don't compare the same index to itself
           if (SudokuStuff.rows[i][j]== SudokuStuff.rows[i][l]){ //If the index values are the same
                works = false;          //default works to false for duplicate values
                System.out.println("Not valid. In row "+i+" item "+j+" and item "+l+" are the same.");      
           }     
         }
       }
     }
   }
   
   for (int i = 0; i<9; i++){           // int i - walks through arrays 
     for (int j = 0; j<9; j++){         // int j - first comparing index
       for (int l = 0; l<9; l++){       // int l - second comparing index
         if (j !=l){                    //don't compare the same index to itself
           if (SudokuStuff.columns[i][j]== SudokuStuff.columns[i][l]){ //If the index values are the same
                works = false;          //default works to false for duplicate values
                System.out.println("Not valid. In column "+i+" item "+j+" and item "+l+" are the same.");      
           }     
         }
       }
     }
   }
   
     if (works){          //if works hasn't been changed to false, say so
     System.out.println("It's good.");
     System.out.println();
        }
     
     System.out.println(" ");
    } 
}

