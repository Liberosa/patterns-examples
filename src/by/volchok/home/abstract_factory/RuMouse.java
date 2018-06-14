package by.volchok.home.abstract_factory;

public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("щелчок мышью");
    }

    @Override
    public void doubleClick() {
        System.out.println("двойной щелчок мышью");

    }

    @Override
    public void scroll(int direction) {
        if (direction>0){
            System.out.println("скроллим верх");
        }
        else if (direction<0){
            System.out.println("скроллим вниз");
        }
        else
            System.out.println("не скроллим");

    }
}
