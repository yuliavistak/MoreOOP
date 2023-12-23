package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        int i = 0;
        while(c1.isAlive() && c2.isAlive()) {
            if(i%2 == 1) c1.kick(c2);
            else c2.kick(c1);
        }
    }
}
