class two_pointers {
    public static void main(String[] args) {
        int n = 4;
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = ' ';
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
