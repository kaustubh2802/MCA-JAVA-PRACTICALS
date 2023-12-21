Practical : 6
Write a program to Implement all the functions of String, StringBuilder and StringTokenizer classes
*Input :
class string1{
public static void main(String args[]){
String s1="kalyani";
String s2="hello";
String s3="Welcome to java";
StringBuilder s=new StringBuilder("dmi");
System.out.println("convert to upper case : "+s1.toUpperCase());
System.out.println("convert to lower case : "+s3.toLowerCase());
System.out.println("equals : "+s1.equals(s3));
System.out.println("equals ignore case : "+s2.equalsIgnoreCase(s3));
System.out.println("to compare string : "+s2.compareTo(s3));
System.out.println("substring : "+s1.substring(4));
System.out.println("to replace string : "+s2.replace("kalyani","kallu"));
System.out.println("string start with : "+s1.startsWith("kal"));
System.out.println("string end with : "+s1.endsWith("ani"));
System.out.println("to concate string :"+s2.concat(s1));
System.out.println("to reverse string :"+s.reverse());
System.out.println("append function :"+s.append("nashik"));
System.out.println("to insert given string at given pos:"+s.insert(1,"nashik")); }}



Output :
[Running] cd "c:\MCAIst KALYANINERKAR\" && javac string1.java && java string1 
convert to upper case : WELCOME TO JAVA 
convert to lower case : kalyani 
equals : false 
equals ignore 
case : false 
to compare string : 17 
substring : ka to replace string : hello string start with : false string end with : false to concate string :helloKalyani to reverse string :imd append function :imdnashik to insert given string at given pos:inashikmdnashik











