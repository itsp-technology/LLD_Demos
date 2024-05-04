public class UnderLineText implements TextStretegy{
    @Override
    public String slelectText(String text) {
        return "<u>"+text+"</u>";
    }
}
