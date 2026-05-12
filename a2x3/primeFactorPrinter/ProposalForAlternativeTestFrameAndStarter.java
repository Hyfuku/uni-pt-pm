// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package primeFactorPrinter;


import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Herald;
import stuffBeginnersDontHaveToUnderstand.Version;


//###
//### Wenn Sie einen eigenen TestFrame entwickeln - was ausdrücklich gut wäre,
//### dann sollten Sie den Klassennamen (mit "Refactoring") ändern
//### Z.B. in  MyAlternativeTestFrame
//###
//### Ein Nachteil des gestellten TestFrames besteht darin, dass er interaktiv ist
//### und damit für reproduzierbare Testläufe eigentlich NICHT geeignet ist.
//### "Hier" sollten Sie Tests entwickeln, die leicht reproduzierbar sind,
//### damit Sie im Falle eines gefundenen Fehlers auch (leicht) testen können, dass Sie
//###   1.) den Fehler wirklich korrigiert und
//###   2.) keine neuen Fehler bei bereits sicheren Code eingebaut
//### haben.
//###
/**
 * Your alternative TestFrame for PrimeFactorPrinter(-Variants).
 * 
// @author  (your name(s))  based on template from Michael Schaefers
// @version (a version number or a date)
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class ProposalForAlternativeTestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_004___2026_05_01__01L;
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
        
        
        
        
        
        try{
            final PrimeFactorPrinter pfp = new PrimeFactorPrinter();
            
            
            //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
            // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
            // führen Sie (bis auf die Änderung des Klassennamens)
            // KEINE Änderungen oberhalb dieser Zeilen durch
            //###
            //###
            //###
            //###   HIER kommt Ihr Code zum Testen hin ;-)
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
            
            
            // Z.B. bzw. nur als erste Start-Idee/Anregung, die etwa so aussehen koennte
            pfp.printFactorization( 24 );
            System.out.print( "\n" );
            pfp.printFactorization( 51 );
            System.out.print( "\n\n\n" );
            //...
            
            
            
            
            
            
            
            
            
            
            //
            //
            // Tests / Beispiele für Zahlen bei der Abnahme
            //
            pfp.printFactorization(                         2 );                // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization(                         3 );                // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization(                         4 );                // 2*2
            System.out.print( "\n" );
            pfp.printFactorization(                         5 );                // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization(                        12 );                // 2*2*3
            System.out.print( "\n" );
            pfp.printFactorization(                        13 );                // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization(                        15 );                // 3*5
            System.out.print( "\n" );
            pfp.printFactorization(                        28 );                // 2*2*7
            System.out.print( "\n" );
            pfp.printFactorization(                       169 );                // 13*13
            System.out.print( "\n" );
            pfp.printFactorization(                       768 );                // 2*2*2*2*2*2*2*2*3
            System.out.print( "\n" );
            pfp.printFactorization(               669_696_869 );                // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization(             1_080_664_428 );                // 2*2*3*90055369
            System.out.print( "\n" );
            pfp.printFactorization(             2_147_483_659L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization(             4_294_967_311L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization(             4_294_967_318L );               // 2*2147483659
            System.out.print( "\n" );
            pfp.printFactorization(            51_539_607_732L );               // 2*2*3*4294967311
            System.out.print( "\n" );
            pfp.printFactorization(            51_539_607_816L );               // 2*2*2*3*2147483659
            System.out.print( "\n" );
            pfp.printFactorization(            65_498_029_444L );               // 2*2*37*12689*34877
            System.out.print( "\n" );
            pfp.printFactorization(            66_666_666_667L );               // 66666666667
            System.out.print( "\n" );
            pfp.printFactorization(        37_513_856_612_736L );               // 2*2*2*2*2*2*2*3*3*3*3*3*7*7*7*17*17*23*23*23
            System.out.print( "\n" );
            pfp.printFactorization(       950_052_134_362_500L );               // 2*2*3*3*3*5*5*5*5*5*13*13*23*23*23*37*37
            System.out.print( "\n" );
            pfp.printFactorization(   614_889_782_588_491_410L );               // 2*3*5*7*11*13*17*19*23*29*31*37*41*43*47
            System.out.print( "\n" );
            pfp.printFactorization(   666_666_666_666_666_667L );               // 261382937*2550536291
            System.out.print( "\n" );
            pfp.printFactorization( 4_611_686_018_427_387_902L );               // 2*2305843009213693951
            System.out.print( "\n" );
            pfp.printFactorization( 4_611_686_018_427_387_817L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 4_611_686_018_427_387_847L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_371_994_482_243_049L );               // 3037000493*3037000493    <<<<====
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_774_959L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_057L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_073L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_097L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_139L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_159L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_181L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_259L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_279L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_291L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_351L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_399L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_417L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_421L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_433L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_507L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_549L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_609L );               // 172153*53576597775553
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_643L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_673L );               // 175934777*52424950849
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_685L );               // 5*1844674407370955137
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_687L );               // 1303*7078566413549329
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_703L );               // 9648151*955973018753
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_717L );               // 59*156328339607708063
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_727L );               // 11113*829962389710679
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_771L );               // 19*485440633518672409
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_777L );               // 584911*15768846947407
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_782L );               // 2*3*3*3*3*17*23*319279*456065899456065899
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_783L );               // ist Primzahl ;-)
            System.out.print( "\n" );
            pfp.printFactorization( 9_223_372_036_854_775_797L );               // 3*3074457345618258599
            System.out.print( "\n" );
            
            
            
            //
            //
            // Weitere systematische Tests
            //
            pfp.printFactorization( 2L );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11*13 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11*13*17 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11*13*17*19 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11*13*17*19*23 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11*13*17*19*23*29 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11*13*17*19*23*29*31 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11*13*17*19*23*29*31*37 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11*13*17*19*23*29*31*37*41 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11*13*17*19*23*29*31*37*41*43 );
            System.out.print( "\n" );
            pfp.printFactorization( 2L*3*5*7*11*13*17*19*23*29*31*37*41*43*47 );
            System.out.print( "\n" );
            //
            //
            pfp.printFactorization( 2*2 );
            System.out.print( "\n" );
            pfp.printFactorization( 3*3 );
            System.out.print( "\n" );
            pfp.printFactorization( 5*5 );
            System.out.print( "\n" );
            pfp.printFactorization( 2*2*2 );
            System.out.print( "\n" );
            pfp.printFactorization( 3*3*3 );
            System.out.print( "\n" );
            pfp.printFactorization( 5*5*5 );
            System.out.print( "\n" );
            pfp.printFactorization( 1L<<61 );
            System.out.print( "\n" );
            pfp.printFactorization( 1L<<62 );
            System.out.print( "\n" );
            pfp.printFactorization( 3L*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3*3 );
            System.out.print( "\n" );
            pfp.printFactorization( 5L*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5*5 );
            System.out.print( "\n" );
            pfp.printFactorization( 7L*7*7*7*7*7*7*7*7*7*7*7*7*7*7*7*7*7*7*7*7*7 );
            System.out.print( "\n" );
            pfp.printFactorization( 11L*11*11*11*11*11*11*11*11*11*11*11*11*11*11*11*11*11 );
            System.out.print( "\n" );
            pfp.printFactorization( 13L*13*13*13*13*13*13*13*13*13*13*13*13*13*13*13*13 );
            System.out.print( "\n" );            
            
            
            //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
            // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
            //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            //
            System.out.printf( "\n\n" );
            System.out.printf( "THIS IS THE END" );
            System.out.flush();
            
        }catch( final Throwable ex ){
            if( ! (( ex instanceof AssertionError ) || ( ex instanceof IllegalArgumentException ))){
                final StringBuilder sb = new StringBuilder( "\n" );
                sb.append( "###\n" );
                sb.append( "### Uuuupppss, was ist denn da passiert ????\n" );
                sb.append( "###\n" );
                Herald.proclaimError( sb );
            }//if
            throw( ex );
        }//try
        
    }//method()
    
}//class
