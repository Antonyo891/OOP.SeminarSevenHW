package Core.View;
import java.util.Scanner;

public class ConsoleView implements View {
    Scanner console;
    String request;

    @Override
    public String Get() {
        console = new Scanner(System.in);
        System.out.print(request);
        return console.nextLine();

    }

    @Override
    public void Set(String Value) {
        this.request = Value;
    }
    
}
