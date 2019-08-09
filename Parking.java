package rcew.metroroutes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Parking extends AppCompatActivity {
    ListView ll;
    String parkin[] ={"mansarovar","New aatish market","Vivek vihar","Shyam nagar","Ram nagar","Civil lines","Railway station",
            "Sindhi Camp","Chandpole"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        ll = (ListView)findViewById(R.id.list5);

        ArrayAdapter<String> obj2;
        obj2 = new ArrayAdapter<String>(Parking.this,R.layout.support_simple_spinner_dropdown_item,parkin);
        ll.setAdapter(obj2);
        ll.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 1 || position == 3 || position == 5 || position == 7 || position== 9) {
                    String r = (String) ll.getItemAtPosition(position);
                    Toast.makeText(Parking.this, "Item clicked ="+"yes", Toast.LENGTH_LONG).show();
                }

                else{
                    String r = (String) ll.getItemAtPosition(position);
                    Toast.makeText(Parking.this, "Item clicked =" +"No" , Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
