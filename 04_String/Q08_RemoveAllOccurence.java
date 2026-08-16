public class Q08_RemoveAllOccurence {

    static String removeOccurence(String s,String part){

        while(s.contains(part)){
            //search part inside s 

            int index=s.indexOf(part);

            // create new string 
            // do concation of left and right sustrng

            s=s.substring(0,index)+s.substring(index+part.length());
        }
        return s;
    }

    public static void main(String[] args) {
        String s="xabcyabczabc";
        String Part="abc";

        String ans=removeOccurence(s, Part);
        System.out.println(ans);
    }
    
}
