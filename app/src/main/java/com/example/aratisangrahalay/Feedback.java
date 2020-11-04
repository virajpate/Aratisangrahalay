package com.example.aratisangrahalay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Feedback extends AppCompatActivity {
    private TextInputLayout email;
    private TextInputLayout name;
    private TextInputLayout message;
    private TextInputEditText fixmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        final String  mainid="virajpate27@gmail.com";
        email=(TextInputLayout)findViewById(R.id.email);
        name=(TextInputLayout)findViewById(R.id.name);
        message=(TextInputLayout)findViewById(R.id.mess);
        fixmail=(TextInputEditText)findViewById(R.id.mainemail);

        //fix emailid code
        fixmail.setText(mainid);

        fixmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().startsWith(mainid))
                {
                    fixmail.setText(mainid);
                    Selection.setSelection(fixmail.getText(),fixmail.getText().length());
                }

            }
        });

    }




    private boolean validatEmail()
    {
        String emailinput=email.getEditText().getText().toString().trim();
        if (emailinput.isEmpty()) {
            email.setError("Field can't be empty");
            return false;
        } else {
            email.setError(null);
            return true;
        }
    }

    private boolean validname()
    {
        String nameinput=name.getEditText().getText().toString().trim();
        if (nameinput.isEmpty()) {
            name.setError("Field can't be empty");
            return false;
        } else {
            name.setError(null);
            return true;
        }

    }

    private boolean validmeassage()
    {
        String messageinpute=message.getEditText().getText().toString().trim();
        if (messageinpute.isEmpty()) {
            message.setError("Field can't be empty");
            return false;
        } else {
            message.setError(null);
            return true;
        }
    }

    public void btnclick(View view) {

        if (!validatEmail() | !validname() | !validmeassage()) {
            return;
        }

        String myemail=email.getEditText().getText().toString();
        String [] emaildevide=myemail.split(",");
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL,emaildevide);
        i.putExtra(Intent.EXTRA_SUBJECT,"Feedback from AratiSangrhalay App");
        i.putExtra(Intent.EXTRA_TEXT,"Name:"+name.getEditText().getText()+"\n Message:"+message.getEditText().getText());
        i.setPackage("com.google.android.gm");

        try{
            startActivity(i);
        }
        catch (android.content.ActivityNotFoundException ex)
        {
            Toast.makeText(Feedback.this,"There are no Email Clients",Toast.LENGTH_SHORT).show();
        }
    }




}

