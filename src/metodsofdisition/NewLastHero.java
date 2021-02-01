package metodsofdisition;

public class NewLastHero {
    public static void Main(int a[][], boolean b[][][]) {
        int[] num = new int[9];
        int number = 0;
        int help = 0;
        int x = 0;
        for (int l = 0; l < 9; l++) {
            for (int i = 0; i < 9; i++) {
                if (a[i][l] != -1) {
                    num[a[i][l]] = 1;
                }
            }
            for (int j = 0; j < 9; j++) {
                if (num[j] == 0) {
                    for (int k = 0; k < 9; k++) {
                        if (!b[k][l][j]) {
                            number++;
                        } else {
                            help = k;
                            x = j;
                        }
                    }
                }
                if (number == 8) {
                    a[help][l] = x;
                }
                number = 0;
                x = 0;
                help = 0;
            }
            number = 0;
            x = 0;
            help = 0;
            for (int q = 0; q < 9; q++){
                num[q] = 0;
            }
        }
    }
}
