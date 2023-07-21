package DzTask_01.View.Items;

import DzTask_01.View.ConsoleUI;

public class GetFamilyInfo extends MainItem {

    public GetFamilyInfo(ConsoleUI consoleUI) {
        super(consoleUI, "show family tree");

    }
    public void execute(){
        consoleUI.getFamilyInfo();
    }
}
