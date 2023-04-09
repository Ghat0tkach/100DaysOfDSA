package Medium;

import java.util.Arrays;
import java.util.ArrayList;

public class RearrangePositiveAndNegatives {
    public static void main(String[] args) {
        int[] arr = {3, -2, 1, -5, 2, -4};

        System.out.println(Arrays.toString(Optimal(arr)));
    }

    static int[] BruteForce(int[] A,int n) {
        // Define 2 vectors, one for storing positive
        // and other for negative elements of the array.
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        // Segregate the array into positives and negatives.
        for(int i=0;i<n;i++){

            if(A[i]>0) pos.add(A[i]);
            else neg.add(A[i]);
        }

        // Positives on even indices, negatives on odd.
        for(int i=0;i<n/2;i++){

            A[2*i] = pos.get(i);
            A[2*i+1] = neg.get(i);
        }


        return A;

    }
    static int[] Optimal(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        int  positiveindex=0;
        int negativeindex=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[positiveindex]=nums[i];
                positiveindex+=2;
            }
            else{
                ans[negativeindex]=nums[i];
                negativeindex+=2;
            }
        }
    return ans;
    }
    //if numberofPositve!=numberofNegative
    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
        // Define 2 ArrayLists, one for storing positive
        // and other for negative elements of the array.
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Segregate the array into positives and negatives.
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0)
                pos.add(A.get(i));
            else
                neg.add(A.get(i));
        }

        // If positives are lesser than the negatives.
        if (pos.size() < neg.size()) {

            // First, fill array alternatively till the point
            // where positives and negatives are equal in number.
            for (int i = 0; i < pos.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining negatives at the end of the array.
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                A.set(index, neg.get(i));
                index++;
            }
        }

        // If negatives are lesser than the positives.
        else {
            // First, fill array alternatively till the point
            // where positives and negatives are equal in number.
            for (int i = 0; i < neg.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining positives at the end of the array.
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                A.set(index, pos.get(i));
                index++;
            }
        }
        return A;
    }

}


