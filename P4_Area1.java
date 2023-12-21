//Write a program to implement an interface for calculating area. Implement the interface for calculating area of rectangle, triangle, circle
interface calculate{
public void area();}
class Rectangle implements calculate{
int length,width;
Rectangle(int l,int b) {
length=l;
width=b;}
public void area() {
int a= length*width;
System.out.println("area of Rectangle :"+a);}
class Triangle implements calculate{
int base ,height,a;
Triangle(int b,int h){
base=b;
height=h; }
public void area(){
int a= ((base*height)/2);
System.out.println("Area of Triangle :"+a);}}
class Circle implements calculate{
double pi=3.14,radious,a;
Circle(double r) {
radious=r; }
public void area() {
double a= pi * radious * radious;
System.out.println("Area of Circle :"+a); }
class Area1{
public static void main(String ags[]) {
calculate c= new Rectangle(12, 4);
c.area();
calculate c1= new Triangle(4,7);
c1.area();
calculate c2= new Circle(8);
c2.area();}}
