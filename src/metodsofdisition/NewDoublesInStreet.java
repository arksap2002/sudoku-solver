package metodsofdisition;

public class NewDoublesInStreet {
    public static void Main(int a[][], boolean b[][][]) {
        int[] num = new int[9];
        int[] newmas = new int[18];
        int newint = 0;
        int number = 0;
        int newnum = 0;

        for (int l = 0; l < 9; l++){
            for (int i = 0; i < 9; i++){
                num[i] = -1;
            }
            for (int i = 0; i < 18; i++){
                newmas[i] = -1;
            }
            for (int k = 0; k < 9; k++){
                number = newint;
                for (int j = 0; j < 9; j++){
                    if (b[j][l][k]){
                        newmas[newint] = j;
                        newint++;
                    }
                }
                if ((newint - number) == 2){
                    num[newnum] = k;
                    newnum++;
                }else {
                    for (int t = number; t < newint; t++){
                        newmas[t] = -1;
                    }
                    newint = number;
                }
            }
            fidnumbers(num, newmas, b, l);
            newint = 0;
            number = 0;
            newnum = 0;
            for (int i = 0; i < 9; i++){
                num[i] = -1;
            }
            for (int i = 0; i < 18; i++){
                newmas[i] = -1;
            }
        }
    }
    private static void fidnumbers(int[] num, int[] newmas, boolean[][][] b, int l) {
        int flag = 0;
        int first = 0;
        int second = 0;
        int fircoor = 0;
        int seccoor = 0;
        for (int i = 0; i < 18; i = i + 2) {
            for (int j = i + 2; j < 18; j = j + 2) {
                if ((i != j) && (newmas[i] != -1) && (newmas[j] != -1) && (newmas[i] == newmas[j]) && (newmas[i + 1] == newmas[j + 1])) {
                    first = num[i / 2];
                    second = num[j / 2];
                    fircoor = newmas[i];
                    seccoor = newmas[i + 1];
                    flag = 1;
                }
            }
        }
        if (flag ==1) {
            if ((fircoor < 3) && (seccoor < 3)) {
                if (l < 3) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if ((j != l) && ((i != fircoor) || (j != l)) && ((i != seccoor) || (j != l))) {
                                b[i][j][first] = false;
                                b[i][j][second] = false;
                            }
                        }
                    }
                }
                if ((l >= 3) && (l < 6)) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 3; j < 6; j++) {
                            if ((j != l) && ((i != fircoor) || (j != l)) && ((i != seccoor) || (j != l))) {
                                b[i][j][first] = false;
                                b[i][j][second] = false;
                            }
                        }
                    }
                }
                if (l >= 6) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 6; j < 9; j++) {
                            if ((j != l) && ((i != fircoor) || (j != l)) && ((i != seccoor) || (j != l))) {
                                b[i][j][first] = false;
                                b[i][j][second] = false;
                            }
                        }
                    }
                }
            }
            if ((fircoor < 6) && (seccoor < 6) && (fircoor >= 3) && (seccoor >= 3)) {
                if (l < 3) {
                    for (int i = 3; i < 6; i++) {
                        for (int j = 0; j < 3; j++) {
                            if ((j != l) && ((i != fircoor) || (j != l)) && ((i != seccoor) || (j != l))) {
                                b[i][j][first] = false;
                                b[i][j][second] = false;
                            }
                        }
                    }
                }
                if ((l >= 3) && (l < 6)) {
                    for (int i = 3; i < 6; i++) {
                        for (int j = 3; j < 6; j++) {
                            if ((j != l) && ((i != fircoor) || (j != l)) && ((i != seccoor) || (j != l))) {
                                b[i][j][first] = false;
                                b[i][j][second] = false;
                            }
                        }
                    }
                }
                if (l >= 6) {
                    for (int i = 3; i < 6; i++) {
                        for (int j = 6; j < 9; j++) {
                            if ((j != l) && ((i != fircoor) || (j != l)) && ((i != seccoor) || (j != l))) {
                                b[i][j][first] = false;
                                b[i][j][second] = false;
                            }
                        }
                    }
                }
            }
            if ((fircoor >= 6) && (seccoor >= 6)) {
                if (l < 3) {
                    for (int i = 6; i < 9; i++) {
                        for (int j = 0; j < 3; j++) {
                            if ((j != l) && ((i != fircoor) || (j != l)) && ((i != seccoor) || (j != l))) {
                                b[i][j][first] = false;
                                b[i][j][second] = false;
                            }
                        }
                    }
                }
                if ((l >= 3) && (l < 6)) {
                    for (int i = 6; i < 9; i++) {
                        for (int j = 3; j < 6; j++) {
                            if ((j != l) && ((i != fircoor) || (j != l)) && ((i != seccoor) || (j != l))) {
                                b[i][j][first] = false;
                                b[i][j][second] = false;
                            }
                        }
                    }
                }
                if (l >= 6) {
                    for (int i = 6; i < 9; i++) {
                        for (int j = 6; j < 9; j++) {
                            if ((j != l) && ((i != fircoor) || (j != l)) && ((i != seccoor) || (j != l))) {
                                b[i][j][first] = false;
                                b[i][j][second] = false;
                            }
                        }
                    }
                }
            }
            for (int w = 0; w < 9; w++){
                if ((w != fircoor) && (w != seccoor)) {
                    b[w][l][first] = false;
                    b[w][l][second] = false;
                }else {
                    for (int q = 0; q < 9; q++) {
                        if ((q != first) && (q != second)) {
                            b[w][l][q] = false;
                        }
                    }
                }
            }
        }
    }
}