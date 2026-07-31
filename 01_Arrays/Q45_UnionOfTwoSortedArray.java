import java.util.*;
public class Q45_UnionOfTwoSortedArray {
  

    static ArrayList<Integer> union(int arr1[],int arr2[]){

        ArrayList<Integer>ans= new ArrayList<>();
        int n=arr1.length;
        int m= arr2.length;

        int i=0;
        int j=0;

        while( i<n && j<m){

            
            if(arr1[i]<arr2[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                    i++;

                }
            }
        

else if(arr2[j]<arr1[i]){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                    j++;
            
        }
    }
    else{
        if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                    i++;
                    j++;
            
        
    }
        


    }
}

while(i<n){
      if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                    i++;

}
    
}
while (j<m) {
     if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                    j++;
    
}
}
return ans;
       

    
    }
    public static void main(String[] args){
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,7};

        union(arr1, arr2);
        System.out.println(union(arr1, arr2));

    




        
    }


}

    

