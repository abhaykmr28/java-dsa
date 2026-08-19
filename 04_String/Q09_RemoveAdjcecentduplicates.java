public class Q09_RemoveAdjcecentduplicates {

    static String removeadjcentdupplicate(String s) {

    StringBuilder ans = new StringBuilder();
    int n = s.length();

    for (int i = 0; i < n; i++) {

        char currentch = s.charAt(i);

        if (ans.length() > 0 &&
            ans.charAt(ans.length() - 1) == currentch) {

            ans.deleteCharAt(ans.length() - 1);

        } else {
            ans.append(currentch);
        }
    }

    return ans.toString();
}
    public static void main(String[] args) {
        String s="abbaac";

       String finalanswer= removeadjcentdupplicate(s);

       System.out.println(finalanswer);
    }
    
}
