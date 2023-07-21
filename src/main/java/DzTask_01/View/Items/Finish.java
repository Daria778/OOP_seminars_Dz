package DzTask_01.View.Items;

import DzTask_01.View.ConsoleUI;

public class Finish extends MainItem {

    public Finish(ConsoleUI consoleUI) {
        super(consoleUI, "exit");

    }
    public void execute(){
        consoleUI.finish();
    }
}