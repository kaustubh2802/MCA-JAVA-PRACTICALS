//Write a program to implement a package
package p;
public class gautu{
public void m1() {
System.out.println("m1 method gautu class");
}
}


package p1;
import p.*;
public class panda
{
public static void main(String args[])
{
gautu t=new gautu();
t.m1();
}
}
