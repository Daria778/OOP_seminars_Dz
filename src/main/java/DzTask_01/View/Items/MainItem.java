package DzTask_01.View.Items;

import DzTask_01.View.ConsoleUI;

public abstract class MainItem {
    ConsoleUI consoleUI;
    private String description;

    public MainItem(ConsoleUI consoleUI, String description) {
        this.consoleUI = consoleUI;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public abstract void execute();
}
