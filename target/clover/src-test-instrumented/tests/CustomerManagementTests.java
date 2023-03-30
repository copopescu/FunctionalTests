/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package tests;

import Customers.CustomerManagement;
import com.intuit.karate.core.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("When managing new customers")
public class CustomerManagementTests {static class __CLR4_4_11h1hlfogz5ta{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u006f\u0073\u006d\u0069\u006e\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0046\u0075\u006c\u006c\u0053\u0074\u0061\u0063\u006b\u0054\u0065\u0073\u0074\u0069\u006e\u0067\u0042\u006f\u006f\u006b\u0045\u0078\u0065\u0072\u0063\u0069\u0073\u0065\u0073\u002f\u0043\u0068\u0061\u0070\u0074\u0065\u0072\u0033\u0045\u0078\u0065\u0072\u0063\u0069\u0073\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1679778883613L,8589935092L,64,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    @DisplayName("should return empty when there are no customers")
    public void shouldReturnEmptyWhenThereAreNoCustomers() {__CLR4_4_11h1hlfogz5ta.R.globalSliceStart(getClass().getName(),53);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b4a0x31h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h1hlfogz5ta.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h1hlfogz5ta.R.globalSliceEnd(getClass().getName(),"tests.CustomerManagementTests.shouldReturnEmptyWhenThereAreNoCustomers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),53,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b4a0x31h(){try{__CLR4_4_11h1hlfogz5ta.R.inc(53);
        __CLR4_4_11h1hlfogz5ta.R.inc(54);CustomerManagement customer = new CustomerManagement();
        __CLR4_4_11h1hlfogz5ta.R.inc(55);List<List<String>> customers = customer.getCustomers();

        __CLR4_4_11h1hlfogz5ta.R.inc(56);assertTrue(customers.isEmpty(), "Error: Customers exists");
    }finally{__CLR4_4_11h1hlfogz5ta.R.flushNeeded();}}

    @Test
    @DisplayName("should throw exception when customer name is invalid")
    public void shouldThrowExceptionForInvalidInput() {__CLR4_4_11h1hlfogz5ta.R.globalSliceStart(getClass().getName(),57);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1s1mf091l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11h1hlfogz5ta.R.rethrow($CLV_t2$);}finally{__CLR4_4_11h1hlfogz5ta.R.globalSliceEnd(getClass().getName(),"tests.CustomerManagementTests.shouldThrowExceptionForInvalidInput",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),57,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1s1mf091l(){try{__CLR4_4_11h1hlfogz5ta.R.inc(57);
        __CLR4_4_11h1hlfogz5ta.R.inc(58);List<String> newCustomer = new ArrayList<>();
        __CLR4_4_11h1hlfogz5ta.R.inc(59);newCustomer.add("");
        __CLR4_4_11h1hlfogz5ta.R.inc(60);newCustomer.add("Jackson");
        __CLR4_4_11h1hlfogz5ta.R.inc(61);newCustomer.add("20");

        __CLR4_4_11h1hlfogz5ta.R.inc(62);CustomerManagement customer = new CustomerManagement();
        __CLR4_4_11h1hlfogz5ta.R.inc(63);IllegalArgumentException err =
                assertThrows(IllegalArgumentException.class, () ->
                        customer.addCustomers(newCustomer));
    }finally{__CLR4_4_11h1hlfogz5ta.R.flushNeeded();}}

}
