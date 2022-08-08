public class HouseRobber {
    public static void main(String[] args) {
        int []arr = {2,7,9,3,1};
        int res = houseRob(arr);
        System.out.println(res);
    }

    private static int houseRob(int[] arr) {
        if(arr.length == 0)
        {
            return -1;
        }
        if(arr.length == 1)
        {
            return arr[0];
        }
        if(arr.length == 2)
        {
            return Math.max(arr[0],arr[1]);
        }
        int []dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i = 2; i<arr.length;i++)
        {
            dp[i] = Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        return dp[arr.length -1];
    }


}
