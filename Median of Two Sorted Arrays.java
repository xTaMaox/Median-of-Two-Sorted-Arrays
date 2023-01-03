public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m= nums1.length;
        int n= nums2.length;
        int i=0;
        int j=0;
        int k=0;
        int length = nums1.length+nums2.length;
        int middle = length/2;
        int mid2 =0;
        int mid1=0;
        while (i<=middle){
            mid1=mid2;
            if(j<m && k <n) {
                if (nums1[j] < nums2[k]) {
                    mid2= nums1[j];
                    j++;
                } else {
                    mid2= nums2[k];
                    k++;
                }
            } else if (j<m) {
                mid2=nums1[j];
                j++;
            }
            else {``
                mid2=nums2[k];
                k++;
            }
            i++;
        }
        double median = (length % 2==0)?(mid1+mid2)/2.0: mid2;
    return median;