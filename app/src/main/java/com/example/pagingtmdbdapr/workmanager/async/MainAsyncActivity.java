package com.example.pagingtmdbdapr.workmanager.async;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pagingtmdbdapr.R;

public class MainAsyncActivity extends AppCompatActivity {
    String apiUrl = "https://api.themoviedb.org/3/movie/550?api_key=b199eab06bc931ed71cd20c95e4b2bb3";

    String apiUrlC = "http://192.168.1.5:7443/users";
    String apiUrlB = "http://mobileappdatabase.in/demo/smartnews/app_dashboard/jsonUrl/single-article.php?article-id=71";

    String title, image, category;
    TextView titleTextView, categoryTextView;
    ProgressDialog progressDialog;
    Button displayData;
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_a);
        titleTextView = findViewById(R.id.asyncTaskText);
        Thread k = new Thread(new Runnable() {
            @Override
            public void run() {
            //    Atask asyncTask = new Atask();
              //  asyncTask.execute("https://www.tutorialspoint.com/images/tp-logo-diamond.png");
                MyAsyncTasks myAsyncTasks = new MyAsyncTasks();
                myAsyncTasks.execute();
            }
        });
        k.start();

    }


    class Atask extends AsyncTask<String, Void, String> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.i("a", "a");
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            Log.i("a", "a");

        }

        @Override
        protected String doInBackground(String... strings) {
            Log.i("a", "a");

            return null;
            // sending all objects like transactionId etc. of a transaction
            //  to certain other Activity
        }


        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.i("a", "a");

        }
    }

    class MyAsyncTasks extends AsyncTask<String, String, String> {
/*
AsyncTask <TypeOfVarArgParams, ProgressValue, ResultValue>

1. TypeOfVarArgParams: Params is the type of the parameters sent to the task upon execution.
2. ProgressValue: Progress is the type of the progress units published during the background computation.
3. ResultValue: ResultValue is the type of the result of the background computation
 */

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // display a progress dialog for good user experiance
      /*      progressDialog = new ProgressDialog(MainAsyncActivity.this);
            progressDialog.setMessage("Please Wait");
            progressDialog.setCancelable(false);
            progressDialog.show();

       */
        }

        @Override
        protected String doInBackground(String... params) {

            // implement API in background and store the response in current variable
            String current = "";
            try {
                URL url;
                HttpURLConnection urlConnection = null;
                try {
                    url = new URL(apiUrl);

                    urlConnection = (HttpURLConnection) url
                            .openConnection();

                    InputStream in = urlConnection.getInputStream();

                    InputStreamReader isw = new InputStreamReader(in);

                    int data = isw.read();
                    while (data != -1) {
                        current += (char) data;
                        data = isw.read();
                        System.out.print(current);

                    }
                    // return the data to onPostExecute method
                    return current;

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (urlConnection != null) {
                        urlConnection.disconnect();
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
                return "Exception: " + e.getMessage();
            }
            return current;
        }

        @Override
        protected void onPostExecute(String s) {

            Log.d("data", s.toString());
            // dismiss the progress dialog after receiving data from API
        //    progressDialog.dismiss();
            try {
                // JSON Parsing of data
              //  JSONArray jsonArray = new JSONArray(s);
                 JSONObject jsonObject = new JSONObject(s);
                String textTitle = jsonObject.getString("original_title");
                titleTextView.setText(textTitle);


                // lets put the above in an iterator


            //    JSONObject oneObject = jsonObject.getJSONObject("original_title");
                // Pulling items from the array
            /*    title = oneObject.getString("title");
                category = oneObject.getString("category");
                image = oneObject.getString("image");

             */
                // display the data in UI
         //       titleTextView.setText("Title: " + title);
          //      categoryTextView.setText("Category: " + category);
                // Picasso library to display the image from URL
            /*    Picasso.with(getApplicationContext())
                        .load(image)
                        .into(imageView);

             */


            } catch (JSONException e) {
                e.printStackTrace();
            }


        }

    }

}

    // retaining state challenge . hence loader  while configuration change
    // setRetainInstance(true)


