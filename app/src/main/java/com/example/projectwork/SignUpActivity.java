package com.example.projectwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private Button btnSignUp;
    private EditText etUsername, etFullName, etEmail, etPassword, etConfirmPassword;
    private String username, fullname, email, password, confirmPassword;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //variableName = findViewById(id of view.xml file ko)
        btnSignUp = findViewById(R.id.btnSignUp);
        etUsername = findViewById(R.id.etUsername);
        etFullName = findViewById(R.id.etFullName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        tv = findViewById(R.id.tvExistingAccount);
        Database db = new Database(getApplicationContext(),"levelup",null,1);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (signupValidation()) {
                    db.register(username,email,password);
                    Toast.makeText(getApplicationContext(), "Record Inserted", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else {
                    // to write msg after button is clicked
                    Toast.makeText(SignUpActivity.this, "Please enter details correctly", Toast.LENGTH_SHORT).show();
                }
            }
        });
        setAppBar();
    }
    //creating back button in app bar
    private void setAppBar(){
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
    }
    private boolean signupValidation() {
        username = etUsername.getText().toString();
        fullname = etFullName.getText().toString();
        email = etEmail.getText().toString();
        password = etPassword.getText().toString();
        confirmPassword = etConfirmPassword.getText().toString();
        if (username.isEmpty()) {
            etUsername.setError("Username cannot be blank");
            return false;
        }
        if (fullname.isEmpty()) {
            etFullName.setError("FullName cannot be blank");
            return false;
        }
        if (email.isEmpty()) {
            etEmail.setError("Email cannot be blank");
            return false;
        }
        if (password.isEmpty()) {
            etPassword.setError("Password cannot be blank,should be at least 6 characters ");
            return false;
        }
        if (password.compareTo(confirmPassword) == 0) {
            if (isValid(password)){
                return true;
            }else
                Toast.makeText(getApplicationContext(), "Password should be at least 6 characters having letter,digit and special characters", Toast.LENGTH_SHORT).show();
                return false;
        }else{
            Toast.makeText(getApplicationContext(), "Password and Confirm Password did not match", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    @Override
    //when selecting an item if we have to go back back button works using this function
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){   //gives id of menu item and checks if id of backbutton and menuitem is equal
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public static boolean isValid(String passwordhere){
        int f1=0, f2=0, f3=0;
        if (passwordhere.length()<6){
            return false;
        }else{
            for (int p=0; p<passwordhere.length();p++){
                if (Character.isLetter(passwordhere.charAt(p))) {
                    f1 = 1;
                }
            }
            for (int r=0; r<passwordhere.length();r++){
                if (Character.isDigit(passwordhere.charAt(r))) {
                    f2 = 1;
                }
            }
            for (int s=0; s<passwordhere.length();s++){
                char c = passwordhere.charAt(s);
                if (c>=33&&c<=46||c==64) {
                    f3 = 1;
                }
            }
            if (f1==1 && f2==1 && f3==1)
                return true;
            return false;
        }
    }
}