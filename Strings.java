class Strings
{
    public static void main(String[] args)
    {
        String s1="Hello";
        System.out.println(s1.toLowerCase()); //hello
        System.out.println(s1.toUpperCase()); //HELLO
        
        String s2="Java is the best";
        System.out.println(s2.indexOf('i')); //5

        String s3="hello";
        String s4="HELLO";
        String s5="hi";
        System.out.println(s3.equalsIgnoreCase(s4)); //true
        System.out.println(s3.equalsIgnoreCase(s5)); //false

        String s6="  Hello how are you ";
        System.out.println(s6+"hi");             //  Hello how are you hi
        System.out.println(s6.trim()+"hi");      //Hello how are youhi

        String s7="Ramu";
        String s8="Ravi";
        System.out.println(s7.concat(s8));  //RamuRavi

        String s9="Java";
        System.out.println(s9.length()); //4
        System.out.println(s9.charAt(2)); //v


        String s10="college";
        String s11="";
        System.out.println(s10.isEmpty()); //false
        System.out.println(s11.isEmpty()); //true

        String s12="java is the best programming language";
        System.out.println(s12.replace("java","python"));  //python is the best programming language
    }
}

output:
hello
HELLO
5
true
false
  Hello how are you hi
Hello how are youhi
RamuRavi
4
v
false
true
python is the best programming language
