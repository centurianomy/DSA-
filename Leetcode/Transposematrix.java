
//using extra space
public class Transgposematrix
{
    public static int[][] show(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length; //matrix[0] is used for col because java stores matrx elements as matrix rows only so matrix[0] means number of elements in oth row which is the number of colums.
        
        int[][] result=new int[row][col]; 
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                result[j][i]=matrix[i][j];            
                //result[i][j]=matrix[j][i]; NOte: this time matrix size is same but it will create problme when the matrix size is (2x3) different. 
            }
        }
        return result;
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