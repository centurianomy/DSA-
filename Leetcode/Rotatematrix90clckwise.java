//Rotate matrix 90 deg clockwise
//hint: step1- Transpose      step2- reverse each row

public class Rotatematrix90clckwise
{
    public static int[][] show(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length; //matrix[0] is used for col because java stores matrx elements as matrix rows only so matrix[0] means number of elements in oth row which is the number of colums.
        int temp;
        int[][] result=new int[col][row]; //we are creating a new matrix with col and row size interchanged because we are going to store the transposed matrix in it. prevents errorwhen the matrix size is not same 
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                result[j][i]=matrix[i][j];            
                //result[i][j]=matrix[j][i]; NOte: this time matrix size is same but it will create problme when the matrix size is (2x3) different. 
            }
        }
        //this part added for rotation matrix
        for(int i=0; i<row; i++){
            for(int j=0; j<col-2; j++){ //j will only go single loop fro each row
                temp=result[i][j]; //swap
                result[i][j]=result[i][j+2];
                result[i][j+2]=temp;
            }
        }
        
        return result;  //remember return gives the address not the value of the matrix because we are returning the reference of the matrix.
        //L-39: we use s.o.p to print the matrix because we are returning the reference of the matrix and not the value of the matrix.
    }
    
    
	public static void main(String[] args) {
	    int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
	    
	    System.out.println("Original matrix: ");
	    for(int i=0; i<matrix.length; i++){
	        for(int j=0;  j<matrix[0].length; j++){
	            System.out.print(matrix[i][j]+" ");        
	        }
	        System.out.println();
	    }
	    
	         System.out.println();
	        
	    //create a new int var for storing resultat matirx result./
	    int[][] transpose=show(matrix); //function call 
	    System.out.println("Transpose matrix: ");
	    for(int i=0; i<matrix.length; i++){
	        for(int j=0;  j<matrix[0].length; j++){
	            System.out.print(transpose[i][j]+" ");        
	        }
	        System.out.println();
	    }
	}
}