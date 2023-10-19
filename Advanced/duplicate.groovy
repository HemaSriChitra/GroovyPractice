class Duplicate {

    static void main(String[] args){
        //initialize the array
        int[] arr=[2,3,3,4,6,7,88,56,44,2,44];
        //initialize the count and  returns the number of times
        int count=0
        //looping statement 
        for(int i=0;i<arr.size();i++){
 
            for (int j=i+1;j<arr.size();j++){
                //finding the duplicates
                if(arr[i]==arr[j]){            

                    arr[i]=0                

                }

            }

        }
          
        for(int i=0;i<arr.size();i++){

            if(arr[i]!=0){
                //print the statement
                println(arr[i] + " ")

            }

        }

   }

}