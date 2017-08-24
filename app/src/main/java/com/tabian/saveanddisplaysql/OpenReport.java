package com.tabian.saveanddisplaysql;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OpenReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openreport);

        Button Report = (Button) findViewById(R.id.btnReport);
        Report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openReport = new Intent(OpenReport.this,TeacherStudent.class);
                startActivity(openReport);
            }
        });


    }
}
