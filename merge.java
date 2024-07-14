public class merge {
    public void divide(int arr[] , int si , int ei){
        if(si >= ei)
        return;
        int mid = (si + ei) / 2;
        divide(arr , si , mid);
        divide(arr , mid+1, ei);
        converge(arr, si, mid, ei);
    }
    public void converge(int arr[], int si , int mid , int ei){
int merged[] = new int[ei - si + 1];
int idx1 = si;
int idx2 = mid+1;
    int x = 0;
while((idx1 <= mid) && (idx2 <= ei)){
    if(arr[idx1] < arr[idx2])
    {
        merged[x++] = arr[idx1];
        idx1++;
    }
   else
    {
        merged[x++] = arr[idx2];
        idx2++;
    }
    }
    while(idx1 <= mid)
    {
        merged[x++] = arr[idx1];
        idx1++;
    }
    while(idx2 <= ei)
    {
        merged[x++] = arr[idx2];
        idx2++;
    }
    for(int j = 0 , i= si ; j < merged.length ; j++ , i++)
    {
        arr[i] = merged[j];
    }

}
public static void main(String[] args)
{
    int a[] = {23,43,56,3,64,76,88,43,1};
    merge obj = new merge();
    obj.divide(a,0, a.length-1);
    for(int i = 0; i < a.length ; i++)
    System.out.println(a[i]);

}
    
}
