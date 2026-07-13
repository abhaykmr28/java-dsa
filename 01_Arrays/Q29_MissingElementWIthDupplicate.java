import java.util.*;
public class Q29_MissingElementWIthDupplicate {

    static List<Integer> MissingElement(int arr[]){
        List<Integer> list = new ArrayList<>();

        // first of all write logic for marking  
        // jis element ko travel kar rhe hai usko - se mark kar deneg 
        int n = arr.length;

        for(int index=0; index<n; index++){

            int value = Math.abs(arr[index]);// array pe travel kiya value nikal li at particulr index ki 
            int position = value-1; // jo value uski actaul positon soretd array ke case me value -1 hogi 

            // abb usko marks karna hai 
            // pichli line of code se value ki actual position pe che gye 

            if (arr[position]>0){
                arr[position]=-arr[position];
            }
        }

        // abb array ko mark kar diya jo jo element the  agar koi elment duplicate hai toh vo
        // uski actual position pe jyega but vha already markedmilega toh vo  number positive reh jayegi 

        // abb jo value positive rh gyi 
        // uss index +1 vlaue hi missing hai usko listme add karna hai 


        for(int i =0; i<n; i++){

            if(arr[i]>0){
                
            int valueAtThisIndex= i+1;
                list.add(valueAtThisIndex);
            
            }
        }

        return list;
    }
}
    

