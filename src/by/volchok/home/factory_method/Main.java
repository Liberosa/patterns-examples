package by.volchok.home.factory_method;

public class Main {
    public static void main(String[] args) {
       WatchMaker maker = getMakerByName("Digital");
       Watch watch = maker.createWatch();
       watch.showtime();

    }
    public static WatchMaker getMakerByName(String maker){
        if (maker.equals("Digital")) {
            return new DigitalWatchMaker();
        }
        else if (maker.equals("Rome")) {
            return new RomeWatchMaker();
        }
        throw new RuntimeException("Неподдерживаемая модель часов" + maker);
    }
}
