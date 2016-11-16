
public class UE2Beispiel4 {

	public static void main(String[] args) {

		double[][] idMat = generateIdMatrix(7);

		printMatrix(idMat);
	}

	public static double[][] generateIdMatrix(int size) {

		double[][] matrix = new double[size][size];

		for (int i = 0; i < size; i++) {
			matrix[i][i] = 1.0;
		}

		return matrix;
	}

	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			
			for(int j=0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
