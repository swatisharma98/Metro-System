package rcew.metroroutes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aboutin extends AppCompatActivity {
   Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutin);
        b1 =(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button6);
        b3=(Button)findViewById(R.id.button7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objec = new Intent(Aboutin.this,Infometro.class);
                startActivity(objec);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obje = new Intent(Aboutin.this,Parking.class);
                startActivity(obje);
            }
        });


    }
}
