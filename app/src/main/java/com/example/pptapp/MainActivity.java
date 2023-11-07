package com.example.pptapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecao(String opcao){
        int Numero = new Random(3).nextInt();
        String[] opcoesApp = {"pedra", "papel", "tesoura"};

        String SelecaoApp = opcoesApp[Numero];

        switch (opcoesApp){
            case "pedra":
                break;

            case "papel":
                break;

            case "tesoura":
                break;
        }

        System.out.println(opcao);
    }

    public void pedraOn(View view){
        this.selecao("pedra");
    }

    public void papelOn(View view){
        this.selecao("papel");
    }

    public void tesouraON(View view){
        this.selecao("tesoura");
    }
}