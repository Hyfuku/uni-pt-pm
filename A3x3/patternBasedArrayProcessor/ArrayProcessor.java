// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package patternBasedArrayProcessor;


/**
 * ArrayProcessor - see task
 * 
 * @author   Alexander Khuu & David Alexander Fuhrmann (S5T5) 
 * @version  (a version number or a date)
 *
 */
public class ArrayProcessor {

    private static final boolean[][] PATTERN = {
        {false, true,  true},
        {true,  false, false, true},
        {true,  false, false, true},
        {false, true,  true}
    };
    
    public long process(long[][] theArray) {
    	long total = 0;
    	
    	for (int startRow = 0; startRow < theArray.length; startRow++) {
    		for (int startCol = 0; startCol < theArray[startRow].length; startCol++) {
    			if (fits(theArray, startRow, startCol)) {
                    total += sumAt(theArray, startRow, startCol);
                }
    		}
    	}
    	return total;
    }

    private boolean fits(long[][] theArray, int startRow, int startCol) {
        for (int row = 0; row < PATTERN.length; row++) {              
            for (int column = 0; column < PATTERN[row].length; column++) { 
                if (PATTERN[row][column]) {                             
                    int arrayRow = startRow + row;                      
                    int arrayColumn = startCol + column;            
                    if (arrayRow >= theArray.length                     // Zeile existiert nicht?
                     || theArray[arrayRow] == null                      // Zeile ist null?
                     || arrayColumn >= theArray[arrayRow].length) {     // Spalte existiert nicht (wegen Jagged Array)?
                        return false;                               
                    }
                }
            }
        }
        return true; 
    }

    private long sumAt(long[][] theArray, int startRow, int startCol) {
        long sum = 0;
        for (boolean[] patternRow : PATTERN) {
            for (boolean cell : patternRow) {
                if (cell) {
                    sum += theArray[startRow][startCol];
                }
                startCol++;
            }
            startCol -= patternRow.length; 
            startRow++;
        }
        return sum;
    }

}
