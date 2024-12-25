import java.util.Arrays;


public class Main {

    public static void main(String[] args)
    {
        Method.printThreeWords();
        Method.checkSumSign();
        Method.printColor();
        Method.compareNumbers();
        Method.sumBoolean(2, 115);
        Method.comparsionNumber(-4);
        Method.comparsionBoolean(5);
        Method.printString(4, "Я не должен лгать");
        Method.iteratingArray();
        Method.inputArray();
        Method.doubleNumbers();
        Method.diagonalArray();
        Method.createArray(5, 69);

    }
}

class Method {
    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
        System.out.println();
    }

    static void checkSumSign() {
        var a = 2;
        var b = 6;
        var result = a+b;

        if (result < 0) {
            System.out.println("Сумма отрицательная");
        }
        else {
            System.out.println("Сумма Положительная");
        }
        System.out.println();
    }

    static void printColor() {
        var value = 69;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
        System.out.println();
    }

    static void compareNumbers() {
        var a = 69;
        var b = 71;

        if (a >= b){
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }
        System.out.println();
    }

    static boolean sumBoolean(int a, int b) {
        if ((a+b) >= 10 && (a+b) <= 20){
            return true;
        }
        else{
            return false;
        }

    }

    static void comparsionNumber(int a) {
        if (a < 0){
            System.out.println("Число отрицательное");
        }
        else{
            System.out.println("Число положительное");
        }
        System.out.println();
    }

    static boolean comparsionBoolean(int a){
        if (a < 0){
            return true;
        }
        else{
            return false;
        }
    }

    static void printString(int count, String string){
        for(int i = 0; i < count; i++) {
            System.out.println(string);
        }
        System.out.println();
    }

    static void iteratingArray(){
        int[] array =  {1, 1, 0, 0, 1, 0, 1, 0, 0};
        for(int i=0; i < array.length; i++){
            if (array[i] == 0){
                array[i] = 1;
            }
            else{
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    static void inputArray(){
        int [] array = new int [100];
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    static void doubleNumbers(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 5, 8, 9, 1};
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    static void diagonalArray(){
        int a = 5;
        int [][] array = new int [a][a];
        for (int i = 0; i < a; i++){
            array[i][i] = 1;
            array[i][a - 1 - i] = 1;
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println();
    }

    static void createArray(int len, int value){
        int[] array = new int [len];
        for(int i = 0; i < len; i++){
            array[i] = value;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    static void main(String[] args) {
            System.out.println(isLeapYear(2020));
            System.out.println(isLeapYear(1900));
            System.out.println(isLeapYear(2000));
            System.out.println(isLeapYear(2023));
        }

        public static boolean isLeapYear(int year) {
            if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
                }
                return true;
            }
                return false;
        }
}
