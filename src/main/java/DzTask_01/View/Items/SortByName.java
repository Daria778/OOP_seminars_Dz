package DzTask_01.View.Items;

import DzTask_01.View.ConsoleUI;

public class SortByName extends MainItem {

    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI, "sort family tree by name");

    }
    public void execute(){
        consoleUI.sortByName();
    }
}
