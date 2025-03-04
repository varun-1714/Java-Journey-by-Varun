public class Arrays { //learning array
    public static void main (String a[])
    {
        // intiallzing array
        // int nums[] = {9,2,34,8};
        // // how fetch the elements 
        // System.out.println(nums[1]); // output: 2
        // System.out.println(nums[0]); // output : 9
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 3;
        nums[2] = 38;
        nums[3] = 33;

        for( int i=0;i<4;i++){
            System.out.println(nums[i]);
        }
    }
}
