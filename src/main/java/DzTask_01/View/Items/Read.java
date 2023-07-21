package DzTask_01.View.Items;

import DzTask_01.View.ConsoleUI;

public class Read extends MainItem {

    public Read(ConsoleUI consoleUI) {
        super(consoleUI, "read file");

    }
    public void execute(){
        consoleUI.read();
    }
}