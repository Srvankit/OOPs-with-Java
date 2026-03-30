
public class Strings {
    public static void main(String[] args) {
        String s = "hello java world";
        String s2 = "HELLO JAVA WORLD";
        String s3 = "hi";
        String s7 = "hello";
        String s4 = "hi";
        String s6 = new String("hi");
        String s5 =  new String("hi");
        System.out.println(s5.equals(s6));
        String a5=s.concat("bword2");
        System.out.println(a5);
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(s.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s.charAt(10));
        System.out.println(s2.codePointAt(7));
        System.out.println(s3.compareTo(s4));
        System.out.println(s.compareTo(s2));
        System.out.println(s3.contains(s4));
        System.out.println(s.compareTo(s7));
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        System.out.println(s2.indent(7));

        StringBuffer sb = new StringBuffer("ankit");
        System.out.println(sb.append("yadav"));
        System.out.println(sb.insert(1, "A"));
        System.out.println(sb.replace(0, 2, "A"));
        System.out.println(sb.delete(5, 11));
    }
}
 
// Ascii codes inn java are known as unicode (s.codePointAt)
// compareTo is used to compare two string with the help of their unicode: If the values are matching then the output will be 0 otherwise it will be some integer
// if the unicode of string 1 is greater than unicode of string 2 then the ans will be positive and vice versa.
// if the second string is the substring of the first string then the output will be the length of the remaining part of the first string.
//   == is used to compare the memory address
// while the .equals is used to compare the content 

// There are two ways to create a string:
//  Literal based:  String a = "Ankit"
//   using new keyword :  String a = new String ("ankit")


//  if we want to make a string mutable:
    //  we will use either String Builder or String Buffer.

// if  string is made using the literals : it always moves to the stack and then to the stackpool(a container present inside the heap memory)
//   but if the string is made up with the help of hte new keyword then it moves to the heap memory.

// If the string's data is already present into the stringpool then it wont be created again(coz it will be already existing)
//  But the duplicacy is allowed into heap memory (new keyword se jo bhi string banega wo heap memory me duplicate ho sakta but stringpool me nhi)