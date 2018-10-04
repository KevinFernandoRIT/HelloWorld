package kkf4497.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class nc80052 extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nc80052);

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                openNc8005();
            }
        });
    }

    public void openNc8005() {

        Intent intent = new Intent(this, nc8005.class);
        startActivity(intent);
    }
}
