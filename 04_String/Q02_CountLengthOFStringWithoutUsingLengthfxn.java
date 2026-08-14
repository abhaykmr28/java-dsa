public class Q02_CountLengthOFStringWithoutUsingLengthfxn {

    static int countLength(String str){

       char arr[]=str.toCharArray();
       int n=arr.length;
       return n;
    }
    public static void main(String[] args) {
        String str="love";
        int n=countLength(str);
        System.out.println(n);
    }
    
}
