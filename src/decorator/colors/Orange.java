package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Orange extends RainbowDecorator {
    public Orange(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, Color.ORANGE, offset);
    }
}
