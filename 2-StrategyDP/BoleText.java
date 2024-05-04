public class BoleText implements TextStretegy{
    @Override
    public String slelectText(String text) {
        return "<b>" + text +"</b>";
    }
}
