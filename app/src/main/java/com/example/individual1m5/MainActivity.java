package com.example.individual1m5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewFragment;

import com.example.individual1m5.databinding.ActivityMainBinding;
import com.example.individual1m5.databinding.FragmentWebBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //enviar("http://",binding.textField.getEditText().getText().toString());
                String url= binding.textField.getEditText().getText().toString();
                WebView webView= (WebView)getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView3).getView().findViewById(R.id.wv1);
                webView.loadUrl(url);

            }
        });

    }

       /* protected void enviar(String http, String web){
            Intent intento = new Intent(MainActivity.this, Web.class);
            intento.putExtra("http", http);
            intento.putExtra("web", web);
            startActivity(intento);

        }*/
    }


