package day5;

public class ezhRunner {

    public static void main(String[] args) {

        String x ="fgag";

        //System.out.println("afa".equals("afA"));
       // System.out.println("afa".equals("afa"));
       // System.out.println("asd".equalsIgnoreCase("asD"));
        //System.out.println("asd".equalsIgnoreCase("asd"));

        //System.out.println("asd"+ "-"+ " fafaf"+ "-"+"agag");
        //System.out.println(String.join("-","faSFAF","FAFAF","fasfasf"));

        System.out.printf(" sdADA %s FAFSD %s%n aga %s gaG",x,x,x);// format




    }

    public static void doSomething(Ezh ezh) {
        if (ezh instanceof CheildEZH)

            System.out.println(ezh.name);
    }

    public static void doTest(Ezh actual, Ezh expected) {
        doTest(actual, expected, "gsgs", "", "");
    }

    public static void doTest(Ezh actual, Ezh expected, String msg) {
        doTest(actual, expected, msg, " ", "");
    }


    public static void doTest(Ezh actual, Ezh expected, String msg, String msgErr, String msgSuc) {
        if (actual.equals(expected)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED" + msg);
        }
    }

}
