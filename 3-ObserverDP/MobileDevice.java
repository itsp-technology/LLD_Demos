public class MobileDevice implements Observer {


    private  String name;

    public  MobileDevice(String name){
        this.name = name;
    }
    @Override
    public void update(String msg) {
        System.out.println(name +"==="+msg);
    }
}
