package com.example.imransk.formvalidationpart1;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout inputtextlayoutname, inputtextlayoutpass;
    EditText uname, upassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputtextlayoutname = (TextInputLayout) findViewById(R.id.linearlayoutFullname);
        inputtextlayoutpass = (TextInputLayout) findViewById(R.id.linearlayoutpassword);

        uname = (EditText) findViewById(R.id.username);
        upassword = (EditText) findViewById(R.id.userpassword);
    }


    //After Click Login Button

    public void Login(View view) {

        boolean isvalid = true;

//This Condition is for username EditText Field
        if (uname.getText().toString().isEmpty()) {

            inputtextlayoutname.setError("name is mandatory");
            isvalid = false;

        } else {

            inputtextlayoutname.setErrorEnabled(false);
        }
//This Condition is for username EditText Field
        if (upassword.getText().toString().trim().length()<8){
            inputtextlayoutpass.setError("password must be more than 8 Char");
            isvalid = false;
        }else {
            inputtextlayoutpass.setErrorEnabled(false);
        }
//This Condition is for the currect username nad password text Field

        if (isvalid){
            Toast.makeText(getApplicationContext(),"your validation is ok",Toast.LENGTH_LONG).show();
        }
    }
}
