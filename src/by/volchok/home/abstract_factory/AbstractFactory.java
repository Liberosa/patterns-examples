package by.volchok.home.abstract_factory;

public class AbstractFactory {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("EN");
        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        Touchpad touchpad = factory.getTouchpad();
        mouse.click();
        keyboard.print();
        touchpad.track(35,60);
        factory = getFactoryByCountryCode("RU");
        mouse = factory.getMouse();
        keyboard = factory.getKeyboard();
        touchpad = factory.getTouchpad();
        mouse.click();
        keyboard.print();
        touchpad.track(35,60);

    }
    private static DeviceFactory getFactoryByCountryCode(String lang){
        switch (lang){
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return  new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported country Code " + lang);
        }
    }
}
