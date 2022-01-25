package GameObject;

import java.awt.*;
import java.util.ArrayList;

public class Game {
    private final int ID;
    private boolean ready = false;

    private Point player1Position;
    private ArrayList<Point> players1BulletsPositions;
    private int player1HP;

    private Point player2Position;
    private ArrayList<Point> players2BulletsPositions;
    private int player2HP;

    public Game(int id) {
        ID = id;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}