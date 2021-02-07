class StringBufferDemo
{
    public static void main(String[] args)
    {
        StringBuffer obj1=new StringBuffer();
        System.out.println(obj1.capacity()); //16

        obj1.append("ABCDEFGHIJKLMNOP");
        System.out.println(obj1.capacity());  //16

        //new capacity=(current capacity+1)*2

        obj1.append('Q');
        System.out.println(obj1.capacity());   //34

        StringBuffer obj2=new StringBuffer(5);
        obj2.append("123456");
        System.out.println(obj2.capacity());  //12

        StringBuffer obj3=new StringBuffer("Ramu");
        System.out.println(obj3.capacity());  //20

        System.out.println(obj1.length()); //17
        System.out.println(obj2.length()); //0
        System.out.println(obj3.length()); //4

        System.out.println(obj1.charAt(0)); //A
        System.out.println(obj2.charAt(0)); //1
        System.out.println(obj3.charAt(0)); //R

        obj2.setCharAt(0,'7');
        System.out.println(obj2); //723456

        obj2.insert(0,1);
        System.out.println(obj2); //1723456

        obj2.delete(3,6);
        System.out.println(obj2); //1726

        obj2.deleteCharAt(1);
        System.out.println(obj2); //126

        System.out.println(obj1); //ABCDEFGHIJKLMNOPQ
        System.out.println(obj1.reverse()); //QPONMLKJIHGFEDCBA

        obj1.setLength(7);
        System.out.println(obj1); //QPONMLK

        StringBuffer obj4=new StringBuffer(1000);
        System.out.println(obj4.capacity()); //1000
        obj4.append("Hello");
        System.out.println(obj4.capacity()); //1000
        obj4.trimToSize();
        System.out.println(obj4.capacity());  //5

        obj4.ensureCapacity(1000);
        System.out.println(obj4.capacity()); //1000

        System.out.println(obj1); //QPONMLK
        System.out.println(obj1.substring(4));
        System.out.println(obj1.substring(2,5));
    }
}


