package by.volchok.home.facade;

public class Computer {

    private Power power = new Power();
    private Dvdrom dvdrom = new Dvdrom();
    private HDD hdd = new HDD();

    void copy() {
        power.on();
        dvdrom.load();
        hdd.copyFromDvd(dvdrom);
        dvdrom.unload();
        power.of();
    }

}
