package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Red extends RainbowDecorator {
    public Red(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, Color.RED, offset);
    }
}
