package org.example.gneraricspractice;

class Multipleval {
    public static void main(String[] args) {
        MultipleValues<String, Integer> multi = new MultipleValues<>();
        multi.setKey("narendra");
        multi.setValue(1);
        System.out.println(multi.getKey() + " " + multi.getValue());
    }
}
