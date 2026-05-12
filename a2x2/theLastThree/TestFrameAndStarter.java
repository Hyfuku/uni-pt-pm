// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package theLastThree;


import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * {@link TestFrameAndStarter} for "the Last Three" - see task
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_004___2026_05_01__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    /**
     * method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        
        // print some information at start
        System.out.printf( "TestFrame information\n" );
        System.out.printf( "=====================\n" );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Release:\n" );
        System.out.printf( "    GivenCode version:      %s\n",  GivenCodeVersion.getDecodedVersion() );
        System.out.printf( "    TestFrame version:      %s\n",  version.getDecodedVersion() );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "Environment:\n" );
        System.out.printf( "    #Cores:                 %d\n",  EnvironmentAnalyzer.getAvailableCores() );
        System.out.printf( "    Java:                   %s\n",  EnvironmentAnalyzer.determineJavaVersion() );
        System.out.printf( "    assert enabled?:        %s\n",  EnvironmentAnalyzer.isAssertEnabled() );
        System.out.printf( "\n\n" );
        //
        System.out.printf( "\n\n" );
        //
        //
        System.out.printf( "Start of actual test(s)\n" );
        System.out.printf( "=======================\n" );
        System.out.printf( "\n" );
        //
        System.out.flush();
        
        
        
        // start actual testing
        LastThree lastThree;
        
        System.out.printf( "Start simple tests:\n" );
        System.out.printf( "===================\n" );
        System.out.printf( "\n" );
        //
        lastThree = new LastThree();
        lastThree.processNewValue( 11 );
        lastThree.processNewValue( 12 );
        lastThree.processNewValue( 13 );
        lastThree.processNewValue( 14 );
        System.out.printf( "11 [12  13  14]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        System.out.printf( "11  12 [13  14  15]\n" );
        lastThree.processNewValue( 15 );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        System.out.printf( "################################################################################\n" );
        System.out.printf( "\n\n\n" );
        
        
        
        System.out.printf( "Start a little bit more serious tests:\n" );
        System.out.printf( "======================================\n" );
        System.out.printf( "\n" );
        //
        lastThree = new LastThree();
        System.out.printf( "\"nix\"\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 13 );
        System.out.printf( "[13]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 59 );
        System.out.printf( "[13  59]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 11 );
        System.out.printf( "[13  59  11]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 23 );
        System.out.printf( " 13 [59  11  23]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 43 );
        System.out.printf( " 13  59 [11  23  43]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 47 );
        System.out.printf( " 13  59  11 [23  43  47]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 37 );
        System.out.printf( " 13  59  11  23 [43  47  37]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 97 );
        System.out.printf( " 13  59  11  23  43 [47  37  97]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        lastThree.processNewValue( 37 );
        System.out.printf( " 13  59  11  23  43  47 [37  97  37]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        System.out.printf( "################################################################################\n" );
        System.out.printf( "\n" );
        //
        lastThree = new LastThree();
        lastThree.processNewValue( 0 );
        System.out.printf( "[0]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        lastThree.processNewValue( 0 );
        System.out.printf( "[0  0]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        lastThree.processNewValue( 0 );
        System.out.printf( "[0  0  0]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        lastThree.processNewValue( 0 );
        System.out.printf( " 0 [0  0  0]\n" );
        lastThree.printLastThree();
        System.out.printf( "\n" );
        //
        System.out.printf( "THE END" );
        
     }//method()

}//class
