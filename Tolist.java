package rcew.metroroutes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Tolist extends AppCompatActivity {
    ListView l2;
    static String to;
    String listitem[] = {"mansarovar","New aatish market","Vivek vihar","Shyam nagar","Ram nagar","Civil lines","Railway station",
            "Sindhi Camp","Chandpole"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tolist);
        l2 = (ListView)findViewById(R.id.list4);

        ArrayAdapter<String> obj3;
        obj3 = new ArrayAdapter<String>(Tolist.this,R.layout.support_simple_spinner_dropdown_item,listitem);
        l2.setAdapter(obj3);
        l2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                to = (String) l2.getItemAtPosition(position);
                Intent obje = new Intent(Tolist.this,Main_activity.class);

                startActivity(obje);
            }
        });
    }
}
