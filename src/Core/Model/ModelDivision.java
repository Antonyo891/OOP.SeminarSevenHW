package Core.Model;

import java.util.ArrayList;

import Mathematics.ComplexNumber;

public class ModelDivision extends MathematicsModel {

    public ModelDivision() {
        super();
    }

    @Override
    public void result() {
        float re = (super.reA*super.reB+super.imA*super.imB)/
        (super.reB*super.reB+super.imB*super.imB);
        float im = (super.imA*super.reB-super.reA*super.imB)/
        (super.reB*super.reB+super.imB*super.imB);
        super.result=new ComplexNumber(re,im);
    }
    
}
