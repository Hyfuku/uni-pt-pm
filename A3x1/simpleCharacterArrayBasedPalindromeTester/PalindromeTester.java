package simpleCharacterArrayBasedPalindromeTester;


/**
 * PalindromeTester - see task
 * 
 * @author   Alexander Khuu & David Alexander Fuhrmann (S5T5) 
 * @version  (a version number or a date)
 *
 */
public class PalindromeTester {
     
    /**
     * Die Methode isPalindrome prüft ob ein Palindrom vorliegt.
     * 
     * @param word      das zu überprüfende Wort.
     */
    //###
    //###
    //###
    //###         HIER kommt Ihr Code hin ;-)
    //###
    //###                    VVVV
    //###                    VVVV
    //###                    VVVV
    //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
    //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
    //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
    //###            VVVVVVVVVVVVVVVVVVVV
    //###               VVVVVVVVVVVVVV
    //###                  VVVVVVVV
    //###                     VV
    
    // Schreiben Sie eine Methode, die
    // o) ein Ergebnis vom Typ boolean abliefert
    // o) isPalindrome heißt
    // o) ein char[] als Parameter entgegen nimmt
    //    Der Parameter soll word heißen
    public boolean isPalindrome(char[] palindrome){ 
    	if (palindrome.length <= 0 || palindrome == null) return true;
    	
    	char[] backwardsWord = new char[palindrome.length];
    	int j = 0;
		for(int backwardsIterator = palindrome.length - 1; backwardsIterator >= 0; backwardsIterator--)
		{
			backwardsWord[j] = palindrome[backwardsIterator]; 
			j ++;
		}
		for (int i = 0; i < palindrome.length; i++) {
			 if (palindrome[i] != backwardsWord[i]) {
		            return false;
		     }
		} // Möglich wäre auch in String umzuwandeln 
	    return true;
    }
	
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // Führen Sie Änderungen oberhalb dieser Zeilen durch.
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
}//class
