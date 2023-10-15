package Core.Model;

import java.util.ArrayList;

import Mathematics.ComplexNumber;

public class ModelPlus extends MathematicsModel{
    
    public ModelPlus() {
        super();
    }
    @Override
    public void result() {
       super.result=new ComplexNumber(super.reA+super.reB,
         super.imA+super.imB);
    }

   
}
