import java.util.*;
class test{
    // Function to count the frequency of all elements from 1 to N in the array.
    
    public static int  maxMeetings(int start[], int end[], int n)
    {

        // int [] start = {1,3,0,5,8,5};
        // int [] end =  {2,4,6,7,9,9};
        // sorting the arrays based on end time;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(end[j]>end[j+1]){
                    //swap
                    int temp1=end[j];
                    end[j]=end[j+1];
                    end[j+1]=temp1;

                    int temp2=start[j];
                    start[j]=start[j+1];
                    start[j+1]=temp2;
                }
            }
        }

        int prev_time=end[0];
        int count=0;
        for(int i=1;i<n;i++){
            if(start[i]>prev_time){
                count++;
                prev_time=end[i];
            }
        }
        return count+1;
        
    }
    public static void main(String[] args) {
        int[] start = {75250 ,50074, 43659, 8931, 11273, 27545, 50879, 77924};
        int [] end = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252};
        int n= start.length;
       int res=  maxMeetings(start,end,n);
        System.out.println(res);
        
    }
}