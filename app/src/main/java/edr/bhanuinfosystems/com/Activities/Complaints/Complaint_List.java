package edr.bhanuinfosystems.com.Activities.Complaints;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;

import edr.bhanuinfosystems.com.Activities.Symptoms.Add_Symptoms;
import edr.bhanuinfosystems.com.R;

public class Complaint_List extends AppCompatActivity {
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint__list);
    }
}

















