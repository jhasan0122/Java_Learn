package Basic;

public class Array {
    public static void main(String[] args) {
        int num[] = {3,7,2,4};

        int nums[] = new int[4];
        for (int i=0;i<4;i++){
            System.out.print(nums[i] + " ");
        }

        int matrix[][] = new int[3][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int)( Math.random() *100);
            }
            System.out.println();
        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int n[] : matrix){
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();

//        Jagged Array

        int jag[][] = new int[3][];

        jag[0] = new int[3];
        jag[1] = new int[4];
        jag[2] = new int[2];

        for (int i = 0; i < jag.length; i++) {
            for (int j = 0; j < jag[i].length; j++) {
                jag[i][j] = (int)( Math.random() *10);
            }
        }

        for(int n[] : jag){
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        int threeD[][][] = new int[3][4][5];


    }
}
