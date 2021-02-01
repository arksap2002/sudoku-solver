package metodsofdisition;

public class LastHeroInSquare {
    public static void Main(int a[][], boolean b[][][]) {
        threeandthree(a, b);
        sixandthree(a, b);
        nineandthree(a, b);
        threeandsix(a, b);
        threeandnine(a, b);
        sixandsix(a, b);
        nineandnine(a, b);
        sixandnine(a, b);
        nineandsix(a, b);
    }
    private static void nineandsix(int[][] a, boolean[][][] b) {
        int[] num1 = new int[9];
        int number1 = 0;
        int help11 = 0;
        int help12 = 0;
        int x1 = 0;
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                if (a[i][j] != -1) {
                    num1[a[i][j]] = 1;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            if (num1[j] == 0) {
                for (int k = 6; k < 9; k++) {
                    for (int l = 3; l < 6; l++) {
                        if (!b[k][l][j]) {
                            number1++;
                        } else {
                            help11 = k;
                            help12 = l;
                            x1 = j;
                        }
                    }
                }
            }
            if (number1 == 8) {
                a[help11][help12] = x1;
            }
            number1 = 0;
            x1 = 0;
            help11 = 0;
            help12 = 0;
        }
    }
    private static void sixandnine(int[][] a, boolean[][][] b) {
        int[] num1 = new int[9];
        int number1 = 0;
        int help11 = 0;
        int help12 = 0;
        int x1 = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                if (a[i][j] != -1) {
                    num1[a[i][j]] = 1;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            if (num1[j] == 0) {
                for (int k = 3; k < 6; k++) {
                    for (int l = 6; l < 9; l++) {
                        if (!b[k][l][j]) {
                            number1++;
                        } else {
                            help11 = k;
                            help12 = l;
                            x1 = j;
                        }
                    }
                }
            }
            if (number1 == 8) {
                a[help11][help12] = x1;
            }
            number1 = 0;
            x1 = 0;
            help11 = 0;
            help12 = 0;
        }
    }

    private static void nineandnine(int[][] a, boolean[][][] b) {
        int[] num1 = new int[9];
        int number1 = 0;
        int help11 = 0;
        int help12 = 0;
        int x1 = 0;
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                if (a[i][j] != -1) {
                    num1[a[i][j]] = 1;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            if (num1[j] == 0) {
                for (int k = 6; k < 9; k++) {
                    for (int l = 6; l < 9; l++) {
                        if (!b[k][l][j]) {
                            number1++;
                        } else {
                            help11 = k;
                            help12 = l;
                            x1 = j;
                        }
                    }
                }
            }
            if (number1 == 8) {
                a[help11][help12] = x1;
            }
            number1 = 0;
            x1 = 0;
            help11 = 0;
            help12 = 0;
        }
    }

    private static void sixandsix(int[][] a, boolean[][][] b) {
        int[] num1 = new int[9];
        int number1 = 0;
        int help11 = 0;
        int help12 = 0;
        int x1 = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                if (a[i][j] != -1) {
                    num1[a[i][j]] = 1;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            if (num1[j] == 0) {
                for (int k = 3; k < 6; k++) {
                    for (int l = 3; l < 6; l++) {
                        if (!b[k][l][j]) {
                            number1++;
                        } else {
                            help11 = k;
                            help12 = l;
                            x1 = j;
                        }
                    }
                }
            }
            if (number1 == 8) {
                a[help11][help12] = x1;
            }
            number1 = 0;
            x1 = 0;
            help11 = 0;
            help12 = 0;
        }
    }

    private static void threeandsix(int[][] a, boolean[][][] b) {
        int[] num1 = new int[9];
        int number1 = 0;
        int help11 = 0;
        int help12 = 0;
        int x1 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                if (a[i][j] != -1) {
                    num1[a[i][j]] = 1;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            if (num1[j] == 0) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 3; l < 6; l++) {
                        if (!b[k][l][j]) {
                            number1++;
                        } else {
                            help11 = k;
                            help12 = l;
                            x1 = j;
                        }
                    }
                }
            }
            if (number1 == 8) {
                a[help11][help12] = x1;
            }
            number1 = 0;
            x1 = 0;
            help11 = 0;
            help12 = 0;
        }
    }

    private static void threeandnine(int[][] a, boolean[][][] b) {
        int[] num1 = new int[9];
        int number1 = 0;
        int help11 = 0;
        int help12 = 0;
        int x1 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
                if (a[i][j] != -1) {
                    num1[a[i][j]] = 1;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            if (num1[j] == 0) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 6; l < 9; l++) {
                        if (!b[k][l][j]) {
                            number1++;
                        } else {
                            help11 = k;
                            help12 = l;
                            x1 = j;
                        }
                    }
                }
            }
            if (number1 == 8) {
                a[help11][help12] = x1;
            }
            number1 = 0;
            x1 = 0;
            help11 = 0;
            help12 = 0;
        }
    }

    private static void nineandthree(int[][] a, boolean[][][] b) {
        int[] num1 = new int[9];
        int number1 = 0;
        int help11 = 0;
        int help12 = 0;
        int x1 = 0;
        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] != -1) {
                    num1[a[i][j]] = 1;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            if (num1[j] == 0) {
                for (int k = 6; k < 9; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (!b[k][l][j]) {
                            number1++;
                        } else {
                            help11 = k;
                            help12 = l;
                            x1 = j;
                        }
                    }
                }
            }
            if (number1 == 8) {
                a[help11][help12] = x1;
            }
            number1 = 0;
            x1 = 0;
            help11 = 0;
            help12 = 0;
        }
    }

    private static void sixandthree(int[][] a, boolean[][][] b) {
        int[] num1 = new int[9];
        int number1 = 0;
        int help11 = 0;
        int help12 = 0;
        int x1 = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] != -1) {
                    num1[a[i][j]] = 1;
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            if (num1[j] == 0) {
                for (int k = 3; k < 6; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (!b[k][l][j]) {
                            number1++;
                        } else {
                            help11 = k;
                            help12 = l;
                            x1 = j;
                        }
                    }
                }
            }
            if (number1 == 8) {
                a[help11][help12] = x1;
            }
            number1 = 0;
            x1 = 0;
            help11 = 0;
            help12 = 0;
        }
    }
    private static void threeandthree(int[][] a, boolean[][][] b) {
        int[] num1 = new int[9];
        int number1 = 0;
        int help11 = 0;
        int help12 = 0;
        int x1 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] != -1) {
                    num1[a[i][j]] = 1;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            if (num1[j] == 0) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (!b[k][l][j]) {
                            number1++;
                        } else {
                            help11 = k;
                            help12 = l;
                            x1 = j;
                        }
                    }
                }
            }
            if (number1 == 8) {
                a[help11][help12] = x1;
            }
            number1 = 0;
            x1 = 0;
            help11 = 0;
            help12 = 0;
        }
    }
}