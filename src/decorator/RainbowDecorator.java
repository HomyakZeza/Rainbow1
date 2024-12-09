package decorator;

import java.awt.*;

public class RainbowDecorator implements Rainbow {
    protected final Rainbow decoratedRainbow; // Делаем доступным для наследования
    private final Color color;                // Цвет текущей дуги
    private final int offset;                 // Смещение для текущей дуги

    // Единственный конструктор с тремя параметрами
    public RainbowDecorator(Rainbow decoratedRainbow, Color color, int offset) {
        this.decoratedRainbow = decoratedRainbow;
        this.color = color;
        this.offset = offset;
    }

    @Override
    public void draw(Graphics g, int w, int h) {
        // Рисуем предыдущие элементы радуги
        decoratedRainbow.draw(g, w, h);

        // Рисуем текущую дугу
        g.setColor(color);
        g.fillArc(offset, offset, w - 2 * offset, h - 2 * offset, 0, 180);
    }
}
