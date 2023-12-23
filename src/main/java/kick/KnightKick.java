package kick;

import java.util.Random;

import lotr.Character;
import lotr.King;

public class KnightKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoIsKicked instanceof King) {
            System.out.println("Your Majesty!");
        }
        else {
            int kick = new Random().nextInt(whoKick.getPower(), whoKick.getPower() + 10);
            whoIsKicked.setHp(whoIsKicked.getHp() - kick);
        }
    }
}
