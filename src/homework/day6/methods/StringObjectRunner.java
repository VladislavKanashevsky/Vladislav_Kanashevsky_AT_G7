package day6.methods;


import java.text.ParseException;

public class StringObjectRunner {

    public static void main(String[] args) throws ParseException {
        new MethodFirst().MethodFirstProcess("afafaf");
        System.out.println();
        new MethodSecond().MethodSecondProcess("String Hello String Hello String Hello String Hello String Hello ");
        System.out.println();
        new MethodThird().MethodThirdProcess("String121String14546Hello6367364Stri7ng346436Hel7lo7436346String346346");
        System.out.println();
        new MethodFourth().MethodFourthProcess("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 granted\n" +
                "access_log.2020.09.07 212.168.122.6 denied");
        System.out.println();
        new MethodFifth().MethodFifthProcess();
        System.out.println();
        new MethodSixth().MethodSixthProcess("22.00 07.09.2020");
        System.out.println();
        new MethodSeventh().MethodSeventhProcess("22.00 07.09.2020");
        System.out.println();
    }
}
