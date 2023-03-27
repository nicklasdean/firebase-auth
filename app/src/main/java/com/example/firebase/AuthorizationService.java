package com.example.firebase;

import com.google.firebase.auth.FirebaseAuth;

public class AuthorizationService {
    private static FirebaseAuth fb = FirebaseAuth.getInstance();



    private FirebaseAuth getFb(){
        return fb;
    }
}
