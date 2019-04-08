
package enumcardsdemo;

import java.util.ArrayList;

/**
 *
 * @author Aaron Tran
 */
public class Player {
    private String name;
    public ArrayList<Card> myDeck = new ArrayList<>();
    private int score;
    
    public Player(String name){
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void addPoint() {
        this.score += 1;
    }
    
    
    

}
