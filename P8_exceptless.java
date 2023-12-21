Practical : 8
Write a program to Implement a user defined exception to check account balance of user. If it is less than 1000, raise the exception
*Input :
public class exceptless {
public static void main(String[] args) {
int balance=600;
try {
if(balance<1000){
throw new Exception("balance is less than 1000");}}
catch(Exception e){
System.out.println(e);} } }
Output :
[Running] cd "c:\MCAIst KALYANINERKAR\" && javac exceptless.java && java exceptless
java.lang.Exception: balance is less than 1000
