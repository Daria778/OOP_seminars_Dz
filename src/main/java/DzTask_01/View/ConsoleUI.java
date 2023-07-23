package DzTask_01.View;
import DzTask_01.Model.Human.Gender;
import DzTask_01.Presenter.Presenter;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private Menu mainMenu;

    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        mainMenu = new Menu(this);
    }

    @Override
    public void start() {
        System.out.println("Hello, what can i help you?");
        while(work){
            System.out.println(mainMenu.menu());
            String option = scanner.nextLine();
            int numOp = Integer.parseInt(option);
            mainMenu.execute(numOp);
        }

    }
    public void finish() {
        System.out.println("GoodBye!");
        work = false;
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getFamilyInfo() {
        presenter.getFamilyInfo();
    }

    public void addHuman() {
        System.out.println("Enter the human's name:");
        String name = scanner.nextLine();
        System.out.println("Enter the human's age:");
        String ages = scanner.nextLine();
        if (isDigit(ages)) {
            int age = Integer.parseInt(ages);
            if (age > 0){
                System.out.println("Choose the gender: ");
                System.out.println("1 - male\n" +
                        "2 - female");
                String gender = scanner.nextLine();
                if (isDigit(gender)){
                    int gen = Integer.parseInt(gender);
                    if(gen == 1){
                        Gender gender1 = Gender.male;
                        presenter.addHuman(name, age, gender1);
                    } else if (gen == 2) {
                        Gender gender1 = Gender.female;
                        presenter.addHuman(name, age, gender1);
                    }
                    else {
                        System.out.println("- _ - ");
            }
        }

            }
            else {
                System.out.println(". _ .");
            }
        }
        else {
            System.out.println("0 _0");
        }

    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }


    public boolean isDigit(String text){
        try {Integer.parseInt(text);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }

    }

    public void save() {
        presenter.save();
    }
    public void read(){
        presenter.read();
    }
}
