package decorator.colors;

import decorator.Rainbow;
import decorator.RainbowDecorator;

import java.awt.*;

public class Violet extends RainbowDecorator {
    public Violet(Rainbow decoratedRainbow, int offset) {
        super(decoratedRainbow, new Color(128, 0, 128), offset); // Фиолетовый цвет с использованием RGB
    }
}
