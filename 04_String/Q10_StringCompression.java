public class Q10_StringCompression {
    static int compress(char[] chars){

        int readindex=0;   // jis index se array pe travel kareneg 

        int writeindex=0;  // iss index se array me fill kare ge

        // travle on charr and find char and his freq
        while(readindex<chars.length){

            // now find the current char and his freq
            char currentchar=chars[readindex];
            int count =0; // is current char ka abhi count 0 hai 

            // count kab tak karnahia 
            // jab tak index vlaid hai and currnt cahr ==chars[readindex]hai 

            while(readindex<chars.length && currentchar==chars[readindex]){
                readindex++;
                count++;
            }

            // till now i have current count and 
            chars[writeindex]=currentchar; // abb char array me write index pe current char dal diya
            writeindex++;
            // abb frequency dalni hai  means count

            if(count>1){
                // count ko String me convert krna hai 
                String countstr=String.valueOf(count);
                // now string ko char arry me convert krne tavll kar leneg 
                for(char digit:countstr.toCharArray()){
                    chars[writeindex]=digit;
                    writeindex++;

                }
            }
            

           



        }
         return writeindex;
    }
    public static void main(String[] args) {
    char[]chars= {'a','a','b','b','c','c','c'};

    int ans=compress(chars);
     

    System.out.println(ans);
    }

    
}
