package com.example.srima.intentgoogle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search=(Button)findViewById(R.id.button);
        search.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
            Intent chooserIntent = Intent.createChooser(intent, "CHOOSER_TEXT");
            startActivity(chooserIntent);
        }
    });
    }
}
