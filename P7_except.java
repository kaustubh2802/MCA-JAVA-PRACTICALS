Practical : 7
Write a program to Implement any five standard exceptions
*Input : 1
public class except //arithmetic exception{
public static void main(String m[]){
int a=10,b=0;
try {
int x=a/b;
System.out.println("x =" +x); }
catch(Exception e) {
System.out.println("divide by zero "+e);
// System.out.println("Exception occur :"+e); } } }
Output : [Running] cd "c:\MCAIst KALYANINERKAR\" && javac except.java && java except
divide by zero java.lang.ArithmeticException: / by zero
// Input : 2
public class except1 {
public static void main(String m[]){
try {
String a=null;
System.out.println("char at given pos:"+a.charAt(0));}
catch(Exception e){
System.out.println("Exception occur :"+e);}}}
//*Output :
[Running] cd "c:\MCAIst KALYANINERKAR\" && javac except1.java && java except1
Exception occur :java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "<local1>" is null
//*Input : 3
public class excepttt //arrayoutofbound{
public static void main(String m[]){
try{
int x[]=new int[4];
x[5]=20;
System.out.println("x =" +x);}
catch(Exception e){
System.out.println("Exception occur :"+e);}}}
Output :
[Running] cd "c:\MCAIst KALYANINERKAR\" && javac excepttt.java && java excepttt
Exception occur :java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
//*Input : 4
public class except3 //stringindexoutofbound{
public static void main(String m[]){
try{
String a="hii shivani here";
char c=a.charAt(29);
System.out.println(c);}
catch(Exception e){
System.out.println("Exception occur :"+e);}}}
Output :
[Running] cd "c:\MCAIst KALYANINERKAR\" && javac except3.java && java except3
Exception occur :java.lang.StringIndexOutOfBoundsException: Index 29 out of bounds for length 16
//*Input : 5
public class except4 //numberformatexception{
public static void main(String m[]){
try{
int num=Integer.parseInt("shiv");
System.out.println(num);}
catch(Exception e){
System.out.println("Exception occur :"+e);} }}
Output :
[Running] cd "c:\MCAIst KALYANINERKAR\" && javac except4.java && java except4
Exception occur :java.lang.NumberFormatException: For input string: "shiv"
