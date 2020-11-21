package lr4.view;

public class Run {

    public static void main(String[] args) {
        ViewFactory viewFactory = new ViewFactory();
        Console console = viewFactory.createConsoleView();

        console.createTypicalUniversity();
    }
}

