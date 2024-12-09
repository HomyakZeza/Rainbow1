package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Blue extends RainbowDecorator {
    public Blue(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, Color.BLUE, offset);
    }
}
