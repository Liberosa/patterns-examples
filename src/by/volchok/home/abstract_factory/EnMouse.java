package by.volchok.home.abstract_factory;

public class EnMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("mouse click");
    }

    @Override
    public void doubleClick() {
        System.out.println("double mouse click");

    }

    @Override
    public void scroll(int direction) {
        if (direction>0){
            System.out.println("scroll up");
        }
        else if (direction<0){
            System.out.println("scroll down");
        }
        else
            System.out.println("no scrolling");

    }
}
