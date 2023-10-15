package Core;

import java.util.ArrayList;

import Core.View.*;

import Mathematics.ComplexNumber;

public class CreatingComplexNumberP implements CreatingComplexNumber {
    ArrayList<ComplexNumber> numbers;
    View view;
    
    public CreatingComplexNumberP() {
        this.numbers = new ArrayList<>();
        this.view = new ConsoleView();
    }

    @Override
    public void Creating() {
        view.Set("Enter real part: ");
        Integer re = Integer.parseInt(view.Get());
        view.Set("Enter imaginary part: ");
        Integer im = Integer.parseInt(view.Get());
        numbers.add(new ComplexNumber(re, im));
        System.out.println();
    }
    

    public ArrayList<ComplexNumber> getNumbers() {
        return this.numbers;
    }

    public void setNumbers(ArrayList<ComplexNumber> numbers) {
        this.numbers = numbers;
    }

}
