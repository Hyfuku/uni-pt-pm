// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package bankAccount;


import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * Die Klasse {@link TestFrameAndStarter} testet und startet die Aufgabe "BankAccount" - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_001___2023_04_25__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung
    
    
    
    
    
    /**
     * Diese Methode {@link #main()} testet und startet Ihre Lösung zur Aufgabe: "BankAccount".
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
                                                                      // <- muss weg
        BankAccount[] bankAccount = new BankAccount[15];
        CurrentAccount[] currentAccount = new CurrentAccount[10];
        SavingsAccount[] savingsAccount = new SavingsAccount[5];
        
        
        
        for( int i=0; i<10; i++ ){
            currentAccount[i] = new CurrentAccount( Long.toString( 10_000_000 + i ),  1_000_00,  1_00 );
            bankAccount[i] = currentAccount[i];
        }//for
        for( int i=0; i<5; i++ ){
            savingsAccount[i] = new SavingsAccount( Long.toString( 99_000_000 + i ),  i*1_000_00,  50 );
            bankAccount[10+i] = savingsAccount[i];
        }//for
        
        for( int i=0; i<15; i++ ){
            System.out.printf( "%s\n",  bankAccount[i] );
        }//for
        System.out.printf( "\n\n" );
        
        
        
        TransferManager transferManager = new TransferManager();
        for( int i=0; i<5; i++ ){
            transferManager.transfer( currentAccount[i+5],  currentAccount[i],  currentAccount[i+5].getAccountBalance() -1_00 );
        }//for
        for( int i=0; i<2; i++ ){
            transferManager.transfer( currentAccount[i+3],  currentAccount[i],  currentAccount[i+3].getAccountBalance() -1_00 );
        }//for
        transferManager.transfer( currentAccount[1],  currentAccount[0],  currentAccount[1].getAccountBalance() -1_00 );
        
        for( int i=0; i<5; i++ ){
            savingsAccount[i].giveInterest();
        }//for
        
        for( int i=0; i<15; i++ ){
            System.out.printf( "%s\n",  bankAccount[i] );
        }//for
        System.out.printf( "\n" );
        
        
        
        
        System.out.printf( "\n\n" );
        System.out.printf( "END OF GIVEN TESTs\n" );
        System.out.printf( "-------------------------------------------------------------------------------\n" );
        System.out.printf( "OPTIONAL TESTs  from Student(s)\n" );
        System.out.printf( "\n\n" );
                                                                            // <- muss weg
        //###
        //###   Oberhalb dieser Position sind KEINE Änderungen am Code erlaubt.
        //###   Bei der Abgabe müssen die oberen Zeilen im Original-Zustand sein.
        //###   Während der Entwicklung wäre ein kurzzeitiges (teilweises) Auskommentieren,
        //###   das vor der Abgabe rückgängig gemacht wird,  erlaubt.
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
    
}//class
