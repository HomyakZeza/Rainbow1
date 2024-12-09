package decorator;

import java.awt.*;

public class BaseRainbow implements Rainbow {

    @Override
    public void draw(Graphics g, int w, int h) {
        // Базовая реализация: рисует пустое пространство для радуги
        // В данном случае, мы не рисуем ничего, это просто базовый элемент
    }
}
