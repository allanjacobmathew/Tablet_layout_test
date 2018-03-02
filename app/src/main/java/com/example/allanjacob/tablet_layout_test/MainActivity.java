package com.example.allanjacob.tablet_layout_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.allanjacob.tablet_layout_test.databsae.SampleDetails;

public class MainActivity extends AppCompatActivity {
    Button add,view;
    EditText dataid,subdataid;
    private String data;
    private String subdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataid=findViewById(R.id.data_id);
        subdataid=findViewById(R.id.subdata_id);
        add=findViewById(R.id.add_id);
        view=findViewById(R.id.view_id);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=dataid.getText().toString();
                subdata=subdataid.getText().toString();
                dummyInsert();

            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,ItemListActivity.class);
                startActivity(i);
            }
        });


    }

    private void dummyInsert() {
        SampleDetails details = new SampleDetails();

        details.setData(data);
        details.setSubdata(subdata);

        long l = RoomApplication.getInstance().getDb().sampleDao().insertContact(details);


        Toast.makeText(this, "" + l, Toast.LENGTH_SHORT).show();


    }
}
