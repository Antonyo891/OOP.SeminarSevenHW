package Core.Model;

import java.util.ArrayList;

import Mathematics.ComplexNumber;

public interface Model {
    public void SetNumbers(ArrayList<ComplexNumber> number);

    public void result();

    public ComplexNumber GetResult();

}
