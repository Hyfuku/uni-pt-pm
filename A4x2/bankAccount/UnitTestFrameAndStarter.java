package bankAccount;


import static org.junit.jupiter.api.Assertions.assertEquals;
//
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import stuffBeginnersDontHaveToUnderstand.EnvironmentAnalyzer;
import stuffBeginnersDontHaveToUnderstand.GivenCodeVersion;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * (Unit-)TestFrame for bank account stuff
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class UnitTestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_006___2025_06_13__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    /**
     * Setup and check environment
     */
    @BeforeAll
    public static void init(){
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
        System.out.printf( "ATTENTION\n" );
        System.out.printf( "This TestFrame is still in an early development phase\n" );
        System.out.printf( "\n\n" );
        //
        System.out.flush();
    }//method()
    
    
    
    
    
    /**
     * Simple tests - create objects and check them
     */
    @Test
    public void test01(){
        final int numOfCurrentAccounts = 10;
        final int numOfSavingAccounts = 5;
        final int numOfAllAccounts = numOfCurrentAccounts + numOfSavingAccounts;
        //
        final int feeInCent = 1_00;
        final int interestRateInPerMille = 499;
        
        
        final BankAccount[] bankAccount = new BankAccount[numOfAllAccounts];
        final CurrentAccount[] currentAccount = new CurrentAccount[numOfCurrentAccounts];
        final SavingsAccount[] savingsAccount = new SavingsAccount[numOfSavingAccounts];
        
        for( int i=0; i<numOfCurrentAccounts; i++ ){
            currentAccount[i] = new CurrentAccount( Long.toString( 10_000_000 + i ),  1_000_00,  feeInCent );
            bankAccount[i] = currentAccount[i];
        }//for
        for( int i=0; i<numOfSavingAccounts; i++ ){
            savingsAccount[i] = new SavingsAccount( Long.toString( 99_000_000 + i ),  i*1_000_00,  interestRateInPerMille );
            bankAccount[numOfCurrentAccounts+i] = savingsAccount[i];
        }//for
        
        for( int i=0; i<numOfCurrentAccounts; i++ ){
            assertEquals( Long.toString( 10_000_000 + i ), bankAccount[i].getAccountId() );
            assertEquals( 1_000_00, bankAccount[i].getAccountBalance() );
            assertEquals( feeInCent, ((CurrentAccount)bankAccount[i]).getFee() );
        }//for
        for( int i=0; i<numOfSavingAccounts; i++ ){
            assertEquals( Long.toString( 99_000_000 + i ), bankAccount[numOfCurrentAccounts+i].getAccountId() );
            assertEquals( i*1_000_00, bankAccount[numOfCurrentAccounts+i].getAccountBalance() );
            assertEquals( interestRateInPerMille, ((SavingsAccount)bankAccount[numOfCurrentAccounts+i]).getInterestRate() );
        }//for
    }//method()
    
    
    
    /**
     * Simple tests concerning money transfer and transfer manager
     */
    @Test
    public void testMoneyTransfer(){
        final int numOfCurrentAccounts = 10;                                            // quasi inflexible setting for this very test
        assert 0==(numOfCurrentAccounts&0b1) : "invalid setting for this very test";    // test setting has to have even value
        final int feeInCent = 1_00;
        assert 0 <= feeInCent : "invalid setting for this very test";                   // setting has to be positive -but nowadays? :-(
        
        final BankAccount[] bankAccount = new BankAccount[numOfCurrentAccounts];
        final CurrentAccount[] currentAccount = new CurrentAccount[numOfCurrentAccounts];
        //
        for( int i=0; i<numOfCurrentAccounts; i++ ){
            currentAccount[i] = new CurrentAccount( Long.toString( 10_000_000 + i ),  1_000_00,  feeInCent );
            bankAccount[i] = currentAccount[i];
        }//for
        
        final int endOf1stHalf = numOfCurrentAccounts >>> 1;
        final TransferManager transferManager = new TransferManager();
        for( int i=0; i<endOf1stHalf; i++ ){
            transferManager.transfer( currentAccount[i+endOf1stHalf],  currentAccount[i],  currentAccount[i+endOf1stHalf].getAccountBalance() - feeInCent );
        }//for
        // now special sophisticated values are used for this very test
        for( int i=0; i<2; i++ ){
            transferManager.transfer( currentAccount[i+3],  currentAccount[i],  currentAccount[i+3].getAccountBalance() - feeInCent );
        }//for
        transferManager.transfer( currentAccount[1],  currentAccount[0],  currentAccount[1].getAccountBalance() - feeInCent );
        
        assertEquals( 7_993_00, bankAccount[0].getAccountBalance() );
        assertEquals(     0_00, bankAccount[1].getAccountBalance() );
        assertEquals( 1_999_00, bankAccount[2].getAccountBalance() );
        for( int i=3; i<numOfCurrentAccounts; i++ ){
            assertEquals( 0_00, bankAccount[i].getAccountBalance() );
        }//for
    }//method()
    
    
    
    /**
     * Simple tests concerning interest distribution - is calculation accurate?
     */
    @Test
    public void testInterestDistribution01(){
        final int numOfSavingAccounts = 100;
        //
        final int interestRateInPerMille = 47;  // This values
        final long beforeInterest = 1_000_00;   //..have to be
        final long afterInterest  = 1_047_00;   //..in harmony
        
        
        final BankAccount[] bankAccount = new BankAccount[numOfSavingAccounts];
        final SavingsAccount[] savingsAccount = new SavingsAccount[numOfSavingAccounts];
        
        for( int i=0; i<numOfSavingAccounts; i++ ){
            savingsAccount[i] = new SavingsAccount( Long.toString( 99_000_000 + i ),  i*beforeInterest,  interestRateInPerMille );
            bankAccount[i] = savingsAccount[i];
        }//for
        
        for( int i=0; i<numOfSavingAccounts; i++ ){
            savingsAccount[i].giveInterest();
        }//for
        
        for( int i=0; i<numOfSavingAccounts; i++ ){
            assertEquals( i*afterInterest, bankAccount[i].getAccountBalance() );
        }//for
    }//method()
    
    
    
    /**
     * Simple tests concerning interest distribution - is calculation accurate?
     */
    @Test
    public void testInterestDistribution02(){
        final int numOfSavingAccounts = 10;     // The very values
        final int interestRateInPerMille = 47;  //..for this very test
        final long beforeInterest = 1_001_00;   //..DO NOT CHANGE !!!
        
        
        final BankAccount[] bankAccount = new BankAccount[numOfSavingAccounts];
        final SavingsAccount[] savingsAccount = new SavingsAccount[numOfSavingAccounts];
        
        for( int i=0; i<numOfSavingAccounts; i++ ){
            savingsAccount[i] = new SavingsAccount( Long.toString( 99_000_000 + i ),  i*beforeInterest,  interestRateInPerMille );
            bankAccount[i] = savingsAccount[i];
        }//for
        
        for( int i=0; i<numOfSavingAccounts; i++ ){
            savingsAccount[i].giveInterest();
        }//for
        
        // expected results have been manually calculated for the very test(s)
        assertEquals(        0, bankAccount[0].getAccountBalance() );
        assertEquals( 1_048_04, bankAccount[1].getAccountBalance() );
        assertEquals( 2_096_09, bankAccount[2].getAccountBalance() );
        assertEquals( 3_144_14, bankAccount[3].getAccountBalance() );
        assertEquals( 4_192_18, bankAccount[4].getAccountBalance() );
        assertEquals( 5_240_23, bankAccount[5].getAccountBalance() );
        assertEquals( 6_288_28, bankAccount[6].getAccountBalance() );
        assertEquals( 7_336_32, bankAccount[7].getAccountBalance() );
        assertEquals( 8_384_37, bankAccount[8].getAccountBalance() );
        assertEquals( 9_432_42, bankAccount[9].getAccountBalance() );
    }//method()
    
    
    
    /**
     * Simple tests concerning interest distribution - is calculation accurate?
     */
    @Test
    public void testInterestDistribution03(){
        final long[][] testValues = {
            //  ___afterInterest___   ___beforeInterest__   ____
            {   91_970195_453209_41L, 87_841638_446236_31L,   47 },
            {   91_970195_453209_41L, 87_841638_446236_31L,   47 },
            {   91_970197_080000_21L, 87_841640_000000_21L,   47 },
            {   92_233720_368547_34L, 88_093333_685336_53L,   47 }, //LPf047
            {   92_233720_368547_75L, 88_093333_685336_92L,   47 },
            {   92_233720_368547_31L, 46_139930_149348_33L,  999 }, //LPf999 & hyperinflation
            {   92_233720_368547_75L, 46_139930_149348_55L,  999 }, //hyperinflation
            {   92_233720_368547_36L, 82_572712_953041_51L,  117 }, //LPf117
            {   92_233720_368547_75L, 82_572712_953041_86L,  117 },
            {   92_233720_368547_17L, 83_168368_231331_99L,  109 }, //LPf109
            {   92_233720_368547_75L, 83_168368_231332_51L,  109 },
            {   92_233720_368547_54L, 83_620780_025881_73L,  103 }, //LPf103
            {   92_233720_368547_75L, 83_620780_025881_92L,  103 },
            {   92_233720_368547_61L, 84_078140_718821_89L,   97 }, //LPf097
            {   92_233720_368547_75L, 84_078140_718822_02L,   97 },
            {   92_233720_368547_25L, 84_385837_482659_89L,   93 }, //LPf093
            {   92_233720_368547_75L, 84_385837_482660_34L,   93 },
            {   92_233720_368547_66L, 84_540531_960172_01L,   91 }, //LPf091
            {   92_233720_368547_75L, 84_540531_960172_09L,   91 },
            {   92_233720_368547_57L, 84_851628_673916_81L,   87 }, //LPf087
            {   92_233720_368547_75L, 84_851628_673916_98L,   87 },
            {   92_233720_368547_04L, 86_280374_526236_71L,   69 }, //LPf069
            {   92_233720_368547_74L, 86_280374_526237_37L,   69 },
            {   92_233720_368547_65L, 86_767375_699480_39L,   63 }, //LPf063
            {   92_233720_368547_75L, 86_767375_699480_48L,   63 },
            {   92_233720_368547_55L, 86_930933_429356_79L,   61 }, //LPf061
            {   92_233720_368547_75L, 86_930933_429356_98L,   61 },
            {   92_233720_368547_21L, 87_758059_342100_11L,   51 }, //LPf051
            {   92_233720_368547_75L, 87_758059_342100_62L,   51 },
            {   92_233720_368547_40L, 87_925376_900426_51L,   49 }, //LPf049
            {   92_233720_368547_75L, 87_925376_900426_84L,   49 },
            {   92_233720_368547_40L, 88_771626_918717_43L,   39 }, //LPf039
            {   92_233720_368547_75L, 88_771626_918717_76L,   39 },
            {   92_233720_368547_50L, 89_287241_402272_51L,   33 }, //LPf033
            {   92_233720_368547_75L, 89_287241_402272_75L,   33 },
            {   92_233720_368547_49L, 89_460446_526234_23L,   31 }, //LPf031
            {   92_233720_368547_74L, 89_460446_526234_48L,   31 },
            {   92_233720_368547_75L, 90_336650_703768_61L,   21 }, //LPf021
            {   92_233720_368547_75L, 90_336650_703768_61L,   21 },
            {   92_233720_368547_74L, 90_513955_219379_53L,   19 }, //LPf019
            {   92_233720_368547_75L, 90_513955_219379_54L,   19 },
            {   92_233720_368547_51L, 91_050069_465496_07L,   13 }, //LPf013
            {   92_233720_368547_75L, 91_050069_465496_30L,   13 },
            {   92_233720_368547_08L, 91_411021_177945_57L,    9 }, //LPf009
            {   92_233720_368547_75L, 91_411021_177946_24L,    9 }
        };
        for( long[] currentTestValues : testValues ){
            assert 3==currentTestValues.length : "internal setup/configuration error";
            assert 0L==( 0xFFFF_FFFF__0000_0000L & currentTestValues[2]) : "internal setup/configuration error";
            final long beforeInterest = currentTestValues[1];
            final long afterInterest  = currentTestValues[0];
            final int interestRateInPerMille = (int)( currentTestValues[2] );
            
            final SavingsAccount savingsAccount = new SavingsAccount( "DE65 3705 0299 0000 9191 91",  beforeInterest,  interestRateInPerMille );
            final BankAccount bankAccount = savingsAccount;
            savingsAccount.giveInterest();
            assertEquals( afterInterest, bankAccount.getAccountBalance() );
        }//for
    }//method()
    
    
    
    
    
    /**
     * tear down
     */
    @AfterAll
    public static void tearDown(){
        System.out.printf( "\n\n\n" );
        System.out.printf( "THE END" );
        System.out.flush();
    }//method()
    
}//class
