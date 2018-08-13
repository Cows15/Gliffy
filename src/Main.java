import java.text.DateFormat;
import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;


interface Main {
//    boolean computeTest(int n);
//    String porcessName(String s);
//String reverseString(String str);
//    String Greeting();
    public int summer(int as);
}
abstract class Tom implements Main {
    public static void main(String[] args) {
//        Main t = (n) -> (n % 2) == 0;
//        System.out.println(t.computeTest(10));
//        System.out.println(t.computeTest(-20));
//
//        Main t1 = (s) -> "Morning " + s;
//        System.out.println(t1.porcessName("Jimbo"));



        Main t43 = (as)-> as * 3;
        System.out.println(t43.summer(80));

        //localDateTime
        LocalDateTime loc = LocalDateTime.now();
        System.out.println(loc);
        LocalDateTime lock21 = loc.minusHours(12);
        System.out.println(lock21);
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateFormat = localDateTime.format(dateTimeFormatter);
        System.out.println(dateFormat);//13-08-2018

        LocalDateTime lsss = LocalDateTime.now();
         lsss.minusHours(20);//without reassigning the value it remains as current date time now(disregards - 20 hours)
        System.out.println("Current Date Time " + lsss);

        LocalDateTime lt = LocalDateTime.now();
//        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;//includes a T in between time and date stamp
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String regie = lt.format(dtf);
        System.out.println(regie);

        //LocalTime
        LocalTime dhl = LocalTime.of(12,45,53);//seconds can only be between 0-59//0 based index
        System.out.println(dhl);
        LocalTime cxz = dhl.plusHours(11);
        System.out.println(cxz);
        LocalTime c33 = cxz.minusHours(3);
        System.out.println(c33);

        //localDate
        LocalDate lonm = LocalDate.of(2014,10,10);
        System.out.println(lonm.isLeapYear());//false
        LocalDate loop = LocalDate.of(2016,12,3);
        System.out.println(loop.isLeapYear());//true
        LocalDate lv = LocalDate.of(2020,10,10);
        System.out.println(lv.isLeapYear());//true

        LocalDate l009 = LocalDate.now();
        System.out.println("Local date now " + l009);//2018-08-13
        LocalDate lbbb = l009.minusDays(3);
        System.out.println("Local Date subtracting 3 days " +lbbb);//2018-08-10
        LocalDate l77 = lbbb.minusWeeks(2);
        System.out.println("Local Date subtracting 2 weeks " +l77);//2018-07-27

        LocalDate lime = LocalDate.of(2012,12,5);
        LocalDateTime lerd = lime.atTime(9,8,7);//using LocalDateTime you can
        //invoke the atTime() with a LocalDateTime reference
        System.out.println(lerd);//Date is 2012-12-05 and the time was 09:08:07am


        // I AM GREAT
        char acdc = 73;
        char abc = 65;
        char vbn = 77;
        char eee = 71;
        char fff = 82;
        char ttt = 69;
        char eop = 65;
        char rew = 84;
        System.out.println(acdc+ " " +abc+ "" +vbn+ " " +eee+ "" +fff+ "" +ttt+ "" +eop+ "" +rew);

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
//        System.out.println(dateTimeFormatter);



        //LAMBDA THAT ITERATES OVER A ARRAYLIST AND PRINTS TO CONSOLE
        List<String> coll = new ArrayList<String>();
        coll.add("Jeff");
        coll.add("Mike");
        coll.add("helen");
        coll.add("Kevin");
        coll.forEach(n -> System.out.println(n));

//        Main t22 = ()-> {
//          return "Yo Yo";
//        };
//        System.out.println(t22.Greeting());




        //REVERSE A STRING USING A LAMBDA AND WITHOUT IT
//        Main t11 = (str) -> {
//        String s11 = "Hello";
//            String res = "";
//            for (int i = str.length() - 1; i >= 0; i--) {
//                res += str.charAt(i);
//            }
//            return res;
//        };
//        System.out.println(t11.reverseString("Hello"));
//
        String retro = "French";
        String emp = "";
        for (int id = retro.length() - 1; id >= 0; id--) {
            emp += retro.charAt(id);

        }
        System.out.println(emp);
    }
}
