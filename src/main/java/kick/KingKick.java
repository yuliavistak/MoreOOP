package kick;
import java.util.Random;

import lotr.Character;

public class KingKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        int kick = new Random().nextInt(whoKick.getPower(), whoKick.getPower() + 10);
        whoIsKicked.setHp(whoIsKicked.getHp() - kick);
    }
}
