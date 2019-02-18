package com.bts.lucasoskorep.mywebrequestsapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    
    private static final String TAG = "MainActivity";
    private static final String ENDPOINT_URL = "http://<IP_GOES_HERE>:8080/";
    private static final String GET_ENDPOINT = "<ENDPOINT HERE>";
    private static final String POST_ENDOINT = "<ENDPOINT HERE>";

    private RequestQueue requestQueue;
    private TextView textView;
    private Button getButton;
    private Button postButton;
    private FloatingActionButton fab;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        requestQueue = Volley.newRequestQueue(this);

        //Get the ui elements
        fab = findViewById(R.id.fab);

        //Set up the onClickEvents of the ui elements
//        setFabOnClickListener();
//        setGetButtonOnClickListener();
//        setPostButtonOnClickListener();
    }


//    private void setGetButtonOnClickListener(){
//        getButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Set the text to display ui info
//                textView.setText("Sending Get Request....Awaiting Response");
//                //Send the request
//                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
//                        Request.Method.GET,
//                        ENDPOINT_URL + GET_ENDPOINT,
//                        null,
//                        new Response.Listener<JSONObject>() {
//                            @Override
//                            public void onResponse(JSONObject response) {
//                                Log.i(TAG, response.toString());
//                                textView.setText(response.toString());
//                            }
//                        },
//                        new Response.ErrorListener() {
//                            @Override
//                            public void onErrorResponse(VolleyError error) {
//                                Log.i(TAG, error.getMessage());
//                                textView.setText(error.getMessage());
//                            }
//                        }
//
//                );
//                requestQueue.add(jsonObjectRequest);
//            }
//        });
//    }
//
//    /**
//     * Sets the onclick listener for the postRequest button
//     */
//    private void setPostButtonOnClickListener(){
//        //Create a new jsonObject
//        final JSONObject jsonObject = new JSONObject();
//        try {
//            jsonObject.put("Key", "Value");
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        //Set the button's onclick listener.
//        postButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Update the UI so that you know the request is sending
//                textView.setText("Sending Post Request....Awaiting Response");
//                //Send the request
//                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
//                        Request.Method.POST,
//                        ENDPOINT_URL + POST_ENDOINT,
//                        jsonObject,
//                        new Response.Listener<JSONObject>() {
//                            @Override
//                            public void onResponse(JSONObject response) {
//                                Log.i(TAG, response.toString());
//                                textView.setText(response.toString());
//                            }
//                        },
//                        new Response.ErrorListener() {
//                            @Override
//                            public void onErrorResponse(VolleyError error) {
//                                Log.i(TAG, error.getMessage());
//                                textView.setText(error.getMessage());
//                            }
//                        }
//
//                );
//                requestQueue.add(jsonObjectRequest);
//            }
//        });
//
//
//    }


    private void setFabOnClickListener(){
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
