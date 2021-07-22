package com.example.formula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //record type
        RecordType laptime = new RecordType(1,getResources().getDrawable(R.drawable.timer_24),"Lap time: ","1:18.161");
        RecordType  gap = new RecordType(2,getResources().getDrawable(R.drawable.gap_24),"Gap: ","+ 0.397");
        RecordType laps = new RecordType(3,getResources().getDrawable(R.drawable.car_24),"Laps: ","162");

        //profiles
        ArrayList<Profile> profiles = new ArrayList<>();
        Profile p1 = new Profile();
        p1.setId(1);
        p1.setName("Lewis Hamilton");
        p1.setTeam("Petronas");
        p1.setPhoto(getResources().getDrawable(R.drawable.lewis));
        p1.addRecord(new Record(laptime,"Lap Time: "));
        p1.addRecord(new Record(gap,"Gap: "));
        p1.addRecord(new Record(laps,"Laps: "));
        profiles.add(p1);

        Profile p2 = new Profile();
        p2.setId(2);
        p2.setName("Max Verstappen");
        p2.setTeam("Red Bull");
        p2.setPhoto(getResources().getDrawable(R.drawable.max));
        p2.addRecord(new Record(laptime,"lap Time: "));
        p2.addRecord(new Record(gap,"Gap: "));
        p2.addRecord(new Record(laps,"Laps: "));
        profiles.add(p2);

        Profile p3 = new Profile();
        p3.setId(3);
        p3.setName("Sergio Perez");
        p3.setTeam("Red Bull");
        p3.setPhoto(getResources().getDrawable(R.drawable.checo));
        p3.addRecord(new Record(laptime,"lap Time: "));
        p3.addRecord(new Record(gap,"Gap: "));
        p3.addRecord(new Record(laps,"Laps: "));
        profiles.add(p3);

        Profile p4 = new Profile();
        p4.setId(4);
        p4.setName("Fernando Alonso");
        p4.setTeam("Alpine");
        p4.setPhoto(getResources().getDrawable(R.drawable.alonso));
        p4.addRecord(new Record(laptime,"lap Time: "));
        p4.addRecord(new Record(gap,"Gap: "));
        p4.addRecord(new Record(laps,"Laps: "));
        profiles.add(p4);

        //set adapter
        ExpandableListView lvProfiles = (ExpandableListView)findViewById(R.id.lvProfiles);
        ListAdapter adapter = new ListAdapter(profiles, this);
        lvProfiles.setAdapter(adapter);
    }
}