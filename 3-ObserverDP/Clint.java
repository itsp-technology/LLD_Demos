public class Clint {

    public static void main(String[] args) {
            ConcuretWeatherStatiion cws = new ConcuretWeatherStatiion();
            MobileDevice md = new MobileDevice("mobile device");
            MobileDevice md1 = new MobileDevice("Tablet device");
            cws.add(md);
            cws.add(md1);

            cws.updateWeather(25.0f, 60.0f, 1013.0f);
    }
}
