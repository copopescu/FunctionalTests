/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import com.google.common.io.Files;

public class BaseTest {static class __CLR4_4_1iilfogz5sw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u006f\u0073\u006d\u0069\u006e\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0046\u0075\u006c\u006c\u0053\u0074\u0061\u0063\u006b\u0054\u0065\u0073\u0074\u0069\u006e\u0067\u0042\u006f\u006f\u006b\u0045\u0078\u0065\u0072\u0063\u0069\u0073\u0065\u0073\u002f\u0043\u0068\u0061\u0070\u0074\u0065\u0072\u0033\u0045\u0078\u0065\u0072\u0063\u0069\u0073\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1679778883613L,8589935092L,35,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){try{__CLR4_4_1iilfogz5sw.R.inc(18);
        __CLR4_4_1iilfogz5sw.R.inc(19);System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        __CLR4_4_1iilfogz5sw.R.inc(20);ChromeOptions chromeOptions = new ChromeOptions();
        __CLR4_4_1iilfogz5sw.R.inc(21);chromeOptions.addArguments("--remote-allow-origins=*");


        __CLR4_4_1iilfogz5sw.R.inc(22);driver = new ChromeDriver(chromeOptions);
        __CLR4_4_1iilfogz5sw.R.inc(23);driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        __CLR4_4_1iilfogz5sw.R.inc(24);driver.get("http://eCommerce.com/sign_in");
    }finally{__CLR4_4_1iilfogz5sw.R.flushNeeded();}}


    @AfterMethod
    public void teardown(ITestResult result){try{__CLR4_4_1iilfogz5sw.R.inc(25);
        __CLR4_4_1iilfogz5sw.R.inc(26);if ((((ITestResult.FAILURE == result.getStatus())&&(__CLR4_4_1iilfogz5sw.R.iget(27)!=0|true))||(__CLR4_4_1iilfogz5sw.R.iget(28)==0&false))){{
            __CLR4_4_1iilfogz5sw.R.inc(29);var camera = (TakesScreenshot) driver;
            __CLR4_4_1iilfogz5sw.R.inc(30);File screenshot = camera.getScreenshotAs(OutputType.FILE);
            __CLR4_4_1iilfogz5sw.R.inc(31);try {
                __CLR4_4_1iilfogz5sw.R.inc(32);Files.move(screenshot, new File("src/main/resources/screenshots/" + result.getName() + ".png"));
            }catch (IOException e){
                __CLR4_4_1iilfogz5sw.R.inc(33);e.printStackTrace();
            }
        }
        }__CLR4_4_1iilfogz5sw.R.inc(34);driver.quit();
    }finally{__CLR4_4_1iilfogz5sw.R.flushNeeded();}}
}
