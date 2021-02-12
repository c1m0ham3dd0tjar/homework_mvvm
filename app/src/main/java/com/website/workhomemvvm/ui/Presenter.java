package com.website.workhomemvvm.ui;

import com.website.workhomemvvm.pojo.NumberModel;
import com.website.workhomemvvm.ui.NumberMult;

public class Presenter {

    NumberMult numberMult;
    public NumberModel getNumbers(){
        return new NumberModel(4, 2);
    }

    public Presenter(NumberMult numberMult){
        this.numberMult=numberMult;
    }
    public void numberMult(int n1,int n2){
        numberMult.multi(n1*n2);
    }

}
