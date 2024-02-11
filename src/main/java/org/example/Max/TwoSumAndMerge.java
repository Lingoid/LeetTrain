package org.example.Max;

import java.lang.reflect.Array;
import java.util.*;

public class TwoSumAndMerge {
    public static void main(String[] args) {
        int[] array = new int[2];
        Array.set(array, 0, -2);
        Array.set(array, 1, -1);
       // Array.set(array, 2, 8);
       // Array.set(array, 3, 9);
       // Array.set(array, 4, 10);

        int[] array2 = new int[1];
        Array.set(array2, 0, 3);
       // Array.set(array2, 1, 7);
       // Array.set(array2, 2, 6);
       // Array.set(array2, 3, 7);
       // Array.set(array2, 4, 11);
        TwoSumAndMerge sum = new TwoSumAndMerge();

        System.out.println(Arrays.toString(merge(array, array2)));
        System.out.println(sum.findMedianSortedArrays(array2, array));

    }


        public int[] twoSum(int[] nums, int target) {
            int n=nums.length;
            Map<Integer,Integer> map=new HashMap<>();
            int[] result=new int[2];
            for(int i=0;i<n;i++){
                if(map.containsKey(target-nums[i])){
                    result[1]=i;
                    result[0]=map.get(target-nums[i]);
                    return result;
                }
                map.put(nums[i],i);
            }
            return result;
        }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] mergedList = merge(nums1, nums2);
        double median;
        int sum;
        if(!(mergedList.length % 2 == 0)) {

            int indexOfCenterElement = (int) Math.floor((double) mergedList.length / 2);
            median = (double) mergedList[indexOfCenterElement];
        }
        else  {
            sum = mergedList[mergedList.length / 2] + mergedList[(mergedList.length/2) - 1];
            median = (double) sum / 2;
        }


        return median;


    }


    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }
}

