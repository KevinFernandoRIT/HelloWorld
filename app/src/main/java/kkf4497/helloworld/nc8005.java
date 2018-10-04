package kkf4497.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class nc8005 extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nc8005);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                openNc80052();
            }


        });
    }

    public void openNc80052() {

        Intent intent = new Intent(this, nc80052.class);
        startActivity(intent);
    }
}
