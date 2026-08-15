public class Q06_ReverseWordsinaString {
    
    static String ReverseWord(String s){
        StringBuilder ans= new StringBuilder();
        int n= s.length();
        int i=n-1;
        
        // i/p ->  sky is the blue 
        // o/p -> blue the is sky

    //  |s|k|y|_|i|s|_|t|h|e|_|b|l|u|e|
                                 // i^
        // main while loop jab tak chlega jab tak i first letter (s) pe nahi aa jata 

        while(i>=0){

            // agr e ke bad last me traling space hai 
            // toh usko remove karte hai or i ko e pelate hai 

            while(i>=0 && s.charAt(i)==' '){
                i--;
            }

            // i , blue  e pe aa chuka hai 
            // now place j at i
            int j=i;

            // abb fist word ki substing find krte hai 
            while(j>=0 && s.charAt(j)!=' '){
                j--;

            }

            // now j ab    _blue  se phale wale psace pe aa chukhai 
            // ans wale stringbuilder me word koadd kro
            ans.append(s.substring(j+1,i+1));

            // abb j jiss space pe ahi agar uske piche orr bhi space hue toh 
            // unko ignorekre hai  'the' ke e word pe aana hai 
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            // agar jab abb valid index pe ahi toh usee pahle ek space dal dete hai 
            // string builder me 
            if(j>=0){
                ans.append(' ');
            }

            // Aab 'the'ko dlana hai toh i ko j pe layo
            i=j;


        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s="sky is the blue";
       String finalans= ReverseWord(s);
       System.out.println(finalans);
    }
    
}
