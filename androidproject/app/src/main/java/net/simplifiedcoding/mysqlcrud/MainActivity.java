package net.simplifiedcoding.mysqlcrud;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //mendefinisikan views
    private EditText editusername;
    private EditText editpassword;


    private Button buttonlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing views
        editusername = (EditText) findViewById(R.id.editusername);
        editpassword = (EditText) findViewById(R.id.editpassword);

        buttonlogin = (Button) findViewById(R.id.buttonlogin);


        //Setting listeners to button
        buttonlogin.setOnClickListener(this);

    }


    //Adding an employee
    private void selEmployee(){

        final String username = editusername.getText().toString().trim();
        final String password = editpassword.getText().toString().trim();



        class selEmployee extends AsyncTask<Void,Void,String>{

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this,"Adding...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(Config.KEY_EMP_USERNAME,username);
                params.put(Config.KEY_EMP_PASSWORD,password);


                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(Config.URL_SELECT_EMP, params);
                return res;
            }
        }

        selEmployee ae = new selEmployee();
        ae.execute();
    }

    @Override
    public void onClick(View v) {

        if(v == buttonlogin){
            startActivity(new Intent(this,Default.class));
        }
    }
}
