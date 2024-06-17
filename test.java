

class test
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        int st = 0;
        int nd=1;
        int value = 1;
        //sort the arrays based on end dates;
        
        mergeSort(start,end,0,n-1);
        
        while(nd<n){
            if(end[st]!=start[nd]){
                value ++;
                st=nd;
                nd++;
            }
            
            if(end[st]<=start[nd]){
                nd++;
            }
        }
        
        return value+1;
    }
    
     private static void mergeSort(int[] start, int[] end, int left, int right)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            mergeSort(start, end, left, mid);
            mergeSort(start, end, mid + 1, right);
            merge(start, end, left, mid, right);
        }
    }

    // Merge function for merge sort
    private static void merge(int[] start, int[] end, int left, int mid, int right)
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftStart = new int[n1];
        int[] leftEnd = new int[n1];
        int[] rightStart = new int[n2];
        int[] rightEnd = new int[n2];

        for (int i = 0; i < n1; i++)
        {
            leftStart[i] = start[left + i];
            leftEnd[i] = end[left + i];
        }

        for (int j = 0; j < n2; j++)
        {
            rightStart[j] = start[mid + 1 + j];
            rightEnd[j] = end[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2)
        {
            if (leftEnd[i] <= rightEnd[j])
            {
                start[k] = leftStart[i];
                end[k] = leftEnd[i];
                i++;
            }
            else
            {
                start[k] = rightStart[j];
                end[k] = rightEnd[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            start[k] = leftStart[i];
            end[k] = leftEnd[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            start[k] = rightStart[j];
            end[k] = rightEnd[j];
            j++;
            k++;
        }
    }

    
    public static void main(String[] args) {
        int[] start = {1, 3, 2, 5};
        int[] end = {2, 4, 3, 6};
        
        int ans = activitySelection(start,end,4);
        System.out.println(ans);
    }
}