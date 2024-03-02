package string_7.string_Methods_2;

import java.util.Locale;

public class all_string_methods_2 {
    public static void main(String[] args) {
        String country="My country is India. India is second largest country in army ";
        String shiv0="Shiv ji ";
        String shiv1="Shiv ji";
        String bholenath="Bholenath ji";
        String emp;
        String nul="";

//        String length methods
        System.out.println(country.length());

//        Substring methods
        System.out.println(country.substring(0,19));
        System.out.println(country.substring(14,19));

//        contain methods
        System.out.println(country.contains("is"));
        System.out.println(country.contains("ses"));
        System.out.println(country.contains("second"));
        System.out.println(country.contains("gest"));

//        System.out.println(country.getBytes());
//        System.out.println(country.codePointAt(19));
//        System.out.println((char) 64);
//        System.out.println((char) 65);
//        System.out.println((int) 'A');

//        String change in to upper case
        System.out.println(country.toUpperCase());

//        String change in to lower case
        System.out.println(country.toLowerCase());

//        concatenate methods  String
        System.out.println(shiv0+" ".concat(country));

//        String end with method
        System.out.println(country.endsWith("army "));
        System.out.println(country.endsWith("army"));

//          String Starts with method
        System.out.println(country.startsWith("My "));
        System.out.println(country.startsWith("my"));

//          String compare method
        System.out.println("String compare method");
        String a="ABCD",b="abcd",c="ABCD";
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(c));


//          String compare ignore case method
        System.out.println("String compare ignore case method");
        String d="ABCD",e="abcd",f="ABCD";
        System.out.println(d.compareToIgnoreCase(e));
        System.out.println(e.compareToIgnoreCase(f));
        System.out.println(f.compareToIgnoreCase(d));


//       String index of method
        System.out.println("String index of method");
        System.out.println(country.indexOf('I'));
        System.out.println(country.lastIndexOf('I'));
        System.out.println(country.lastIndexOf('m',15));


        //       String replace method
        System.out.println("String replace method");
        System.out.println(country.replace('I', 'B'));
        System.out.println(country.replaceAll("India", "Bharat"));

        //        trim method of String
        System.out.println("Trim method of String");
        String ram="     Ram      ";
        System.out.println(ram.trim());

//        equals method of string
        System.out.println("equals method of String");
        String x="ABCD",n="abcd",v="ABCD";
        System.out.println(x.equals(n));
        System.out.println(n.equals(v));
        System.out.println(v.equals(x));


//        equalsIgnoreCase method of string
        System.out.println(" equalsIgnoreCase method of String");
        String q="ABCD",w="abcd",r="ABCD";
        System.out.println(q.equalsIgnoreCase(w));
        System.out.println(w.equalsIgnoreCase(r));
        System.out.println(r.equalsIgnoreCase(q));


        System.out.println(country);

    }
}
