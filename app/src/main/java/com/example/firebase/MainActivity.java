package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth authentication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        authentication = FirebaseAuth.getInstance();

        //Hent input fra textfelt
        //Gem som string
        //Sæt ind i createUserWithEmailAndPassword
        //If der er succes - send brugeren videre vha INtent

        authentication.createUserWithEmailAndPassword("hey@nicklas.com","password123").onSuccessTask(new SuccessContinuation<AuthResult, Object>() {
            @NonNull
            @Override
            public Task<Object> then(AuthResult authResult) throws Exception {
                System.out.println("Task Successful");
                return null;
            }
        });

        if(authentication.getCurrentUser() != null){
            //Gør de brugerrelaterede ting
        }
        else{
            //Send brugeren tilbage til login skærm
        }
    }
}