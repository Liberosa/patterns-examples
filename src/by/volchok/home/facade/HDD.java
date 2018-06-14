package by.volchok.home.facade;

public class HDD {
    void copyFromDvd(Dvdrom dvdrom){
        if (dvdrom.hasdata()){
            System.out.println("Происходит копирование с диска");
        }
        else{
            System.out.println("Вставьте Диск");
        }
    }
}
