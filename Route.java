package rcew.metroroutes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import static rcew.metroroutes.Main_activity.s1;
import static rcew.metroroutes.Main_activity.s2;

public class Route extends AppCompatActivity {
   ListView l5;
    TextView t,t1,t2,t3,t4,t5;
    int a=0,b=0,j,sum =0,sumk=0,sumj=0;
    static String station[] ={"mansarovar","New aatish market","Vivek vihar","Shyam nagar","Ram nagar","Civil lines",
            "Railway station", "Sindhi Camp","Chandpole"};
    static int dist[]={0,5,8,8,10,4,2,4,5};
    static int fare[]={0,25,40,40,50,20,10,20,25};
    static  int time[]={0,4,5,2,6,8,19,12,8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        t=(TextView)findViewById(R.id.textView3);
        t1=(TextView)findViewById(R.id.textView4);
        t2=(TextView)findViewById(R.id.textView5);
        t3=(TextView)findViewById(R.id.textView6);
        t4=(TextView)findViewById(R.id.textView7);
        t5=(TextView)findViewById(R.id.textView8);

        //Intent obj =getIntent();
       // String r1=obj.getStringExtra("f1");
        //String r2=obj.getStringExtra("f2");

       for(int i=0;i<station.length;i++)
        {
            if(s1.equals(station[i]))
            {
                a=i;
            }
        }
        for(int i=0;i<station.length;i++)
        {
            if(s2.equals(station[i]))
            {
                b=i;
            }
        }
        String[] ss = new String[Math.abs(b-a)+1];
        if(a<b) {
            for (int i = a; i <= b; i++) {

                ss[j]=station[i];
                sum=sum+fare[i];
                sumk=sumk+dist[i];
                sumj=sumj+time[i];
                j++;
            }
        }
        else
        {
            for (int i = a; i >= b; i--) {

                ss[j]=station[i];
                sum=sum+fare[i];
                sumk=sumk+dist[i];
                sumj=sumj+time[i];
                j++;
            }

        }

        String d=String.valueOf(sumk);
        String f=String.valueOf(sum);
        String t = String.valueOf(sumj);

        t3.setText(d);
        t4.setText(f);
        t5.setText(t);

        l5 = (ListView)findViewById(R.id.l6);
        ArrayAdapter<String>obj2;
        obj2 = new ArrayAdapter<String>(Route.this,R.layout.support_simple_spinner_dropdown_item,ss);
        l5.setAdapter(obj2);

    }

}
