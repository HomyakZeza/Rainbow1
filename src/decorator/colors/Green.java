package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Green extends RainbowDecorator {
    public Green(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, Color.GREEN, offset);
    }
}
