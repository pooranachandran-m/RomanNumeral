package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RomanConverter romanConverter=new RomanConverterImpl2();
        int input=3562;
        String romanValue=romanConverter.convert(3562);
        System.out.println("Input : "+input);
        System.out.println("Roman Value : "+romanValue);
        System.out.println("Numeric Value : "+romanConverter.convert(romanValue));

    }
}
