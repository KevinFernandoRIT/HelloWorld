package kkf4497.helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kkf4497_secondary extends AppCompatActivity {

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kkf4497_secondary);

        button2 = findViewById(R.id.button);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                openActivity1();

            }
        });

    }

    public void openActivity1() {

        Intent intent = new Intent(this, kkf4497_primary.class);
        startActivity(intent);
    }

}
