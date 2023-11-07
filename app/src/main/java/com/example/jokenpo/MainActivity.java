package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecao(String opcao){
        ImageView ImagemResultado = findViewById(R.id.imgAdversario);

        int Numero = new Random().nextInt(3);
        String[] opcoesApp = {"pedra", "papel", "tesoura"};
        String SelecaoApp = opcoesApp[Numero];

        switch (SelecaoApp){
            case "pedra":
                printResultado(SelecaoApp, opcao);
                ImagemResultado.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                printResultado(SelecaoApp, opcao);
                ImagemResultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                printResultado(SelecaoApp, opcao);
                ImagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        System.out.println(SelecaoApp);
    }

    public void printResultado(String selecaoApp, String selecaoUser){
        TextView textoFinal = findViewById(R.id.textoResultado);

        if (selecaoApp == selecaoUser){
            textoFinal.setTextColor(getResources().getColor(R.color.blue));
            textoFinal.setText("EMPATE!");
        } else if (selecaoApp == "pedra") {
            if (selecaoUser == "papel"){
                textoFinal.setTextColor(getResources().getColor(R.color.green));
                textoFinal.setText("VITÓRIA!");
            } else if (selecaoUser == "tesoura") {
                textoFinal.setTextColor(getResources().getColor(R.color.red));
                textoFinal.setText("DERROTA!");
            }
        } else if (selecaoApp == "papel") {
            if (selecaoUser == "tesoura"){
                textoFinal.setTextColor(getResources().getColor(R.color.green));
                textoFinal.setText("VITÓRIA!");
            } else if (selecaoUser == "pedra") {
                textoFinal.setTextColor(getResources().getColor(R.color.red));
                textoFinal.setText("DERROTA!");
            }
        } else if (selecaoApp == "tesoura") {
            if (selecaoUser == "pedra"){
                textoFinal.setTextColor(getResources().getColor(R.color.green));
                textoFinal.setText("VITÓRIA!");
            } else if (selecaoUser == "papel") {
                textoFinal.setTextColor(getResources().getColor(R.color.red));
                textoFinal.setText("DERROTA!");
            }
        }
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