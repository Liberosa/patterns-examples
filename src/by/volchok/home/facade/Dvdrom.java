package by.volchok.home.facade;

public class Dvdrom {
   private boolean data = false;
   public boolean hasdata(){
       return data;
   }
   void load(){
       System.out.println("Диск загружен");
       data = true;
   }
    void unload(){
        System.out.println("Диск отсутствует");
        data = false;
    }
}
