public class leetCode875_1 {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));

    }

    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = MaxValue(piles);

        while(start<=end){
            int mid = start + (end - start)/2;
            if(calHours(piles,mid)>h){
                start = mid + 1;
            }
            else if(calHours(piles,mid)<h){
                end = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static int MaxValue(int[] piles){
        int MAX = piles[0];
        for(int i=0;i<piles.length;i++){
            if(MAX<piles[i]){
                MAX = piles[i];
            }
        }
        return MAX;
    }

    public static int calHours(int[] piles,int mid){
        int newHours = 0;
        for(int i=0;i<piles.length;i++){
            newHours += (int)Math.ceil((double)piles[i]/mid);
        }
        return newHours;

    }
}
