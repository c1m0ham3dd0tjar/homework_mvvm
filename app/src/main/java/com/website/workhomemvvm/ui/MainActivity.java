package com.website.workhomemvvm.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.website.workhomemvvm.R;
import com.website.workhomemvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity/* implements View.OnClickListener, NumberMult*/ {
    TextView textView5, textView4, plus_result_textView,mul_result_textView;
    Button plus_button, mul_button;
//    DataBase dataBase;
    Presenter presenter;

    NumberViewModel numberViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);

        plus_result_textView = findViewById(R.id.plus_result_textView);
        mul_result_textView = findViewById(R.id.mul_result_textView);

        plus_button = findViewById(R.id.plus_button);
        mul_button = findViewById(R.id.mul_button);

//        mul_button.setOnClickListener(this);
//        plus_button.setOnClickListener(this);

//      MVC
//        dataBase = new DataBase();
//        plus_button.setOnClickListener(view -> plus_result_textView.setText(firstNumber + secondNumber));

//      MVP
//        presenter = new Presenter(this);



//        MVVM
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        numberViewModel=new ViewModelProvider(this).get(NumberViewModel.class);
        binding.setViewModel(numberViewModel);
        binding.setLifecycleOwner(this);
    }

//      MVP
//    @Override
//    public void multi(int rsltMul) {
//        mul_result_textView.setText(String.valueOf(rsltMul));
//    }




//    @Override
//    public void onClick(View view) {
//        if (view.getId() == R.id.mul_button)
//            presenter.numberMult(presenter.getNumbers().getFirstNum(),presenter.getNumbers().getSecondNum());
//        else if (view.getId()==R.id.plus_button)
//            plus_result_textView.setText(String.valueOf(presenter.getNumbers().getFirstNum() + presenter.getNumbers().getSecondNum()));
//    }
}
