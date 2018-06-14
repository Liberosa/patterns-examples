package by.volchok.home.delegate;

import by.volchok.home.delegate.figures.Circle;
import by.volchok.home.delegate.figures.Graphics;
import by.volchok.home.delegate.figures.Square;
import by.volchok.home.delegate.figures.Triangle;

/**
 * Делегат - ...
 *
 * здесь: фигруы делегируют вызов метода draw  классу painter
 * */
public class Main {

    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setGraphics(new Triangle());
        painter.draw();
        painter.setGraphics(new Circle());
        painter.draw();
        painter.setGraphics(new Square());
        painter.draw();

        /*
        * Реализация  объекта интерфейсного типа на лету
        * Это будет анонимный класс - 6-тиугольник
        */
        painter.setGraphics(new Graphics() {
            @Override
            public void draw() {
                System.out.println("рисует шестиугольник");
            }
        });
        painter.draw();
    }

}
