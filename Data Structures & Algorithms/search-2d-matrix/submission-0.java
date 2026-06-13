class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int a = 0;
        int b = 0;
        int arr[] = new int[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(target==matrix[i][j]) return true;
            }
        }
        return false;
        // while(a<m){
        //     //arr[i] = matrix[i][n-1];
        //     if(target<matrix[a][n-1]){
        //         a--;
        //         break;
        //     }
        //     a++;
        // }

        // // for(int i=0;i<m;i++){

        // // }
        // while(b<n){
        //     if(target == matrix[a][b]){
        //         return true;
        //     }
        // }
        // return false;
    }
}
