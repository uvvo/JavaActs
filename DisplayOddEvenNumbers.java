//Display Odd and Even Numbers using Array.
    
   public class DisplayOddEvenNumbers{
       public static void main(String args[]){  
      
           int num[]={76,93,7,40,28,75,9,17,59,23,39,88,34,11,5};  // Variable
   
       System.out.println("Odd Numbers:"); //print the ODD numbers
          for(int i=0;i<num.length;i++){  
           if(num[i]%2!=0){  
       System.out.println(num[i]);  
  }  
     }  
       System.out.println("Even Numbers:"); //Print the Even numbers 
          for(int i=0;i<num.length;i++){  
           if(num[i]%2==0){  
       System.out.println(num[i]);  
       }  
   }  
 }
}  