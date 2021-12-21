package YeniProjeSirinler;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Djkstra {
    int ox, oy, dx, dy;
    //ArrayList <Integer> loc = new ArrayList<>();
    public char[][] map = {
        {'0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '1', '0', '0'},
        {'0', '1', '1', '1', '1', '0', '1', '1', '1', '1', '1', '1', '0'},
        {'0', '1', '0', '1', '1', '1', '1', '1', '1', '0', '0', '1', '0'},
        {'0', '1', '1', '1', '1', '0', '1', '0', '1', '1', '0', '1', '0'},
        {'0', '1', '0', '1', '0', '0', '1', '0', '1', '0', '0', '1', '0'},
        {'1', '1', '0', '1', '1', '1', '1', '0', '1', '0', '1', '1', '0'},
        {'0', '1', '0', '0', '1', '1', '1', '0', '1', '1', '1', '1', '0'},
        {'0', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'},
        {'0', '1', '0', '1', '0', '0', '0', '0', '0', '1', '1', '1', '0'},
        {'0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0'},
        {'0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
    };
   

    public char[][] sign = {
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00},
        {0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00}
    };

    public ArrayList<Pair<String, String>> path = new ArrayList<>();

    public ArrayList<Pair<String, String>> dijkstra(char[][] map, char[][] sign, int dx, int dy) {

        ArrayList<ArrayList<Pair<String, String>>> paths = new ArrayList<>();

        char[] currPos;
        String a = String.valueOf(dx); //dusman karakterin X 
        String b= String.valueOf(dy); //dusman karakterin Y 
        
        
        Pair<String, String> currPoint = new Pair<>(a,b);

        ArrayList<Pair<String, String>> currPath = new ArrayList<>();
        
        currPath.add(currPoint);

        paths.add(currPath);

        currPos = doRecursive(paths, map, sign, currPoint, paths.size() - 1, (char) 0x01);

        
        return paths.get((int) currPos[0]);
    }

    public char[] doRecursive(ArrayList<ArrayList<Pair<String, String>>> paths, char[][] map, char[][] sign, Pair<String, String> point, int n, char depth) {
        int x = Integer.parseInt(point.getLeft());
        int y = Integer.parseInt(point.getRight());

        char[] currPos = new char[2];
        currPos[0] = 0x00;
        currPos[1] = 0x00;

        char[] nextPos = new char[2];
        nextPos[0] = 0x00;
        nextPos[1] = 0x00;


        if (x - 1 >= 0 && Integer.parseInt(String.valueOf(map[y][x - 1])) > 0 && (sign[y][x - 1] > depth || sign[y][x - 1] == 0x00)) {
            ArrayList<Pair<String, String>> currPath = (ArrayList<Pair<String, String>>) paths.get(n).clone();

            Pair<String, String> currPoint = new Pair<>(String.valueOf(x - 1), String.valueOf(y));
            currPath.add(currPoint);

            paths.add(currPath);

            sign[y][x - 1] = depth;

            if (Integer.parseInt(String.valueOf(map[y][x - 1])) == 3) {
                if ((currPos[1] != 0 && depth < currPos[1]) || currPos[1] == 0x00) {
                    currPos[0] = (char) (paths.size() - 1);
                    currPos[1] = depth;
                }

            } else {
                nextPos = doRecursive(paths, map, sign, currPoint, paths.size() - 1, (char) (depth + 1));
                if ((nextPos[1] <= currPos[1] && currPos[1] != 0x00 && nextPos[1] != 0x00) || (currPos[1] == 0x00 && nextPos[1] != 0x00)) {
                    currPos[0] = nextPos[0];
                    currPos[1] = nextPos[1];
                }
            }
        }

        // right
        if (x + 1 <= 11 && Integer.parseInt(String.valueOf(map[y][x + 1])) > 0 && (sign[y][x + 1] > depth || sign[y][x + 1] == 0x00)) {
            ArrayList<Pair<String, String>> currPath = (ArrayList<Pair<String, String>>) paths.get(n).clone();

            Pair<String, String> currPoint = new Pair<>(String.valueOf(x + 1), String.valueOf(y));
            currPath.add(currPoint);

            paths.add(currPath);

            sign[y][x + 1] = depth;

            if (Integer.parseInt(String.valueOf(map[y][x + 1])) == 3) {
                if ((currPos[1] != 0 && depth < currPos[1]) || currPos[1] == 0x00) {
                    currPos[0] = (char) (paths.size() - 1);
                    currPos[1] = depth;
                }

            } else {
                nextPos = doRecursive(paths, map, sign, currPoint, paths.size() - 1, (char) (depth + 1));
                if ((nextPos[1] <= currPos[1] && currPos[1] != 0x00 && nextPos[1] != 0x00) || (currPos[1] == 0x00 && nextPos[1] != 0x00)) {
                    currPos[0] = nextPos[0];
                    currPos[1] = nextPos[1];
                }
            }
        }

        // up
        if (y - 1 >= 0 && Integer.parseInt(String.valueOf(map[y - 1][x])) > 0 && (sign[y - 1][x] > depth || sign[y - 1][x] == 0x00)) {
            ArrayList<Pair<String, String>> currPath = (ArrayList<Pair<String, String>>) paths.get(n).clone();

            Pair<String, String> currPoint = new Pair<>(String.valueOf(x), String.valueOf(y - 1));
            currPath.add(currPoint);

            paths.add(currPath);

            sign[y - 1][x] = depth;

            if (Integer.parseInt(String.valueOf(map[y - 1][x])) == 3) {
                if ((currPos[1] != 0 && depth < currPos[1]) || currPos[1] == 0x00) {
                    currPos[0] = (char) (paths.size() - 1);
                    currPos[1] = depth;
                }

            } else {
                nextPos = doRecursive(paths, map, sign, currPoint, paths.size() - 1, (char) (depth + 1));
                if ((nextPos[1] <= currPos[1] && currPos[1] != 0x00 && nextPos[1] != 0x00) || (currPos[1] == 0x00 && nextPos[1] != 0x00)) {
                    currPos[0] = nextPos[0];
                    currPos[1] = nextPos[1];
                }
            }
        }

        // down
        if (y + 1 <= 10 && Integer.parseInt(String.valueOf(map[y + 1][x])) > 0 && (sign[y + 1][x] > depth || sign[y + 1][x] == 0x00)) {
            ArrayList<Pair<String, String>> currPath = (ArrayList<Pair<String, String>>) paths.get(n).clone();

            Pair<String, String> currPoint = new Pair<>(String.valueOf(x), String.valueOf(y + 1));
            currPath.add(currPoint);

            paths.add(currPath);

            sign[y + 1][x] = depth;

            if (Integer.parseInt(String.valueOf(map[y + 1][x])) == 3) {
                if ((currPos[1] != 0 && depth < currPos[1]) || currPos[1] == 0x00) {
                    currPos[0] = (char) (paths.size() - 1);
                    currPos[1] = depth;
                }
            } else {
                nextPos = doRecursive(paths, map, sign, currPoint, paths.size() - 1, (char) (depth + 1));
                if ((nextPos[1] <= currPos[1] && currPos[1] != 0x00 && nextPos[1] != 0x00) || (currPos[1] == 0x00 && nextPos[1] != 0x00)) {
                    currPos[0] = nextPos[0];
                    currPos[1] = nextPos[1];
                }
            }
        }
        
        return currPos;
    }

    /**
     *
     * @param ox
     * @param oy
     * @param dx
     * @param dy
     * @param loc
     * @return
     * @throws FileNotFoundException
     */
    public ArrayList yol (int ox, int oy, int dx, int dy, ArrayList loc) throws FileNotFoundException {
        loc.clear();
        for(int i=0 ; i<1 ; i++){
            map[ox][oy] = '3';
            map[dx][dy] = '2';
        }
        
        ArrayList<Pair<String, String>> currDijkstra;
        currDijkstra = dijkstra(map, sign, dx, dy);
        
        
        
        for (int j = 0; j < currDijkstra.size(); ++j) {

            System.out.print(currDijkstra.get(j).getRight() + ", " + currDijkstra.get(j).getLeft());
            if (j != currDijkstra.size() -1) {
                System.out.print(" --> ");
            } else {
                System.out.println("");
            }
        }
        
        
        
        int stateY = dy;
        int stateX = dx;
  
        for (int j = 0; j < currDijkstra.size(); ++j) {
            if (Integer.parseInt(String.valueOf(currDijkstra.get(j).getRight())) < stateY) {
                System.out.print("^ ");
                stateY = Integer.parseInt(String.valueOf(currDijkstra.get(j).getRight()));
            } else if (Integer.parseInt(String.valueOf(currDijkstra.get(j).getRight())) > stateY) {
                System.out.print("v ");
                stateY = Integer.parseInt(String.valueOf(currDijkstra.get(j).getRight()));
            } else if (Integer.parseInt(String.valueOf(currDijkstra.get(j).getLeft())) < stateX) {
                System.out.print("< ");
                stateX = Integer.parseInt(String.valueOf(currDijkstra.get(j).getLeft()));
            } else if (Integer.parseInt(String.valueOf(currDijkstra.get(j).getLeft())) > stateX) {
                System.out.print("> ");
                stateX = Integer.parseInt(String.valueOf(currDijkstra.get(j).getLeft()));
            }
            if (j == currDijkstra.size() - 1) {
                System.out.println("");
            }
        }
        
//KISAYOLU LOC ARRAYLISTINE AKTARIYORUZ
         for (int j = 0; j < currDijkstra.size(); ++j){
             loc.add(Integer.parseInt(String.valueOf(currDijkstra.get(j).getRight())));
             loc.add(Integer.parseInt(String.valueOf(currDijkstra.get(j).getLeft())));
         }
        return (loc);
        
    }
    public void mapSifirla(){
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 13; j++) {
                if(map[i][j]=='2' || map[i][j]=='3'){
                    map[i][j]='1';
                }
                
            }
            
        }
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 13; j++) {
                if(sign[i][j]!=0x00){
                    sign[i][j]=0x00;
                }
            }
        }
    }
    
    
}
