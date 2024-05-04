public class ItelicText implements  TextStretegy{
    @Override
    public String slelectText(String text) {
        return "<i>" + text + "<i>";
    }
}
