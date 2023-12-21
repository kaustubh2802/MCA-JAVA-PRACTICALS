//Write a program to implement an abstract class
abstract class s{
abstract void run();
void show(){
System.out.println("Non abstarct Method ....");} }
class abs extends s{
void run() {
System.out.println("Running safely...."); }
public static void main(String args[]){
s obj= new abs();
obj.run();
obj.show(); }}



Output :
[Running] cd "c:\MCAIst KALYANINERKAR\" && javac abs.java && java abs
Running safely....
Non abstarct Method ....
