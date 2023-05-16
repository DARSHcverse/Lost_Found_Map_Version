/* ----------------Student Details----------------
Name: Darshan Subramaniam; Id: 222550339
CourseName: SIT305
 */
package com.example.lost_found;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button create,show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        create=findViewById(R.id.Create_New_Advert);
        show=findViewById(R.id.Show_all_l_f);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Create_New_Advert.class);
                startActivity(intent);
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sentTOShow=new Intent(MainActivity.this,ShowLostFound.class);
                startActivity(sentTOShow);
            }
        });

    }
}