package Easy;
//https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array
public class HighestInArrays {
    public static void main(String[] args) {

    }
    public int largest(int arr[], int n)
    {
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(a<arr[i]){
                a=arr[i];
            }
        }
        return a;

    }

}
