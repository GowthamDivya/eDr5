package edr.bhanuinfosystems.com.Activities.Make_Prescription;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import edr.bhanuinfosystems.com.Activities.Doctor.Doctor_Home;
import edr.bhanuinfosystems.com.R;
import edr.bhanuinfosystems.com.Singleton.VolleySingleton;
import edr.bhanuinfosystems.com.Storage.SharedPrefManager;
import edr.bhanuinfosystems.com.model.Doctor;
import edr.bhanuinfosystems.com.urls.URLs;

public class Make_Prescription extends AppCompatActivity {

   private String height,weight,temp,bp,sugar;
    public static final String URL_REGISTER="http://192.168.0.10/php/pdf.php";
    Button save;
    Context ctx;
public  static final String DEFAULT="N/A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make__prescription);
        save = (Button)findViewById(R.id.btn_makeprep);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                data();

                senddata();


            }
        });
    }

    private void senddata() {


        StringRequest stringRequest = new StringRequest(Request.Method.POST,URL_REGISTER,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                        try {
                            //converting response to json object
                            JSONObject obj = new JSONObject(response);

                            //if no error in response
                            if (!obj.getBoolean("error")) {

                                Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_SHORT).show();

                                //getting the user from the response
                                JSONObject userJson = obj.getJSONObject("user");

                                //creating a new user object


                                //storing the user in shared preferences
                               // SharedPrefManager.getInstance(getApplicationContext()).userLogin(user);

                                //starting the profile activity
                                finish();
                               // startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                            } else {
                                Toast.makeText(getApplicationContext(), obj.getString("message"), Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("height",height);
                params.put("weight",weight);
                params.put("temp",temp);
                params.put("bp",bp);
                params.put("sugar",sugar);
                return params;
            }
        };

        VolleySingleton.getInstance(this).addToRequestQueue(stringRequest);

    }

    private void data() {
        SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);

        //Physical Examinations

         height = sharedPreferences.getString("height",DEFAULT);
         weight = sharedPreferences.getString("weight",DEFAULT);
         temp = sharedPreferences.getString("temp",DEFAULT);
         bp = sharedPreferences.getString("bp",DEFAULT);
         sugar = sharedPreferences.getString("sugar",DEFAULT);
        Toast.makeText(Make_Prescription.this, height+weight+temp+bp+sugar, Toast.LENGTH_SHORT).show();
    }
}
