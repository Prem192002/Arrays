class Quick_Sort{

    static int partition(int[] arr, int st, int nd){
        int pivot = arr[st];
        int count =0;
        for(int i=st+1;i<=nd;i++){
            if(arr[i]<pivot){
                count++;
            }
        }

        int pvtidx = st+count;
        int temp=arr[pvtidx];
        arr[pvtidx]=arr[st];
        arr[st]=temp;

        //sorting both the sides

        int i = st;
        int j=nd;

        while(i<pvtidx && j>pvtidx){
            while(arr[i]<=pivot){
                i++;
            }

            while(arr[j]>pivot){
                j--;
            }

            if(i<pvtidx && j>pvtidx){
                int tem = arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
                i++;
                j--;
            }
        }
        return pvtidx;
    }

    static void sort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }

        int pi = partition(arr, start, end);
        sort(arr,start,pi-1);
        sort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        int[] arr = {5,8,3,7,9};
        sort(arr, 0, 4);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}