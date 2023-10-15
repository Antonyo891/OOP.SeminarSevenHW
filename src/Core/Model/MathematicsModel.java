package Core.Model;

import java.util.ArrayList;

import Mathematics.ComplexNumber;

public abstract class MathematicsModel implements Model {
    ArrayList<ComplexNumber> numbers;
    float reA, reB, imA, imB;
    ComplexNumber result;

   public MathematicsModel() {
        numbers = new ArrayList<>();
        }

    public void SetNumbers(ArrayList<ComplexNumber> numbers){
        this.numbers = numbers;
        this.reA = numbers.get(0).getRealPart();
        this.imA = numbers.get(0).getImaginaryPart();
        this.reB = numbers.get(1).getRealPart();
        this.imB = numbers.get(1).getImaginaryPart();
    }
    
     @Override
    public abstract void result();

    public ComplexNumber GetResult(){
        result();
        return this.result;
    }
    
}
