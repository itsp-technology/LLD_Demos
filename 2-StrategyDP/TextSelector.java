public class TextSelector {

    TextStretegy textStretegy;

    public TextSelector(TextStretegy ts){
        super();
        this.textStretegy=ts;
    }

    public String textOutput(String text){
       return textStretegy.slelectText(text);
    }
}
