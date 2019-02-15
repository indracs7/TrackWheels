package com.softclique.trackwheels;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.softclique.trackwheels.pojo.User;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextInputEditText name,email;
    private MaterialButton button;
    private SharedPreferences sharedPreferences;
    private String uid;
    private RestApiHandler restApiHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        uid = sharedPreferences.getString("uid",null);
        if(uid != null)
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        setContentView(R.layout.activity_login);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RestApiHandler.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        restApiHandler = retrofit.create(RestApiHandler.class);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button:
                if(TextUtils.isEmpty(name.getText().toString())) {
                    Toast.makeText(this, "Name cannot be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(email.getText().toString())) {

                    Toast.makeText(this, "Email cannot be empty", Toast.LENGTH_SHORT).show();
                    return;
                }

                signinUser(name.getText().toString(),email.getText().toString());

                break;
        }

    }

    private void signinUser(String name,String email) {
        restApiHandler.createUser(new User(name,email)).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.code() == 200)
                {
                    sharedPreferences.edit().putString("uid",response.body().getUid()).commit();
                    Toast.makeText(LoginActivity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                }

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {


            }
        });
    }
}
