package DSA_JAVA;

public class BinarySearch {
        public static void main(String[] args){
            int num[] = {1,2,34,56,66,78,98};
            int target = 6;
            int index = binarySearch(num,target);
            if(index == -1)
            System.out.println("num not found");
            else
            System.out.println("num found at index "+index);
        }
        public static int binarySearch(int arr[] , int target)
        {
            int start = 0;
            int end = arr.length - 1;
            int mid = start + (end - start)/2;
            boolean isAsc = arr[0] < arr[arr.length-1];
            if(isAsc)
            {
                while(start <= end)
                {
                    if(arr[mid] == target)
                    return mid;
                    else if(arr[mid] < target)
                    {
                    start = mid + 1;
                    mid = start + (end - start)/2;
                    }
                    else 
                    {
                        end = mid - 1;
                        mid = start + (end - start)/2;
                    }
                }
            }
            else{
                while(start <= end)
                {
                    if(arr[mid] == target)
                    return mid;
                    else if(arr[mid] > target)
                    {
                    start = mid + 1;
                    mid = start + (end - start)/2;
                    }
                    else 
                    {
                        end = mid - 1;
                        mid = start + (end - start)/2;
                    }
                }
            }
            return -1;
        }
    }

