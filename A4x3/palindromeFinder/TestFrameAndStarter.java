// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package palindromeFinder;


import java.util.Scanner;
import stuffBeginnersDontHaveToUnderstand.Beautician;
import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link TestFrameAndStarter} testet und startet die Lösung(en) zur
 * Aufgabe "PalindromeFinder/LongestPalindrome" - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_005___2026_05_27__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    /**
     * Diese Methode {@link #main()} testet und startet Ihre Lösung zur Aufgabe: "PalindromeFinder/LongestPalindrome".
     * Hierfür müssen Sie den Test durch Entfernen der Blockkommentarzeichen "aktivieren",
     * sobald Ihre Lösung fertiggestellt ist.
     * Die Tests in dieser Methode dürfen nicht geändert werden.
     * Aber, Sie dürfen gerne eigene Tests am Ende der Methode ergänzen.
     * 
     * @param unused wird nicht genutzt, aber "von Java eingefordert".
     */
    public static void main( final String... unused ){
        
        // print some information at start
        System.out.printf( "TestFrame information\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n" );
        //
        System.out.printf( "Release:\n" );
        System.out.printf( "    GivenCode version:      %s\n",  GivenCodeVersion.getDecodedVersion() );
        System.out.printf( "    Test version:           %s\n",  version.getDecodedVersion() );
        System.out.printf( "\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.determineJavaVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
        System.out.printf( "    UTF-8 configured?:      %s      <- check output\n",  "[ÄËÏÖÜẞäëïöüß🙂😉🙁😟😓😎]" );
        System.out.printf( "\n\n\n\n" );
        //
        System.out.printf( "Start of actual test\n" );
        System.out.printf( "vvvvvvvvvvvvvvvvvvvv\n" );
        System.out.printf( "\n\n" );
        //
        System.out.flush();
        
        
        
        
        
        // Anfang des eigentlichen Tests
        //==============================
        
        // Sobald Sie Ihre Lösung(en) in der/den geforderten Klasse(n) implementiert
        // haben,  müssen die Blockkommentarzeichen entfernt werden.
        //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
        
        /*                                                                      // <- muss weg
        
        
        int testCnt = 0;
        
        
        
        PalindromeFinder palindromeFinder = new PalindromeFinder( "wYw" );
        System.out.printf( "wYw\n" );
        System.out.printf( "-> " );
        printTestResult( palindromeFinder.getLongestPalindrome() );
        System.out.printf( "\n" );
        palindromeFinder.setText( "vMTTMV" );
        System.out.printf( "vMTTMV\n" );
        System.out.printf( "-> " );
        printTestResult( palindromeFinder.getLongestPalindrome() );
        System.out.printf( "\n\n\n" );
        testCnt++;
        
        
        
        String givenText;
        
        
        givenText = "x";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            givenText
        );
        testCnt++;
        
        givenText = "oo";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            givenText
        );
        testCnt++;
        
        givenText = "oxo";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            givenText
        );
        testCnt++;
        
        givenText = "oxxo";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            givenText
        );
        testCnt++;
        
        givenText = "Werner sagte: \"Es stellen sich neben dem Reliefpfeiler auf: Otto neben Otto und Ede neben Ede.\"";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "Werner sagte: \"Es stellen sich neben dem Reliefpfeiler auf: Otto neben Otto und Ede neben Ede.\"",
            "____________________~~~~______~~~~~~~___~~~~~~~~~~~~~~~____^^^^^^^^^^^^^^^^^___~~~~~~~~~~~~~~_"
        );
        testCnt++;
        
        givenText = "abcxcbaXabcxcbazzzzzzzzzzzabcdefghxhgfedcba";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "abcxcbaXabcxcbazzzzzzzzzzzabcdefghxhgfedcba",
            "____________^^^^^^^^^^^^^^^^^______________",
            "~~~~~~~~~~~~~~~___________+++++++++++++++++"
        );
        testCnt++;
        
        givenText = "hghhrehrejllkj ckhrcklrlnhlwexggprgrghwpfwenf";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "hghhrehrejllkj ckhrcklrlnhlwexggprgrghwpfwenf",
            "^^^__________________+++_________+++_________",
            "__~~______~~__________________~~__+++________"
        );
        testCnt++;
        
        givenText = "ixhxhxgxgxfxfxexeebaxabaxaba";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "ixhxhxgxgxfxfxexeebaxabaxaba",
            "__________________^^^^^^^^^_"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw",
            "________^^^^^^^^^^^^^^^^^____"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7",
            "________^^^^^^^^^^^^^^^^^_____"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7e";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7e",
            "________^^^^^^^^^^^^^^^^^______"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7ee";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7ee",
            "________^^^^^^^^^^^^^^^^^_______"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7eee";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7eee",
            "________^^^^^^^^^^^^^^^^^________"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7eeee";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7eeee",
            "________^^^^^^^^^^^^^^^^^_________"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYw";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYw",
            "____________________^^^^^^^^^^^^^^^^^^^"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww",
            "___________________^^^^^^^^^^^^^^^^^^^^^"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww8";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww8",
            "__________________^^^^^^^^^^^^^^^^^^^^^^^"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww8p";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww8p",
            "_________________^^^^^^^^^^^^^^^^^^^^^^^^^"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww8p8";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww8p8",
            "________________^^^^^^^^^^^^^^^^^^^^^^^^^^^"
        );
        testCnt++;
        
        givenText = "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww8p8p";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "oxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww8p8p",
            "_______________^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
        );
        testCnt++;
        
        givenText = "aoxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww8p8p8e";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "aoxomyymq8wwYww8p8p8wwYww8p8pw7wp8p8wwYww8p8p8e",
            "_______________^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^_"
        );
        testCnt++;
        
        givenText = "987xxv2112vxxvaxxavxxvaxxb";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "987xxv2112vxxvaxxavxxvaxxb",
            "__________^^^^^^^^^^^^____",
            "___~~~~~~~~~~__~~~~~~~~~~_"
        );
        testCnt++;
        
        givenText = "1oxxo2xx2oxxo2xx";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "1oxxo2xx2oxxo2xx",
            "_^^^^^^^^^^^^___",
            "______~~~~~~~~~~"
        );
        testCnt++;
        
        givenText = "1oxxo2xx2oxxo2xx3";
        chkText(
            testCnt,
            new PalindromeFinder( givenText ),
            "1oxxo2xx2oxxo2xx3",
            "_^^^^^^^^^^^^____",
            "______~~~~~~~~~~_"
        );
        testCnt++;
        
       
        
        System.out.printf( "Preparing next test.\n" );
        System.out.printf( "The result is expected in about 5 seconds that means in particular less than one minute.\n" );
        StringBuilder sb = new StringBuilder( "apbbpcccp");
        for( int stillToDo=42; --stillToDo>=0; )  sb.append( "x" );
        sb.append( "q" );
        for( int stillToDo=1_000_000; --stillToDo>=0; )  sb.append( "xxxxxxxxxx" );
        sb.append( "p" );
        for( int stillToDo=42; --stillToDo>=0; )  sb.append( "x" );
        sb.append( "qcccqbbqa" );
        givenText = sb.toString();
        System.out.printf( "Starting actual test.\n" );
        palindromeFinder = new PalindromeFinder( givenText );
        final long timeStamp1st = System.nanoTime();
        final String pali = palindromeFinder.getLongestPalindrome();
        final long timeStamp2nd = System.nanoTime();
        assert 10_000_000 == pali.length();
        assert 'x' == pali.charAt( 0 );
        assert 'x' == pali.charAt( 9_999_999 );
        final long delta = timeStamp2nd - timeStamp1st;
        System.out.printf( "Test passed after %s.",  Beautician.nanoSecondBasedTimeToString( delta ));
        System.out.printf( "\n\n\n" );
        testCnt++;
        
        
        
        System.out.printf( "And now an interactive test.\n\n" );
        try(
            final Scanner workAroundForSeriousUserInterface = new Scanner( System.in );
        ){
            System.out.printf( "Gebe einen Text ein\n" );
            System.out.printf( "und tippe danach die Return-Teste um die Eingabe abzuschliessen.\n" );
            System.out.printf( "=> " );
            //
            final String theText = workAroundForSeriousUserInterface.nextLine();
            palindromeFinder.setText( theText );
            System.out.printf( "Der folgene Text\n" );
            if( null != theText ){
                System.out.printf( "    %s\n",  palindromeFinder.getText() );
            }else{
                System.out.printf( "    null\n" );
            }//if
            System.out.printf( "liefert:\n" );
            printTestResult( palindromeFinder.getLongestPalindrome() );
            
        }catch( final Throwable ex ){
            if( ! (( ex instanceof AssertionError ) || ( ex instanceof IllegalArgumentException ))){
                System.out.flush();
                System.err.printf( "###\n" );
                System.err.printf( "### Uuuupppss, was ist denn da passiert ????\n" );
                System.err.printf( "###\n" );
                System.err.printf( "\n" );
            }//if
            throw( ex );
        }//try
        testCnt++;
        
        
        
        System.out.printf( "\n\n" );
        System.out.printf( "END OF %d GIVEN TESTs\n",  testCnt );
        System.out.printf( "-------------------------------------------------------------------------------\n" );
        System.out.printf( "OPTIONAL TESTs  from Student(s)\n" );
        System.out.printf( "\n\n" );
        */                                                                      // <- muss weg
        //###
        //###   Oberhalb dieser Position sind KEINE Änderungen am Code erlaubt.
        //###   Bei der Abgabe müssen die oberen Zeilen im Original-Zustand sein.
        //###   Während der Entwicklung wäre ein kurzzeitiges (teilweises) Auskommentieren,
        //###   das vor der Abgabe rueckgängig gemacht wird,  erlaubt.
        //###
        //###-------------------------------------------------------------------
        //###
        //###   Ab HIER dürfen Sie gerne eigene Tests ergänzen
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
        
        
        
        // HHH      HHH   III   EEEEEEEEEEEE   RRRRRRRRRRR          <<<                                  !!!
        // HHH      HHH   III   EEEEEEEEEEEE   RRRRRRRRRRRR        <<<                                   !!!
        // HHH      HHH   III   EEE            RRR      RRR       <<<                                    !!!
        // HHH      HHH   III   EEE            RRR      RRR      <<<                                     !!!
        // HHHHHHHHHHHH   III   EEEEEEEEEEEE   RRRRRRRRRRR      <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     !!!
        // HHHHHHHHHHHH   III   EEEEEEEEEEEE   RRRRRRRRRR       <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<     !!!
        // HHH      HHH   III   EEE            RRR   RRR         <<<                                     !!!
        // HHH      HHH   III   EEE            RRR    RRR         <<<
        // HHH      HHH   III   EEEEEEEEEEEE   RRR     RRR         <<<                                   !!!
        // HHH      HHH   III   EEEEEEEEEEEE   RRR      RRR         <<<                                  !!!
        //
        //
        // Fügen Sie hier Ihre zusätzlichen Tests ein
        // bzw. ersetzen Sie diesen Kommentar durch Ihren Code.
        
        
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }//method()
    
    
    
    
    
    
    
    
    
    
    /*                                                                        // <- muss weg
    private static void chkText(
        final int testCnt,
        final PalindromeFinder palindromeFinder,
        final String givenText,
        final String... markerLines
    ){
        System.out.printf( "#%d:Der folgende Text\n",  testCnt );
        System.out.printf( "    %s\n",  givenText );
        for( final String makerLine : markerLines ){
            System.out.printf( "    %s\n",  makerLine );
        }//for
        System.out.printf( "\n" );
        System.out.printf( "liefert:\n" );
        System.out.printf( "1: " );
        printTestResult( palindromeFinder.getLongestPalindrome() );
        //
        palindromeFinder.setText( givenText );
        System.out.printf( "2: " );
        printTestResult( palindromeFinder.getLongestPalindrome() );
        System.out.printf( "text:\n" );
        System.out.printf( "    %s\n",  palindromeFinder.getText() );
        System.out.printf( "\n\n\n" );
    }//method()
    */                                                                        // <- muss weg
    
    
    private static void printTestResult( final String testResult ){
        if( null != testResult ){
            System.out.printf( "\"%s\" -> length=%d\n",  testResult, testResult.length() );
        }else{
            System.out.printf( "null\n" );
        }//if
    }//method()
    
}//class
