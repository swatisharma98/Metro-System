package rcew.metroroutes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main_activity extends AppCompatActivity {
     Button b1,b2,b3,b4;
     TextView tv1,tv2;
    static  String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);
        b1= (Button)findViewById(R.id.button2);
        b2 =(Button)findViewById(R.id.button3);
        b3= (Button)findViewById(R.id.button4);
        b4 =(Button)findViewById(R.id.button5);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView)findViewById(R.id.textView1);

        tv1.setText(Fromlist.from);
        tv2.setText(Tolist.to);

        s1= tv1.getText().toString();
        s2= tv2.getText().toString();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(Main_activity.this,Fromlist.class);
                startActivity(obj);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(Main_activity.this,Tolist.class);
                startActivity(obj);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(Main_activity.this,Aboutin.class);
                startActivity(obj);
            }
        });
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent nn = new Intent(Main_activity.this,Route.class);
                        //nn.putExtra("f1",s1);
                        //nn.putExtra("f2",s2);
                        startActivity(nn);
                    }
                }
        );
    }
}
