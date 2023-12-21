Practical : 13
Write a program using Hashtable to store student roll number and name. Implement add,delete, update and search student record functions
*Input :
import java.util.Hashtable;
public class hashtable {
public static void main(String[] args) {
Hashtable<Integer , String> ht= new Hashtable<>();
ht.put(1, "java");
ht.put(2, "dsa");
ht.put(3, "js");
ht.put(4, "html");
System.out.println("1). Mapping of hashtable ");
System.out.println(ht);
System.out.println("2) Traversing HashTable");
ht.forEach((key , value)-> System.out.println(key+"\t\t"+value));
System.out.println("3). After Changing elements in hashtable");
ht.put(2, "os");
System.out.println(ht);
System.out.println("4).After removing elements in hashtable");
ht.remove(3);
System.out.println(ht);
//for(Map.Entry<String , Integer> e : ht.EntrySet());}}


OutPut :
[Running] cd "c:\MCAIst KALYANINERKAR\" && javac hashtable.java && java hashtable
1). Mapping of hashtable
{4=html, 3=js, 2=dsa, 1=java}
2) Traversing HashTable
1 java
2 dsa
3 js
4 html
3). After Changing elements in hashtable
{4=html, 3=js, 2=os, 1=java}
4).After removing elements in hashtable
{4=html, 2=os, 1=java}
