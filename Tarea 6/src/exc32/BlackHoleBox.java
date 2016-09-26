package exc32;

import java.util.*;

public class BlackHoleBox extends Box {

    private List<Thing> blackHoleBox;

    public BlackHoleBox() {
        blackHoleBox = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
       blackHoleBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

}