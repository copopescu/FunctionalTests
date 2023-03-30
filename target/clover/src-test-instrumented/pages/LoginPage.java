/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {public static class __CLR4_4_11515lfogz5t1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u006f\u0073\u006d\u0069\u006e\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0046\u0075\u006c\u006c\u0053\u0074\u0061\u0063\u006b\u0054\u0065\u0073\u0074\u0069\u006e\u0067\u0042\u006f\u006f\u006b\u0045\u0078\u0065\u0072\u0063\u0069\u0073\u0065\u0073\u002f\u0043\u0068\u0061\u0070\u0074\u0065\u0072\u0033\u0045\u0078\u0065\u0072\u0063\u0069\u0073\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1679778883613L,8589935092L,48,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private WebDriver driver;
    private By emailID = By.id("user_email");
    private By passwordField = By.id("user_password");
    private By signInButton = By.cssSelector("input.gr-button.gr-button--large");

    public LoginPage(WebDriver driver){try{__CLR4_4_11515lfogz5t1.R.inc(41);
        __CLR4_4_11515lfogz5t1.R.inc(42);this.driver = driver;
    }finally{__CLR4_4_11515lfogz5t1.R.flushNeeded();}}

    public HomePage login(String email, String password){try{__CLR4_4_11515lfogz5t1.R.inc(43);
        __CLR4_4_11515lfogz5t1.R.inc(44);driver.findElement(emailID).sendKeys(email);
        __CLR4_4_11515lfogz5t1.R.inc(45);driver.findElement(passwordField).sendKeys(password);
        __CLR4_4_11515lfogz5t1.R.inc(46);driver.findElement(signInButton).click();
        __CLR4_4_11515lfogz5t1.R.inc(47);return new HomePage(driver);
    }finally{__CLR4_4_11515lfogz5t1.R.flushNeeded();}}
}