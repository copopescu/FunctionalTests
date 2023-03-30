/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package dataObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({"sku", "color", "size"})
public class ItemDetails {public static class __CLR4_4_188lfogz5se{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0063\u006f\u0073\u006d\u0069\u006e\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0046\u0075\u006c\u006c\u0053\u0074\u0061\u0063\u006b\u0054\u0065\u0073\u0074\u0069\u006e\u0067\u0042\u006f\u006f\u006b\u0045\u0078\u0065\u0072\u0063\u0069\u0073\u0065\u0073\u002f\u0043\u0068\u0061\u0070\u0074\u0065\u0072\u0033\u0045\u0078\u0065\u0072\u0063\u0069\u0073\u0065\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1679778883565L,8589935092L,18,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String sku;
    private String color;
    private String size;

    public ItemDetails(String sku, String color, String size) {try{__CLR4_4_188lfogz5se.R.inc(8);
        __CLR4_4_188lfogz5se.R.inc(9);this.sku = sku;
        __CLR4_4_188lfogz5se.R.inc(10);this.color = color;
        __CLR4_4_188lfogz5se.R.inc(11);this.size = size;
    }finally{__CLR4_4_188lfogz5se.R.flushNeeded();}}

    @JsonProperty
    public String getSku() {try{__CLR4_4_188lfogz5se.R.inc(12);
        __CLR4_4_188lfogz5se.R.inc(13);return sku;
    }finally{__CLR4_4_188lfogz5se.R.flushNeeded();}}

    @JsonProperty
    public String getColor() {try{__CLR4_4_188lfogz5se.R.inc(14);
        __CLR4_4_188lfogz5se.R.inc(15);return color;
    }finally{__CLR4_4_188lfogz5se.R.flushNeeded();}}

    @JsonProperty
    public String getSize() {try{__CLR4_4_188lfogz5se.R.inc(16);
        __CLR4_4_188lfogz5se.R.inc(17);return size;
    }finally{__CLR4_4_188lfogz5se.R.flushNeeded();}}
}

