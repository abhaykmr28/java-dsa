public class Q03_CountVowelsInString {
    
    static int countVowels(String str){
        int count =0;
        int n=str.length();
        for(int i=0; i<n; i++ ){
            char ch=str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="IndependenceDay";
        int ans =countVowels(str);
        System.out.println(ans);
    }
    
}
