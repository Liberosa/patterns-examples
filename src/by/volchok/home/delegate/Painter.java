package by.volchok.home.delegate;

import by.volchok.home.delegate.figures.Graphics;

public class Painter {
    Graphics graphics;

    public void setGraphics(Graphics gr){
        graphics = gr;


    }
    public void draw(){
        graphics.draw();
    }
}
