package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Yellow extends RainbowDecorator {
    public Yellow(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, Color.YELLOW, offset);
    }
}
