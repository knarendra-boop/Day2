package org.example.Genrics;


interface Printer<T> {


    void print(T item);

    void count(Integer counts);


    class genericInterfaces implements Printer<String> {

        @Override
        public void print(String item) {
            System.out.println("item" + item);
        }

        @Override
        public void count(Integer counts) {
            System.out.println(counts);
        }

    }

    class PrinterApp {
        public static void main(String[] args) {
            genericInterfaces gi = new genericInterfaces();
            gi.count(20);

        }
    }
}

