package adapter;

public class XML implements Writer {
    //ta metoda jest adapterem
    public void writeData() {
        JSON json = new JSON();
        json.json();

    }
}
