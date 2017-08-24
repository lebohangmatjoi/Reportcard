package com.tabian.saveanddisplaysql;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TeacherStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacherstudent);

        Button Teacher = (Button) findViewById(R.id.btnTeacher);
        Teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openReport = new Intent(TeacherStudent.this,MainActivity.class);
                startActivity(openReport);
            }
        });


        Button Student = (Button) findViewById(R.id.btnStudent);
        Student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openReport = new Intent(TeacherStudent.this,StudentView.class);
                startActivity(openReport);
            }
        });
    }
}
