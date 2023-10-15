import Core.CreatingComplexNumber;
import Core.CreatingComplexNumberP;
import Core.Model.MathematicsModel;
import Core.Model.ModelDivision;
import Core.Model.ModelMinus;
import Core.Model.ModelMultiplication;
import Core.Model.ModelPlus;
import Core.Presenter.Presenter;
import Core.View.ConsoleView;
import Core.View.View;

public class App {
    public static void main(String[] args) throws Exception {
        View view = new ConsoleView();
        System.out.println("Complex number calculator");
        MathematicsModel model = new ModelPlus();
        CreatingComplexNumber creatingComplexNumber = new CreatingComplexNumberP();
        view.Set("Select operation" + "\n"
        + "1. +" + "\n" + "2. -"+ "\n" + "3. *" + "\n" + "4. / \n");
        String sign = "", choise = view.Get();
        switch (choise) {
            case "1":
                model = new ModelPlus();
                sign = "+";
                break;
            case "2":
                model = new ModelMinus();
                sign = "-";
                break;
            case "3":
                model = new ModelMultiplication();
                sign = "*";
                break;
            case "4":
                model = new ModelDivision();
                sign = "/";
                break;
            default:
                break;
        }
        Presenter presenter = new Presenter<>(model, creatingComplexNumber, sign);
        presenter.buttonClick();
        System.out.println("GoodBye");

    }
}
