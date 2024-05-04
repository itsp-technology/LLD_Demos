public class ClientText {

    public static void main(String[] args) {
        TextSelector ts = new TextSelector(new BoleText());

        System.out.println( ts.textOutput("vivek"));

        TextSelector ts2 = new TextSelector(new ItelicText());

        System.out.println( ts2.textOutput("Ral"));
    }
}
