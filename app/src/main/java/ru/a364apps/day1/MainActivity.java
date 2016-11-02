package ru.a364apps.day1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;//объявили переменную типа TextView под именем mTextView
    private EditText mEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.textView);//находим наши виджеты
        mEditText = (EditText)findViewById(R.id.editText);


    }

    public void onclk(View view) {
        if (mEditText.getText().length()==0){//проверяем что поле заполнено,если пустое
            mTextView.setText("Введите имя!");//то выводим надпись
        }else{//если есть надпись
            mTextView.setText("");//очищаем поле
            mTextView.setText("Привет " + mEditText.getText() + "!");//вставляем текст "привет" + наше слово + "!"
        }
    }
}
