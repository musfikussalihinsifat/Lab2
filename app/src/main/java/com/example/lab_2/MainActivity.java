package com.example.lab_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;

import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public class Books{
        List<String>getInfo(String group){
            List<String>info= new ArrayList<>();
            if (group.equals("Rabindranath Tagore")) {
                info.add("Recommended Books:");
                info.add("\n'Gitanjali'");
                info.add(" - Author: Rabindranath Tagore");
                info.add("\n'The Home and the World'");
                info.add(" - Author: Rabindranath Tagore");
                info.add("\n'The Gardener'");
                info.add(" - Author: Rabindranath Tagore");
            }

            if (group.equals("Kazi Nazrul Islam")) {
                info.add("Recommended Books:");
                info.add("\n'Bidrohi'");
                info.add(" - Author: Kazi Nazrul Islam");
                info.add("\n'Nazrul Geeti'");
                info.add(" - Author: Kazi Nazrul Islam");
                info.add("\n'Agnibeena'");
                info.add(" - Author: Kazi Nazrul Islam");
            }

            if (group.equals("Sarat Chandra Chattopadhyay")) {
                info.add("Recommended Books:");
                info.add("\n'Devdas'");
                info.add(" - Author: Sarat Chandra Chattopadhyay");
                info.add("\n'Parineeta'");
                info.add(" - Author: Sarat Chandra Chattopadhyay");
                info.add("\n'Pather Dabi'");
                info.add(" - Author: Sarat Chandra Chattopadhyay");
            }

            if (group.equals("Bankim Chandra Chattopadhyay")) {
                info.add("Recommended Books:");
                info.add("\n'Anandamath'");
                info.add(" - Author: Bankim Chandra Chattopadhyay");
                info.add("\n'Durgeshnandini'");
                info.add(" - Author: Bankim Chandra Chattopadhyay");
                info.add("\n'Kapalkundala'");
                info.add(" - Author: Bankim Chandra Chattopadhyay");
            }

            if (group.equals("Jibanananda Das")) {
                info.add("Recommended Books:");
                info.add("\n'Rupasi Bangla'");
                info.add(" - Author: Jibanananda Das");
                info.add("\n'Banalata Sen'");
                info.add(" - Author: Jibanananda Das");
                info.add("\n'Modern Poetry'");
                info.add(" - Author: Jibanananda Das");
            }


            return info;
        }
    }
    private Books expert= new Books();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClickFindInfo(View view){
        TextView info =(TextView)  findViewById(R.id.text);
        TextView info2 =(TextView)  findViewById(R.id.infoss);
        Spinner dis = (Spinner) findViewById(R.id.spinner);
        String type=String.valueOf(dis.getSelectedItem());
        List<String>infoList =expert.getInfo(type);
        StringBuilder infoFormatted = new StringBuilder();
        for(String inf : infoList)
        {
            infoFormatted.append(inf).append('\n');
        }
        info2.setText("Information");
        info.setText(infoFormatted);
    }
}