package net.simplifiedcoding.mysqlcrud;
import android.app.Activity;
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
/**
 * Created by NAVA-PC on 6/7/2016.
 */
public class Default extends Activity implements View.OnClickListener {

        private Button bEmp;
        private Button bUsers;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.default_view);

            bEmp = (Button) findViewById(R.id.buttonEmp);
            bEmp.setOnClickListener(this);


            bUsers = (Button) findViewById(R.id.buttonUsers);
            bUsers.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.buttonEmp :
                    Intent i = new Intent(this, menu.class);
                    startActivity(i);
                    break;
                case R.id.buttonUsers :
                    Intent i2 = new Intent(this, menu_users.class);
                    startActivity(i2);
                    break;

            }
        }
}