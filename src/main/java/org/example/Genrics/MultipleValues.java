package org.example.Genrics;

public class MultipleValues <k,v>{
    k key;
    v value;

    public MultipleValues() {
        this.key = key;
        this.value = value;
    }

    public k getKey() {
        return key;
    }
    public void setKey(k key) {
        this.key = key;
    }
    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }
}

class Multipleval {
    public static void main(String[] args) {
        MultipleValues <String, Integer> multi = new MultipleValues<>();
        multi.setKey("narendra");
        multi.setValue(1);
        System.out.println(multi.getKey() + " " + multi.getValue());
    }
}
