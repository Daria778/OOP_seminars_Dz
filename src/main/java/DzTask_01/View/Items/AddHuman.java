package DzTask_01.View.Items;

import DzTask_01.View.ConsoleUI;

public class AddHuman extends MainItem {

    public AddHuman(ConsoleUI consoleUI) {
        super(consoleUI, "add human");

    }
    public void execute(){
        consoleUI.addHuman();
    }
}