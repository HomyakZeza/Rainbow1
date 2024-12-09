package panel;

import decorator.Rainbow;
import decorator.BaseRainbow;
import decorator.colors.Red;
import decorator.colors.Orange;
import decorator.colors.Yellow;
import decorator.colors.Green;
import decorator.colors.Blue;
import decorator.colors.Violet;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private final Rainbow rainbow;

    public MyPanel() {
        // Создаем радугу с использованием декораторов (красный, оранжевый, желтый, зеленый, голубой, синий, фиолетовый)
        rainbow = new Violet(
                new Blue(
                        new Green(
                                new Yellow(
                                        new Orange(
                                                new Red(
                                                        new BaseRainbow(),
                                                        10 // Смещение для красного
                                                ),
                                                20 // Смещение для оранжевого
                                        ),
                                        30 // Смещение для желтого
                                ),
                                40 // Смещение для зеленого
                        ),
                        50 // Смещение для голубого
                ),
                60 // Смещение для синего
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        rainbow.draw(g, w, h); // Рисуем радугу
    }
}
