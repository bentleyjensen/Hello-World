public class SodukuVerifier {
  /**
   * @author garrett.harvey
   */
  // Populate
  static int[][] matrix = {
      { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
      { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
      { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
      { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
      { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
      { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
      { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
      { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
      { 3, 4, 5, 2, 8, 6, 1, 7, 9 },
  };

  /**
   * @param args
   */
  public static void main(String[] args) {
    // Print
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < 9; col++) {
        System.out.print(matrix[row][col]);
      }
      System.out.println();
    }
    // this verifies if row 1 and it's elements in the soduku sum up to 45 , and also do not repeat values.

    if (matrix[0][0] + matrix[0][1] + matrix[0][2] + matrix[0][3] + matrix[0][4] + matrix[0][5] + matrix[0][6] + matrix[0][7] + matrix[0][8] == 45) {
      boolean isValid = false;
      isValid = doesRowElementAlreadyExist(0, matrix[0][0], 0);
      if (isValid) {
        System.out.println("Row element value " + matrix[0][0] + " already exists");
      }
      System.out.println("row 1 is valid and does not repeat values");
    }
    // this verifies if row 2 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[1][0] + matrix[1][1] + matrix[1][2] + matrix[1][3] + matrix[1][4] + matrix[1][5] + matrix[1][6] + matrix[1][7] + matrix[1][8] == 45) {
      boolean isValid = false;
      isValid = doesRowElementAlreadyExist(1, matrix[1][5], 5);
      if (isValid) {
        System.out.println("Row element value " + matrix[1][5] + " already exists");
      }
      System.out.println("row 2 is valid and does not repeat values");
    }
    // this verifies if row 3 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[2][0] + matrix[2][1] + matrix[2][2] + matrix[2][3] + matrix[2][4] + matrix[2][5] + matrix[2][6] + matrix[2][7] + matrix[2][8] == 45) {
      boolean isValid = false;
      isValid = doesRowElementAlreadyExist(2, matrix[2][6], 6);
      if (isValid) {
        System.out.println("Row element value " + matrix[2][6] + " already exists");
      }
      System.out.println("row 3 is valid and does not repeat values");
    }
    // this verifies if row 4 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[3][0] + matrix[3][1] + matrix[3][2] + matrix[3][3] + matrix[3][4] + matrix[3][5] + matrix[3][6] + matrix[3][7] + matrix[3][8] == 45) {
      boolean isValid = false;
      isValid = doesRowElementAlreadyExist(3, matrix[3][1], 1);
      if (isValid) {
        System.out.println("Row element value " + matrix[3][1] + " already exists");
      }
      System.out.println("row 4 is valid and does not repeat values");
    }
    // this verifies if row 5 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[4][0] + matrix[4][1] + matrix[4][2] + matrix[4][3] + matrix[4][4] + matrix[4][5] + matrix[4][6] + matrix[4][7] + matrix[4][8] == 45) {
      boolean isValid = false;
      isValid = doesRowElementAlreadyExist(4, matrix[4][4], 4);
      if (isValid) {
        System.out.println("Row element value " + matrix[4][4] + " already exists");
      }
      System.out.println("row 5 is valid and does not repeat values");
    }
    // this verifies if row 6 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[5][0] + matrix[5][1] + matrix[5][2] + matrix[5][3] + matrix[5][4] + matrix[5][5] + matrix[5][6] + matrix[5][7] + matrix[5][8] == 45) {
      boolean isValid = false;
      isValid = doesRowElementAlreadyExist(5, matrix[5][7], 7);
      if (isValid) {
        System.out.println("Row element value " + matrix[5][7] + " already exists");
      }
      System.out.println("row 6 is valid and does not repeat values");
    }
    // this verifies if row 7 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[6][0] + matrix[6][1] + matrix[6][2] + matrix[6][3] + matrix[6][4] + matrix[6][5] + matrix[6][6] + matrix[6][7] + matrix[6][8] == 45) {
      boolean isValid = false;
      isValid = doesRowElementAlreadyExist(6, matrix[6][3], 3);
      if (isValid) {
        System.out.println("Row element value " + matrix[6][3] + " already exists");
      }
      System.out.println("row 7 is valid and does not repeat values");
    }
    // this verifies if row 8 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[7][0] + matrix[7][1] + matrix[7][2] + matrix[7][3] + matrix[7][4] + matrix[7][5] + matrix[7][6] + matrix[7][7] + matrix[7][8] == 45) {
      boolean isValid = false;
      isValid = doesRowElementAlreadyExist(7, matrix[7][8], 8);
      if (isValid) {
        System.out.println("Row element value " + matrix[7][8] + " already exists");
      }
      System.out.println("row 8 is valid and does not repeat values");
    }
    // this verifies if row 9 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[8][0] + matrix[8][1] + matrix[8][2] + matrix[8][3] + matrix[8][4] + matrix[8][5] + matrix[8][6] + matrix[8][7] + matrix[8][8] == 45) {
      boolean isValid = false;
      isValid = doesRowElementAlreadyExist(8, matrix[8][2], 2);
      if (isValid) {
        System.out.println("Row element value " + matrix[8][2] + " already exists");
      }
      System.out.println("row 9 is valid and does not repeat values");
    }

    // this verifies if column 1 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[0][0] + matrix[1][0] + matrix[2][0] + matrix[3][0] + matrix[4][0] + matrix[5][0] + matrix[6][0] + matrix[7][0] + matrix[8][0] == 45) {
      boolean isValid = false;
      isValid = doesColumnElementAlreadyExist(0, matrix[0][0], 0);
      if (isValid) {
        System.out.println("Column element value " + matrix[0][0] + " already exists");
      }
      System.out.println("column 1 is valid and does not repeat values");
    }
    // this verifies if column 2 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[0][1] + matrix[1][1] + matrix[2][1] + matrix[3][1] + matrix[4][1] + matrix[5][1] + matrix[6][1] + matrix[7][1] + matrix[8][1] == 45) {
      boolean isValid = false;
      isValid = doesColumnElementAlreadyExist(3, matrix[3][1], 1);
      if (isValid) {
        System.out.println("Column element value " + matrix[3][1] + " already exists");
      }
      System.out.println("column 2 is valid and does not repeat values");
    }
    // this verifies if column 3 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[0][2] + matrix[1][2] + matrix[2][2] + matrix[3][2] + matrix[4][2] + matrix[5][2] + matrix[6][2] + matrix[7][2] + matrix[8][2] == 45) {
      boolean isValid = false;
      isValid = doesColumnElementAlreadyExist(8, matrix[8][2], 2);
      if (isValid) {
        System.out.println("Column element value " + matrix[8][2] + " already exists");
      }
      System.out.println("column 3 is valid and does not repeat values");
    }
    // this verifies if column 4 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[0][3] + matrix[1][3] + matrix[2][3] + matrix[3][3] + matrix[4][3] + matrix[5][3] + matrix[6][3] + matrix[7][3] + matrix[8][3] == 45) {
      boolean isValid = false;
      isValid = doesColumnElementAlreadyExist(6, matrix[6][3], 3);
      if (isValid) {
        System.out.println("Column element value " + matrix[6][3] + " already exists");
      }
      System.out.println("column 4 is valid and does not repeat values");
    }
    // this verifies if column 5 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[0][4] + matrix[1][4] + matrix[2][4] + matrix[3][4] + matrix[4][4] + matrix[5][4] + matrix[6][4] + matrix[7][4] + matrix[8][4] == 45) {
      boolean isValid = false;
      isValid = doesColumnElementAlreadyExist(4, matrix[4][4], 4);
      if (isValid) {
        System.out.println("Column element value " + matrix[4][4] + " already exists");
      }
      System.out.println("column 5 is valid and does not repeat values");
    }
    // this verifies if column 6 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[0][5] + matrix[1][5] + matrix[2][5] + matrix[3][5] + matrix[4][5] + matrix[5][5] + matrix[6][5] + matrix[7][5] + matrix[8][5] == 45) {
      boolean isValid = false;
      isValid = doesColumnElementAlreadyExist(1, matrix[1][5], 5);
      if (isValid) {
        System.out.println("Column element value " + matrix[1][5] + " already exists");
      }
      System.out.println("column 6 is valid and does not repeat values");
    }
    // this verifies if column 7 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[0][6] + matrix[1][6] + matrix[2][6] + matrix[3][6] + matrix[4][6] + matrix[5][6] + matrix[6][6] + matrix[7][6] + matrix[8][6] == 45) {
      boolean isValid = false;
      isValid = doesColumnElementAlreadyExist(2, matrix[2][6], 6);
      if (isValid) {
        System.out.println("Column element value " + matrix[2][6] + " already exists");
      }
      System.out.println("column 7 is valid and does not repeat values");
    }
    // this verifies if column 8 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[0][7] + matrix[1][7] + matrix[2][7] + matrix[3][7] + matrix[4][7] + matrix[5][7] + matrix[6][7] + matrix[7][7] + matrix[8][7] == 45) {
      boolean isValid = false;
      isValid = doesColumnElementAlreadyExist(5, matrix[5][7], 7);
      if (isValid) {
        System.out.println("Column element value " + matrix[5][7] + " already exists");
      }
      System.out.println("column 8 is valid and does not repeat values");
    }
    // this verifies if column 9 and it's elements in the soduku sum up to 45 , and also do not repeat values.
    if (matrix[0][8] + matrix[1][8] + matrix[2][8] + matrix[3][8] + matrix[4][8] + matrix[5][8] + matrix[6][8] + matrix[7][8] + matrix[8][8] == 45) {
      boolean isValid = false;
      isValid = doesColumnElementAlreadyExist(7, matrix[7][8], 8);
      if (isValid) {
        System.out.println("Column element value " + matrix[7][8] + " already exists");
      }
      System.out.println("column 9 is valid and does not repeat values");
    }

  }

  /**
   * This method would walk over a single row in the matrix and decide if an element has already been added
   * 
   * @param rowNum
   *          The row number to test in the matrix
   * @param elementValue
   *          The value to test
   * @param elementIndex
   *          The index of the requested element value
   * @return true or false
   */
  private static boolean doesRowElementAlreadyExist(int rowNum, int testValue, int elementIndex) {
    for (int i = 0; i < 9; i++) {
      if (i != elementIndex) {
        if (matrix[rowNum][i] == testValue) {
          return true;
        }
      }
    }

    return false;
  }

  /**
   * This method would walk over a single column in the matrix and decide if an element has already been added
   * 
   * @param colNum
   *          The column number to test in the matrix
   * @param elementValue
   *          The value to test
   * @param elementIndex
   *          The index of the requested value
   * @return true or false
   */
  private static boolean doesColumnElementAlreadyExist(int elementIndex, int testValue, int colNum) {
    for (int i = 0; i < 9; i++) {
      if (i != elementIndex) {
        if (matrix[i][colNum] == testValue) {
          return true;
        }
      }
    }

    return false;
  }
}
