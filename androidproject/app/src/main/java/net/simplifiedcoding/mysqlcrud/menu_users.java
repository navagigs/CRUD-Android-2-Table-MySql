package net.simplifiedcoding.mysqlcrud;

/**
 * Created by NAVA-PC on 6/6/2016.
 */
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

public class menu_users extends AppCompatActivity implements View.OnClickListener{

    //Defining views
    private EditText editTextName;
    private EditText editTextUsername;
    private EditText editTextPassword;

    private Button buttonAdd;
    private Button buttonViewUsers;
    private Button buttonlogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_users);

        //Initializing views
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonViewUsers = (Button) findViewById(R.id.buttonViewUsers);
        buttonlogout = (Button) findViewById(R.id.buttonlogout);
        //Setting listeners to button
        buttonAdd.setOnClickListener(this);
        buttonViewUsers.setOnClickListener(this);
        buttonlogout.setOnClickListener(this);
    }


    //Adding an USERS
    private void AddUsers(){

        final String name = editTextName.getText().toString().trim();
        final String username = editTextUsername.getText().toString().trim();
        final String password = editTextPassword.getText().toString().trim();

        class AddUsers extends AsyncTask<Void,Void,String>{

            ProgressDialog loading = ProgressDialog.show(menu_users.this,"Adding...","Wait...",false,false);

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(menu_users.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(Config.KEY_EMP_NAME_USERS,name);
                params.put(Config.KEY_EMP_USERNAME_USERS,username);
                params.put(Config.KEY_EMP_PASSWORD_USERS,password);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(Config.URL_ADD_USERS, params);
                return res;
            }
        }

        AddUsers ae = new AddUsers();
        ae.execute();
    }

    @Override
    public void onClick(View v) {
        if(v == buttonAdd){
            AddUsers();
        }

        if(v == buttonViewUsers){
            startActivity(new Intent(this,ViewAllUsers.class));
        }
        if(v == buttonlogout){
            startActivity(new Intent(this,MainActivity.class));
        }
    }
}
