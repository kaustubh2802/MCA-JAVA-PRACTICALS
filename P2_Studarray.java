//Design an Java application by using array for student management system. Implement array of student objects. Implement following Functions : Add, Update, delete, display,sort
import java.util.*;
import java.lang.*;
import java.io.*;
class Student {
int rollno;
String name;
int marks;
public Student(int rollno,String name,int marks {
this.rollno=rollno;
this.name=name;
this.marks= marks;}
public String toString() {
return this.rollno+" "+this.name+" "+this.marks; }
static void search(Student s[],int rno; {
int flag=0;
for(int i=0; i<s.length;i++) {
if(s[i].rollno==rno) {
System.out.println(s[i]);
flag=1;}}
if (flag==0){
System.out.println("Record not found");}}}
class Sortbymarks implements Comparator<Student>{
public int compare(Student a,Student b){
return b.marks-a.marks;}}
class Studarray{
public static void main(String[] args){
Student[] arr={new Student(1, "raj", 90),
new Student(2, "ansh", 98),new Student(3, "priya", 95),};
System.out.println("Unsorted");
for(int i=0; i<arr.length;i++){
System.out.println(arr[i]);}
Arrays.sort(arr,new Sortbymarks());
System.out.println("Sorted by marks");
for(Student arr1:arr){
System.out.println(arr1);}
System.out.println("Search roll no 4");
Student.search(arr, 2);
System.out.println("Search roll no 1");
Student.search(arr, 10);}}
Output:- [Running] cd "c:\MCAIst KALYANINERKAR\" && javac Studarray.java && java Studarray sorted 1 raj 92 2 ansh 98 3 priya 95 Sorted by marks 2 ansh 98 3 priya 95
1 raj 92 Search roll no 1 1 raj 92 Search roll no 4 Record not found
