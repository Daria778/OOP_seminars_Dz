package DzTask_01;


import DzTask_01.View.ConsoleUI;
import DzTask_01.View.View;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        View view = new ConsoleUI();
        view.start();
    }
}
