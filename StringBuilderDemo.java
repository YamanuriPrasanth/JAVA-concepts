class StringBuilderDemo
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer();
        sb.append("vijaya").insert(6,"bhaskarreddy").delete(13,17).reverse().append("solutions").insert(22,"abcdf").reverse();
        System.out.println(sb); //sfdcbanoitulosvijayabhaskary
    }
}
