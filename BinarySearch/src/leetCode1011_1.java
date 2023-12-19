public class leetCode1011_1 {
    public static void main(String[] args){
        int[] weights = {1,2,3,4,5,6,7,8,9};
        System.out.println(shipWithinDays(weights,5));

    }

    public static int shipWithinDays(int[] weights, int days) {
        int start = findMax(weights);
        int end = totalSum(weights);

        while(start < end){
            int mid = start + (end - start) / 2;

            if(calCapacity(weights,mid) > days){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;

    }

    public static int findMax(int[] weights){
        int max = weights[0];
        for (int i = 0; i < weights.length; i++) {
            if(weights[i] > max){
                max = weights[i];
            }

        }
        return max;
    }

    public static int totalSum(int[] weights){
        int total = 0;
        for(int i=0;i<weights.length;i++){
            total += weights[i];
        }
        return total;
    }

    public static int calCapacity(int[] weights,int newCapacity){
        int newDays = 1;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            if(sum + weights[i] > newCapacity){
                newDays++;
                sum = weights[i];
            }else{
                sum += weights[i];
            }

        }
        return newDays;
    }
}
