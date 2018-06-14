package by.volchok.home.abstract_factory;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("печатаем строку");
    }

    @Override
    public void println() {
        System.out.println("печатаем строку с переводом каретки");

    }
}
