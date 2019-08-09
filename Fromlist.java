package rcew.metroroutes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Fromlist extends AppCompatActivity {
     ListView l1;
    static String from;
     String listitem[] = {"mansarovar","New aatish market","Vivek vihar","Shyam nagar","Ram nagar","Civil lines","Railway station",
            "Sindhi Camp","Chandpole"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fromlist);
        l1 = (ListView)findViewById(R.id.list2);

        ArrayAdapter<String>obj2;
        obj2 = new ArrayAdapter<String>(Fromlist.this,R.layout.support_simple_spinner_dropdown_item,listitem);
        l1.setAdapter(obj2);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               from = (String) l1.getItemAtPosition(position);


                Intent obje = new Intent(Fromlist.this,Main_activity.class);

                startActivity(obje);
            }
        });
    }
}
