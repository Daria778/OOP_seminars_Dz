package DzTask_01.Presenter;
import DzTask_01.Model.Human.Gender;
import DzTask_01.Model.Service;
import DzTask_01.View.View;


public class Presenter {
    View view;
    Service service;


    public Presenter(View view) {
        this.view = view;
        this.service = new Service();
    }

    public void sortByAge() {
        service.sortByAge();
    }

    public void sortByName() {
        service.sortByName();
    }

    public void getFamilyInfo() {
        view.print(service.getFamilyInfo());
    }

    public void addHuman(String name, int age, Gender gender) {
       service.addHuman(age, name, gender);
    }

    public void save() {
        service.save();
    }
    public void read(){
       service.read();
    }
}
