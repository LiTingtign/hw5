public class Sort {



    /**
         * 冒泡排序
         */
    static void bubbleSort(int arr[], int len){
            int i,j,temp,c1=0,c2=0;
            for(i=0;i<len-1;i++){
                for(j=len-1;j>i;j--){
                    c1++;
                    if(arr[j]<arr[j-1]){
                        temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        c2++;
                    }
                }
            }
            System.out.println("比较"+c1+"次,"+"移动"+c2+"次");
        }
}
