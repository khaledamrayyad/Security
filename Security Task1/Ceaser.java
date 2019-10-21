package com.example.playfair;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int keey=3;

    public void EncrytCcBtn(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        Editable x = editText.getText();
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setText(EncrytionCc(x));
    }

    public void DecrytCcBtn(View view) {
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        Editable y = editText2.getText();
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText(DecrytionCc(y));
    }

    public void Clear(View view) {
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setText("");
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText("");
    }
    String EncrytionCc(Editable plain){
        String  temp ="";
        for(int i = 0 ; i < plain.length() ; i++){

            if(plain.charAt(i)==' ')
            {
                temp+= ' ';
            }
            else if (plain.charAt(i)+keey >'z')
            {
                temp += ((char)(plain.charAt(i)-(26-keey)));
            }
            else
                temp+=((char)(plain.charAt(i)+keey));
        }
        return temp;

    }
    String DecrytionCc(Editable cipher){
        String  temp ="";
        for(int i = 0;i  < cipher.length(); i++){

            if(cipher.charAt(i)==' ')
            {
                temp+= ' ';
            }
            else if (cipher.charAt(i)- keey <'a')
            {
                temp += ((char)(cipher.charAt(i)-(keey-26)));
            }
            else
                temp+=((char)(cipher.charAt(i)-keey));
        }
        return temp;

    }

}









