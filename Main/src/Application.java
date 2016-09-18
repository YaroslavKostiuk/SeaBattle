import java.util.Random;

public class Application {

    static int randInt(int min, int max) {

        Random rand = new Random();

        return rand.nextInt((max - min) + 1) + min;
    }

    static void printArray (int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return;
    }

    static void fillArray (int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = randInt(1,10000000);
        }
        return;
    }

    static void sortArray (int[] array) {

        return;
    }

    public static void main(String[] args) {
        Generator.Generator();
//        int ship = randInt(1,5);
//        System.out.println (ship);
//        int shipVector = randInt(0,1);
//        System.out.println ("napravlenie: " + shipVector);
//        int i=10; int j =10;
//        boolean shipPlaced = false;
//        int [][] coord = new int[i][j];
//        if (shipVector==1 ) {
//            j = j - ship;
//        }
//        else
//            i = i - ship;
//        System.out.println ("coord x:" + i + "coord y:" + j);
//        int x,y;
//        x = randInt(0, i);
//        y = randInt(0, j);
//        int shipSize = ship;
//            if (shipVector == 1) {
//                for (int k = y; k < 10; k ++) {
//                    coord[x][k] = 1;
//                    shipSize--;
//                    if (shipSize == 0) break;
//                }
//            }
//            else {
//                for (int k = x; k < 10; k ++) {
//                    coord[k][y] = 1;
//                    shipSize--;
//                    if (shipSize == 0) break;
//                }
//            }
//        boolean ShipCanBePlaced = true;
//        boolean freeCoord = true;
//        while (ShipCanBePlaced) {
//            int ship2 = randInt(1, 4);
//            System.out.println(ship2);
//            shipVector = randInt(0, 1);
//            System.out.println("napravlenie: " + shipVector);
//            i = 10;
//            j = 10;
//            int constant = 10;
//            shipPlaced = false;
//
//            if (shipVector == 1) {
//                j = j - ship2;
//            } else
//                i = i - ship2;
//            System.out.println("coord x:" + i + "coord y:" + j);
//            for (int rand = 0; rand<100; rand++) {
//                x = randInt(0, i-1);
//                y = randInt(0, j-1);
//                System.out.println(x + ' '+ y);
//                if (shipVector == 1) {
//                    if (x+1<10 && y+ship<10) {
//                        for (int testX = x - 1; testX < x + 1; testX++) {
//                            for (int testY = y - 1; testY < y + ship2; testY++) {
//                                if (coord[testX][testY] == 1) freeCoord = false;
//                            }
//                        }
//                    } else if (x<10 && y +ship +1<10){
//                        for (int testX = x - 1; testX <= x; testX++) {
//                            for (int testY = y - 1; testY <= y + ship2 + 1; testY++) {
//                                if (coord[testX][testY] == 1) freeCoord = false;
//                            }
//                        }
//                    } else if (x<10 && y +ship<10){
//                        for (int testX = x - 1; testX <= x; testX++) {
//                            for (int testY = y - 1; testY <= y + ship2; testY++) {
//                                if (coord[testX][testY] == 1) freeCoord = false;
//                            }
//                        }
//                    }
//                } else if (shipVector == 0) {
//                    for (int testX = x - 1; testX < x + ship2 + 1; testX++) {
//                        for (int testY = y - 1; testY < y + 1; testY++) {
//                            if (coord[testX][testY] == 1) freeCoord = false;
//                        }
//                    }
//                }
//                else continue;
//                if (freeCoord == false) break;
//
//            }
//            if (freeCoord == false) continue;
//            shipSize = ship2;
//            if (shipVector == 1) {
//                for (int k = y; k < 10; k++) {
//                    coord[x][k] = 1;
//                    shipSize--;
//                    if (shipSize == 0) {
//                        shipPlaced = true;
//                        break;
//                    }
//                }
//            } else {
//                for (int k = x; k < 10; k++) {
//                    coord[k][y] = 1;
//                    shipSize--;
//                    if (shipSize == 0) {
//                        shipPlaced = true;
//                        break;
//                    }
//                }
//            }
//            if (shipPlaced == true) break;
//        }
//            for (int a = 0; a < 10; a++){
//                for (int b = 0; b < 10; b++){
//                    System.out.print (coord[b][a] != 0 ? 'x' : '=');
//                }
//                System.out.println ();
//            }


    }


}


