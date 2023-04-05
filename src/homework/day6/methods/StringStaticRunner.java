package day6.methods;

import java.text.ParseException;

public class StringStaticRunner {

    public static void main(String[] args) throws ParseException {

        MethodFirstStatic.MethodFirstStaticProcess("afsdafasgf");
        System.out.println();

        MethodSecondStatic.MethodSecondStaticProcess("Hello color car black Hello color car black Hello color car black Hello color car black");
        System.out.println();

        MethodThirdStatic.MethodThirdStaticProcess("Hello214124 color4124124 car12314 black321313");
        System.out.println();

        MethodFourthStatic.MethodFourthStaticProcess("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.5 denied\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 granted\n" +
                "access_log.2020.09.07 212.168.122.6 denied");
        System.out.println();

        MethodFifthStatic.MethodFifthStaticProcess();
        System.out.println();

        MethodSixthStatic.MethodSixthStaticProcess("22.00 07.09.2020");
        System.out.println();

        MethodSeventhStatic.MethodSeventhStaticProcess("22.00 07.09.2020");
        System.out.println();
    }
}
