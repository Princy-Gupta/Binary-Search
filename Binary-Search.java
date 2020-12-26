import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] input = takeInput();
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int x = Integer.parseInt(br.readLine().trim());
            System.out.println(Solution.binarySearch(input, x));

            t -= 1;
        }
    }
}


public class BinarySearch{	
	//arr is the given sorted array in which you need to find num
	public static int binarySearch(int[] arr, int num){
		//write your code here
        int start=0;int end= arr.length-1; int mid;
        while(start<end)
        {
            mid=(start+end)/2;
            if(arr[mid]==num)
            {
                return mid;
               
            }
            else if(num>arr[mid])
            {
                start=mid+1;
                
            }
            else if(num<arr[mid])
            {
                end=mid-1;
            }
        }
            return -1;
	}
}