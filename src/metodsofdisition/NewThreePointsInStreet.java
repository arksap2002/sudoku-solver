package metodsofdisition;

public class NewThreePointsInStreet {
    public static void Main(int a[][], boolean b[][][]) {
        int[] num = new int[9];
        int[] newmas = new int[27];
        int newint = 0;
        int number;
        int newnum = 0;
        for (int l = 0; l < 9; l++) {
            for (int i = 0; i < 9; i++) {
                num[i] = -1;
            }
            for (int i = 0; i < 27; i++) {
                newmas[i] = -1;
            }
            for (int k = 0; k < 9; k++) {
                number = newint;
                for (int j = 0; j < 9; j++) {
                    if (b[j][l][k]) {
                        newmas[newint] = j;
                        newint++;
                    }
                }
                if ((newint - number) == 3) {
                    num[newnum] = k;
                    newnum++;
                } else {
                    for (int t = number; t < newint; t++) {
                        newmas[t] = -1;
                    }
                    newint = number;
                }
            }
            fidnumbers(num, newmas, b, l);
            number = 0;
            newint = 0;
            newnum = 0;
            for (int i = 0; i < 9; i++){
                num[i] = -1;
            }
            for (int i = 0; i < 27; i++){
                newmas[i] = -1;
            }
        }
    }

    private static void fidnumbers(int[] num, int[] newmas, boolean[][][] b, int l) {
        int flag = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        int fircoor = 0;
        int seccoor = 0;
        int thircoor = 0;
        for (int i = 0; i < 27; i = i + 3) {
            for (int j = 0; j < 27; j = j + 3) {
                for (int k = 0; k < 27; k = k + 3) {
                    if ((k != j) && (i != k) && (i != j) && (newmas[i] != -1) && (newmas[j] != -1) && (newmas[k] != -1) && (newmas[i] == newmas[j]) && (newmas[i] == newmas[k]) && (newmas[k] == newmas[j]) && (newmas[i + 1] == newmas[j + 1]) && (newmas[k + 1] == newmas[j + 1]) && (newmas[i + 1] == newmas[k + 1]) && (newmas[i + 2] == newmas[j + 2]) && (newmas[k + 2] == newmas[j + 2]) && (newmas[i + 2] == newmas[k + 2])) {
                        first = num[i / 3];
                        second = num[j / 3];
                        third = num[k / 3];
                        fircoor = newmas[i];
                        seccoor = newmas[i + 1];
                        thircoor = newmas[i + 2];
                        flag = 1;
                    }
                }
            }
            if (flag == 1) {
                for (int v = 0; v < 9; v++){
                    if ((v != first) && (v != second) && (v != third)){
                        b[fircoor][l][v] = false;
                        b[seccoor][l][v] = false;
                        b[thircoor][l][v] = false;
                    }
                }
                if ((l < 3) && (fircoor < 3) && (seccoor < 3) && (thircoor < 3)) {
                    for (int r = 0; r < 3; r++) {
                        for (int j = 0; j < 3; j++) {
                            if (((r != l) || (j != fircoor)) && ((r != l) || (j != seccoor)) && ((r != l) || (j != thircoor))) {
                                b[j][r][first] = false;
                                b[j][r][second] = false;
                                b[j][r][third] = false;
                            }
                        }
                    }
                }
                if ((l < 6) && (l >= 3) && (fircoor < 3) && (seccoor < 3) && (thircoor < 3)) {
                    for (int r = 3; r < 6; r++) {
                        for (int j = 0; j < 3; j++) {
                            if (((r != l) || (j != fircoor)) && ((r != l) || (j != seccoor)) && ((r != l) || (j != thircoor))) {
                                b[j][r][first] = false;
                                b[j][r][second] = false;
                                b[j][r][third] = false;
                            }
                        }
                    }
                }
                if ((l < 9) && (l >= 6) && (fircoor < 3) && (seccoor < 3) && (thircoor < 3)) {
                    for (int r = 6; r < 9; r++) {
                        for (int j = 0; j < 3; j++) {
                            if (((r != l) || (j != fircoor)) && ((r != l) || (j != seccoor)) && ((r != l) || (j != thircoor))) {
                                b[j][r][first] = false;
                                b[j][r][second] = false;
                                b[j][r][third] = false;
                            }
                        }
                    }
                }
                if ((l < 3) && (fircoor < 6) && (seccoor < 6) && (thircoor < 6) && (fircoor >= 3) && (seccoor >= 3) && (thircoor >= 3)) {
                    for (int r = 0; r < 3; r++) {
                        for (int j = 3; j < 6; j++) {
                            if (((r != l) || (j != fircoor)) && ((r != l) || (j != seccoor)) && ((r != l) || (j != thircoor))) {
                                b[j][r][first] = false;
                                b[j][r][second] = false;
                                b[j][r][third] = false;
                            }
                        }
                    }
                }
                if ((l < 6) && (l >= 3) && (fircoor < 6) && (seccoor < 6) && (thircoor < 6) && (fircoor >= 3) && (seccoor >= 3) && (thircoor >= 3)) {
                    for (int r = 3; r < 6; r++) {
                        for (int j = 3; j < 6; j++) {
                            if (((r != l) || (j != fircoor)) && ((r != l) || (j != seccoor)) && ((r != l) || (j != thircoor))) {
                                b[j][r][first] = false;
                                b[j][r][second] = false;
                                b[j][r][third] = false;
                            }
                        }
                    }
                }
                if ((l < 9) && (l >= 6) && (fircoor < 6) && (seccoor < 6) && (thircoor < 6) && (fircoor >= 3) && (seccoor >= 3) && (thircoor >= 3)) {
                    for (int r = 6; r < 9; r++) {
                        for (int j = 3; j < 6; j++) {
                            if (((r != l) || (j != fircoor)) && ((r != l) || (j != seccoor)) && ((r != l) || (j != thircoor))) {
                                b[j][r][first] = false;
                                b[j][r][second] = false;
                                b[j][r][third] = false;
                            }
                        }
                    }
                }
                if ((l < 3) && (fircoor < 9) && (seccoor < 9) && (thircoor < 9) && (fircoor >= 6) && (seccoor >= 6) && (thircoor >= 6)) {
                    for (int r = 0; r < 3; r++) {
                        for (int j = 6; j < 9; j++) {
                            if (((r != l) || (j != fircoor)) && ((r != l) || (j != seccoor)) && ((r != l) || (j != thircoor))) {
                                b[j][r][first] = false;
                                b[j][r][second] = false;
                                b[j][r][third] = false;
                            }
                        }
                    }
                }
                if ((l < 6) && (l >= 3) && (fircoor < 9) && (seccoor < 9) && (thircoor < 9) && (fircoor >= 6) && (seccoor >= 6) && (thircoor >= 6)) {
                    for (int r = 3; r < 6; r++) {
                        for (int j = 6; j < 9; j++) {
                            if (((r != l) || (j != fircoor)) && ((r != l) || (j != seccoor)) && ((r != l) || (j != thircoor))) {
                                b[j][r][first] = false;
                                b[j][r][second] = false;
                                b[j][r][third] = false;
                            }
                        }
                    }
                }
                if ((l < 9) && (l >= 6) && (fircoor < 9) && (seccoor < 9) && (thircoor < 9) && (fircoor >= 6) && (seccoor >= 6) && (thircoor >= 6)) {
                    for (int r = 6; r < 9; r++) {
                        for (int j = 6; j < 9; j++) {
                            if (((r != l) || (j != fircoor)) && ((r != l) || (j != seccoor)) && ((r != l) || (j != thircoor))) {
                                b[j][r][first] = false;
                                b[j][r][second] = false;
                                b[j][r][third] = false;
                            }
                        }
                    }
                }
            }
        }
    }
}