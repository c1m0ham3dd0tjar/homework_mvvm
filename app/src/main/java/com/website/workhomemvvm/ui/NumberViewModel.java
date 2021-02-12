package com.website.workhomemvvm.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.website.workhomemvvm.pojo.NumberModel;

public class NumberViewModel  extends ViewModel {
    public MutableLiveData<String> divisionNumber=new MutableLiveData<>();

    public NumberModel getNumbers(){
        return new NumberModel(4, 2);
    }

    public void getDivisionResult(){
        String resultDivision=String.valueOf(getNumbers().getFirstNum()/getNumbers().getSecondNum());
        divisionNumber.setValue(resultDivision);
    }
}
