package metodsofdisition;

public class Andwhoifnotme {
    public static void Main(int a[][], boolean b[][][]){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] != -1) {
                    for (int t = 0; t < 9; t++) {
                        b[i][j][t] = false;
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (a[i][j] != -1) {
                    for (int t = 0; t < 9; t++) {
                        b[i][t][a[i][j]] = false;
                    }
                    for (int t = 0; t < 9; t++) {
                        b[t][j][a[i][j]] = false;
                    }
                    if ((i < 3) && (j < 3)) {
                        for (int w = 0; w < 3; w++) {
                            for (int v = 0; v < 3; v++) {
                                b[w][v][a[i][j]] = false;
                            }
                        }
                    }
                    if ((i < 3) && (j < 6) && (j > 2)) {
                        for (int w = 0; w < 3; w++) {
                            for (int v = 3; v < 6; v++) {
                                b[w][v][a[i][j]] = false;
                            }
                        }
                    }
                    if ((i < 3) && (j < 9) && (j > 5)) {
                        for (int w = 0; w < 3; w++) {
                            for (int v = 6; v < 9; v++) {
                                b[w][v][a[i][j]] = false;
                            }
                        }
                    }
                    if ((i > 2) && (i < 6) && (j < 3)) {
                        for (int w = 3; w < 6; w++) {
                            for (int v = 0; v < 3; v++) {
                                b[w][v][a[i][j]] = false;
                            }
                        }
                    }
                    if ((i > 2) && (i < 6) && (j > 2) && (j < 6)) {
                        for (int w = 3; w < 6; w++) {
                            for (int v = 3; v < 6; v++) {
                                b[w][v][a[i][j]] = false;
                            }
                        }
                    }
                    if ((i > 2) && (i < 6) && (j > 5)) {
                        for (int w = 3; w < 6; w++) {
                            for (int v = 6; v < 9; v++) {
                                b[w][v][a[i][j]] = false;
                            }
                        }
                    }
                    if ((i > 5) && (j < 3)) {
                        for (int w = 6; w < 9; w++) {
                            for (int v = 0; v < 3; v++) {
                                b[w][v][a[i][j]] = false;
                            }
                        }
                    }
                    if ((i > 5) && (j < 6) && (j > 2)) {
                        for (int w = 6; w < 9; w++) {
                            for (int v = 3; v < 6; v++) {
                                b[w][v][a[i][j]] = false;
                            }
                        }
                    }
                    if ((i > 5) && (j < 9) && (j > 5)) {
                        for (int w = 6; w < 9; w++) {
                            for (int v = 6; v < 9; v++) {
                                b[w][v][a[i][j]] = false;
                            }
                        }
                    }
                }
            }
        }
    }
}
