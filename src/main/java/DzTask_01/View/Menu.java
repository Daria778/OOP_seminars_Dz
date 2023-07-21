package DzTask_01.View;

import DzTask_01.View.Items.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MainItem> itemList;
    public Menu(ConsoleUI consoleUI) {
        itemList = new ArrayList<>();
        itemList.add(new AddHuman(consoleUI));
        itemList.add(new GetFamilyInfo((consoleUI)));
        itemList.add(new SortByAge(consoleUI));
        itemList.add(new SortByName((consoleUI)));
        itemList.add(new Save(consoleUI));
        itemList.add(new Read(consoleUI));
        itemList.add(new Finish((consoleUI)));
    }
    public String menu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < itemList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(itemList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int option){
        MainItem mainItem = itemList.get(option-1);
        mainItem.execute();
    }
}
