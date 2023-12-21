Practical : 12
Write a Java program to implement array list to store subject names, implement following functions
• Add an element
• Iterate through all elements
• insert an element at a given index location
• update an element at a given index location
• delete an element at a given index location
• Search a given element
*Input :
import java.util.*;
public class arraylist {
public static void main(String[] args) {
ArrayList<String> lang = new ArrayList<>();
lang.add("js");
lang.add("java");
lang.add("dsa");
lang.add("N/W");
lang.add("OS");
System.out.println("1. ArrayList after adding element : ");
System.out.println(lang);
System.out.println("2. ArrayList after inserting element at given index : ");
lang.add(2,"python");
System.out.println("ArrayList"+lang);
lang.set(1, "linux");
System.out.println("3. Iterating over an array :");
for(int i=0;i<lang.size();i++){
System.out.println(lang.get(i));}
System.out.println("4. Search given element index :");
System.out.println(lang.indexOf("js"));
System.out.println("5. Remove given element index :");
lang.remove(2);
System.out.println(lang.remove(2)+" is romve from arraylist "+lang);}}






OutPut :
[Running] cd "c:\MCAIst KALYANINERKAR\" && javac arraylist.java && java arraylist
1. ArrayList after adding element :
[js, java, dsa, N/W, OS]
2. ArrayList after inserting element at given index :
ArrayList[js, java, python, dsa, N/W, OS]
3. Iterating over an array :
js
linux
python
dsa
N/W
OS
4. Search given element index :
0
5. Remove given element index :
dsa is romve from arraylist [js, linux, N/W, OS]
