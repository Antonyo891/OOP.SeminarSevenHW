package Core.Model;

import java.util.ArrayList;

import Mathematics.ComplexNumber;

public class ModelMultiplication extends MathematicsModel  {

    public ModelMultiplication() {
        super();
    }

    @Override
    public void result() {
        float re = super.reA*super.reB-super.imA*super.imB;
        float im = super.reA*super.imB+super.imA*super.reB;
        super.result=new ComplexNumber(re,im);
    }
    
}
