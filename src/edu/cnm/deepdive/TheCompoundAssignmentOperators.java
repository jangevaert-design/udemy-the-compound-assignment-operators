package edu.cnm.deepdive;

public class TheCompoundAssignmentOperators {

  public static void main(String[] args) {
    int x = 2;
    int z = 3;
    x = x * z;//simple assignment
    x *= z;//compound assignment
    System.out.println("x = " +  x); //outcome will be 18.

    //int a += 5; does not compile because a did not have a previous value.

    //without explicit casting
    long a = 10;
    int b = 4;
    //b = b * a does not compile because b on the right hand side is promoted to long to match with
    //a but b on the left hand side is still in an int.
    b = (int)(b * a);//would be a solution.
    b *= a;// this compiles because it is short hand for b = (int)(b * a)

    long c = 4;
    long d = (c = 2);
    System.out.println("c = " + c + " and d = " + d);

    long e = 3;
    long f = 2;
    long h = 1;

    long i = e + 3 * (f = 3) - (h -= 2);
    i = 3 + 3 * 3 - (-1);
    i = 3 + 9 + 1;
    i = 13;
    System.out.println("i = " + i + ", h = " + h + " and f = " + f);
  }

}
