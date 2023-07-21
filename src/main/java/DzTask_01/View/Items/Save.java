package DzTask_01.View.Items;

import DzTask_01.View.ConsoleUI;

public class Save extends MainItem {

    public Save(ConsoleUI consoleUI) {
        super(consoleUI, "save file");

    }
    public void execute(){
        consoleUI.save();
    }
}