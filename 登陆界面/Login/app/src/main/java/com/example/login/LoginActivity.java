package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText login_edtId, login_edtPwd;
    private Button login_btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_btnLogin = (Button) findViewById(R.id.login_btnLogin);
        login_edtId = (EditText) findViewById(R.id.login_edtId);
        login_edtPwd = (EditText) findViewById(R.id.login_edtPwd);
        login_btnLogin.setOnClickListener(Listener1);

    }

    private Button.OnClickListener Listener1 = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            String str1 = login_edtId.getText().toString();
            String str2 = login_edtPwd.getText().toString();
            if (str1.equals("123456") && str2.equals("123456")) {
                Toast toast = Toast.makeText(LoginActivity.this, "账号密码正确！",
                        Toast.LENGTH_LONG);
                toast.show();
            } else {
                Toast toast = Toast.makeText(LoginActivity.this, "密码错误，请重新输入。",
                        Toast.LENGTH_LONG);
                toast.show();
                login_edtId.setText("");
                login_edtPwd.setText("");

            }

        }

    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}