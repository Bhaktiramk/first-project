package Glab_303_2_1;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        int j, k;//declaration of the variable
        j = 10; // initialize the value of j
        j = 5; // Overwrite the value of j
        k = j; // here, k gets the value of 5
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);
        System.out.println("\n");// here, i am giving a new line to make code look good.
        k = j = 10;//(k = (j = 10))
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);



    }
}
