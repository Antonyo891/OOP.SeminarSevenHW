package Core.Model;

import java.util.ArrayList;

import Mathematics.ComplexNumber;

public class ModelMinus extends MathematicsModel {

    
    public ModelMinus() {
        super();
    }

    @Override
    public void result() {
       super.result=new ComplexNumber(super.reA-super.reB,
         super.imA-super.imB);
    }
    
}
