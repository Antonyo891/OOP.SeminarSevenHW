package Core.Presenter;
import Core.CreatingComplexNumber;
import Core.Model.MathematicsModel;
import Core.Model.Model;

public class Presenter<T extends MathematicsModel, 
                    C extends CreatingComplexNumber> {
    private Model model;
    private C creating;
    private String sign;


    public Presenter(T model, C creating, String sign) {
        this.model = model;
        this.creating = creating;
        this.sign = sign;
    }

    public void buttonClick(){
        System.out.println("Comlex number A: ");
        creating.Creating();
        System.out.println("Comlex number B: ");
        creating.Creating();
        System.out.println("A = " + creating.getNumbers().get(0));
        System.out.println("B = " + creating.getNumbers().get(1));
        model.SetNumbers(creating.getNumbers());
        System.out.print("Result from A " + this.sign + " B = ");
        System.out.println(model.GetResult());


}
}
