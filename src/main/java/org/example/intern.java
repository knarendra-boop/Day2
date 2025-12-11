package org.example;


public class intern {
    public static void main(String[] args) {
        String s1 = "narendra";
        String s2 = new String("narendra");
        if(s1==s2) {
            System.out.println("references are equal");
        }else {
            System.out.println("reference are not equal");
        }
        String s3 = s2.intern();
        if(s1==s3) {
            System.out.println("refernce are equal");
        }
    }
}
