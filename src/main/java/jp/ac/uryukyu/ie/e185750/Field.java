package jp.ac.uryukyu.ie.e185750;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Koma> komalist;
    private int ynum = 0;
    private int xnum = 0;

    public Field(int xnum, int ynum) {
        this.xnum = xnum;
        this.ynum = ynum;
    }

    public void prepare() {
        this.komalist = new ArrayList<>();
        for (int y = 0; y < this.ynum; y++) {
            for (int x = 0; x < this.xnum; x++) {
                Koma koma = new Koma(x, y);
                this.komalist.add(koma);
            }
        }
    }

    public Koma getKoma(int y, int x) {
        for (Koma koma : this.komalist) {
            int[] pos = koma.getPosition();
            if (pos[0] == y && pos[1] == x) {
                return koma;
            }
        }
        return null;
    }

    public void putKoma(int x, int y, String state) {
        Koma koma = this.getKoma(x, y);
        koma.setState(state);
    }

    public void feature() {
                String[][] board = new String[ynum][xnum];
                for (Koma koma : this.komalist) {
                    int[] pos = koma.getPosition();
                    String state = koma.getState();
                    board[pos[1]][pos[0]] = state;
                }
                System.out.println("\n\t0\t1\t2\t3\t4\t5\t6\t7\n");
                for (int y = 0; y < board.length; y++) {
                    System.out.print(y + "\t");
                    for (int x=0; x < board[0].length; x++) {
                String b = board[y][x];
                System.out.print(b + "\t");
            }
            System.out.println("\n");
        }
    }

    public boolean judgeButton(int y, int x) {
        boolean flag = false;
        //色々な条件からflagをtrueにするか判断する

        return flag;
    }
/*
    private Counter countStone() {
        Counter counter = new Counter();
        String[][] board = new String[ynum][xnum];

        for (int y = 0; y < ynum; y++) {
            for (int x = 0; x < xnum; x++) {
                if (board[y][x] ==)
                    counter.blackCount++;
                if (board[y][x] ==)
                    counter.whiteCount++;
            }

        }

        return counter;
    }

    private class Counter {
        public int blackCount;
        public int whiteCount;

        public Counter() {
            blackCount = 0;
            whiteCount = 0;
        }
    }
    */
}



