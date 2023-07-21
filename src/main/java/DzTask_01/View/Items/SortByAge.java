package DzTask_01.View.Items;

import DzTask_01.View.ConsoleUI;

public class SortByAge extends MainItem {

    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI, "sort family tree by age");

    }
    public void execute(){
        consoleUI.sortByAge();
    }
}
