public class leetCode1051_1 {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));

    }

    public static int heightChecker(int[] heights) {
        int[] newArray = new int[heights.length];
        for(int k=0;k<heights.length;k++){
            newArray[k] = heights[k];
        }
        boolean swapped;
        for(int i=0;i<heights.length;i++){
            swapped = false;
            for(int j=1;j<heights.length;j++){
                if(heights[j]<heights[j-1]){
                    int temp = heights[j];
                    heights[j] = heights[j-1];
                    heights[j-1] = temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }
        }


        //for array checking

        int count=0;

        for(int l=0;l<newArray.length;l++){
            if(newArray[l] != heights[l]){
                count++;
            }
        }
        return count;
    }
}
