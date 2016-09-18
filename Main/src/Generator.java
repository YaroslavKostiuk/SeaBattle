/**
 * Created by mementoMORE on 15.09.2016.
 */
import java.util.Random;

public class Generator {
    static int [][] desk = new int [12][12];
    static int [] ships;


    public static void Generator () {
        ships = new int[]{5, 4, 3, 2, 1};
        int counter = ships.length - 1;
        for (int a = counter; a >= 0; a--) {
            int x, y;
            int shipVector;
            for (int i = ships[a]; i > 0; i--) {
                while (true) {
                    shipVector = Application.randInt(0, 1);
                    if (shipVector == 0) {
                        x = Application.randInt(1, 11 - a);
                        y = Application.randInt(1, 10);
                        if (ProverkaCoordinat(x, y, a+1, shipVector)) {
                            for (int j = 0; j < a+1; j++) {
                                desk[x][y] = 1;
                                System.out.println ("Поместил корабль размером " + a+1 + " в точку " + x + " " + y);
                                x++;
                            }
                            break;
                        }
                    } else {
                        x = Application.randInt(1, 10);
                        y = Application.randInt(1, 11 - a);
                        if (ProverkaCoordinat(x, y, a+1, shipVector)) {
                            for (int j = 0; j < a+1; j++) {
                                desk[x][y] = 1;
                                System.out.println ("Поместил корабль размером " + a+1 + " в точку " + x + " " + y);
                                y++;
                            }
                            break;
                        }
                    }
                }
            }
        }
        for (int a = 1; a < 11; a++) {
            for (int b = 1; b < 11; b++) {
                System.out.print(desk[a][b] != 0 ? "x " : "= ");
            }
            System.out.println();
        }
    }



     public static boolean ProverkaCoordinat (int x, int y, int shipSize, int shipVect) {

         if (shipVect == 0) {
                     for (int i = x - 1; i <= x + shipSize +1 ; i++) {
                         for (int j = y - 1; j <= y + 1; y++) {
                             if (desk[i][j] == 1) {
                                 return false;
                             }

                         }
             }

         } else {
             for (int i = x - 1; i <= x + 1; i++) {
                 for (int j = y - 1; j <= y + shipSize + 1; y++) {
                     if (desk[i][j] == 1) {
                         return false;
                     }

                 }
             }

         }
        return true;
     }
}
