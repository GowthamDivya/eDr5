package edr.bhanuinfosystems.com.Activities.Admin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import edr.bhanuinfosystems.com.R;

public class doc_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_details);

        // Recieve data

        int did = getIntent().getExtras().getInt("id");
        String dname  = getIntent().getExtras().getString("anime_name");
        String dgen = getIntent().getExtras().getString("anime_description");
        int dmob = getIntent().getExtras().getInt("anime_studio") ;
        String demail = getIntent().getExtras().getString("anime_category");
        String dcity = getIntent().getExtras().getString("anime_category");
        String dspec = getIntent().getExtras().getString("anime_rating");
        int dexp = getIntent().getExtras().getInt("anime_img");
        int dreg = getIntent().getExtras().getInt("anime_img");

        TextView tdid = findViewById(R.id.doc_did);
        TextView tdname = findViewById(R.id.doc_dname);
        TextView tdgen = findViewById(R.id.doc_dgen) ;
        TextView tdmob = findViewById(R.id.doc_dmob);
        TextView tdemail  = findViewById(R.id.doc_demail) ;
        TextView tdspec  = findViewById(R.id.doc_spec) ;
        TextView tdcity  = findViewById(R.id.doc_city) ;
        TextView tdexp  = findViewById(R.id.doc_dexp) ;
        TextView tdreg  = findViewById(R.id.doc_dreg) ;


        tdid.setText(did);
        tdname.setText(dname);
        tdgen.setText(dgen);
        tdmob.setText(dmob);
        tdemail.setText(demail);
        tdspec.setText(dspec);
        tdcity.setText(dcity);
        tdexp.setText(dexp);
        tdreg.setText(dreg);





    }
}
