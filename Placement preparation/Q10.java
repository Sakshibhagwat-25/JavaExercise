class Demo{
    public static int findRowWithMaxOnes(int[][] matrix){
        int maxOnesRow = 1;
        int maxOnesCount = 0;

        for(int i=0; i<matrix.length;i++){
            int onesCount=0;
            for(int j=0; j<matrix[i].length;j++){
                if(matrix[i][j] ==1){
                    onesCount++;
                }
            }
            if(onesCount > maxOnesCount){
                maxOnesCount = onesCount;
                maxOnesRow = i;
            }
        }
        return maxOnesRow;

    }
    public static void main(String args[]){
        int[][] matrix = {
            {0,1,1,0},
            {1,1,0,1},
            {0,0,1,1},
            {1,0,0,1}
        };
        int maxOnesRow = findRowWithMaxOnes(matrix);
        System.out.println("Row with maximum number of 1's: " + maxOnesRow);
    }
}