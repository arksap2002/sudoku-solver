package metodsofdisition;

public class DoublesInSquare {
    public static void Main(int a[][], boolean b[][][]) {
        int[] num = new int[9];
        int[] newmas = new int[36];
        int newint = 0;
        int number = 0;
        int newnum = 0;
        int[] first = new int[9];
        int[] second = new int[9];
        int[] third = new int[9];
        int[] forth = new int[9];
        massivemaker(first, second, third, forth);
        for (int w = 0; w < 9; w++) {
            for (int i = 0; i < 9; i++) {
                num[i] = -1;
            }
            for (int i = 0; i < 36; i++) {
                newmas[i] = -1;
            }
            for (int k = 0; k < 9; k++) {
                number = newint;
                for (int l = first[w]; l < second[w]; l++) {
                    for (int j = third[w]; j < forth[w]; j++) {
                        if (b[l][j][k]) {
                            newmas[newint] = l;
                            newint++;
                            newmas[newint] = j;
                            newint++;
                        }
                    }
                }
                if ((newint - number) == 4) {
                    num[newnum] = k;
                    newnum++;
                } else {
                    for (int t = number; t < newint; t++) {
                        newmas[t] = -1;
                    }
                    newint = number;
                }
            }
            fidnumbers(num, newmas, b, first, second, third, forth, w);
            newint = 0;
            number = 0;
            newnum = 0;
            for (int i = 0; i < 9; i++){
                num[i] = -1;
            }
            for (int i = 0; i < 36; i++){
                newmas[i] = -1;
            }
        }
    }

    private static void massivemaker(int[] first, int[] second, int[] third, int[] forth) {
        first[0] = 0;
        first[1] = 0;
        first[2] = 0;
        first[3] = 3;
        first[4] = 3;
        first[5] = 3;
        first[6] = 6;
        first[7] = 6;
        first[8] = 6;
        second[0] = 3;
        second[1] = 3;
        second[2] = 3;
        second[3] = 6;
        second[4] = 6;
        second[5] = 6;
        second[6] = 9;
        second[7] = 9;
        second[8] = 9;
        third[0] = 0;
        third[1] = 3;
        third[2] = 6;
        third[3] = 0;
        third[4] = 3;
        third[5] = 6;
        third[6] = 0;
        third[7] = 3;
        third[8] = 6;
        forth[0] = 3;
        forth[1] = 6;
        forth[2] = 9;
        forth[3] = 3;
        forth[4] = 6;
        forth[5] = 9;
        forth[6] = 3;
        forth[7] = 6;
        forth[8] = 9;
    }

    private static void fidnumbers(int[] num, int[] newmas, boolean[][][] b, int[] first, int[] second, int[] third, int[] forth, int w) {
        int flag = 0;
        int first1 = 0;
        int second1 = 0;
        int fircoor1 = 0;
        int seccoor1 = 0;
        int fircoor2 = 0;
        int seccoor2 = 0;
        for (int i = 0; i < 36; i = i + 4) {
            for (int j = 0; j < 36; j = j + 4) {
                if ((i != j) && (newmas[i] != -1) && (newmas[j] != -1) && (newmas[i] == newmas[j]) && (newmas[i + 1] == newmas[j + 1]) && (newmas[i + 2] == newmas[j + 2]) && (newmas[i + 3] == newmas[j + 3])) {
                    first1 = num[i / 4];
                    second1 = num[j / 4];
                    fircoor1 = newmas[i];
                    seccoor1 = newmas[i + 1];
                    fircoor2 = newmas[i + 2];
                    seccoor2 = newmas[i + 3];
                    flag = 1;
                }
            }
        }

        if (flag ==1) {
            if (fircoor1 == fircoor2){
                for (int i = 0; i < 9; i++){
                    if ((i != seccoor1) && (i != seccoor2)){
                        b[fircoor1][i][first1] = false;
                        b[fircoor1][i][second1] = false;
                    }
                }
            }
            if (seccoor1 == seccoor2){
                for (int i = 0; i < 9; i++){
                    if ((i != fircoor1) && (i != fircoor2)){
                        b[i][seccoor1][first1] = false;
                        b[i][seccoor2][second1] = false;
                    }
                }
            }
            for (int i = first[w]; i < second[w]; i++){
                for (int j = third[w]; j < forth[w]; j++){
                    if (((i != fircoor1) || (j != seccoor1)) && ((i != fircoor2) || (j != seccoor2))){
                        b[i][j][first1] = false;
                        b[i][j][second1] = false;
                    }else{
                        for(int z = 0; z < 9; z++){
                            if ((z != first1) && (z != second1)){
                                b[i][j][z] = false;
                            }
                        }
                    }
                }
            }
        }
    }
}
