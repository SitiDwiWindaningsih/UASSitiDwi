package activity.project.SitiDwiUASScanQR;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import activity.project.SitiDwiUASScanQR.R;
import id.ac.pelitabangsa.sitidwiuasscanqr.R;

public class LoginActivity extends AppCompatActivity {

    Button login, registrasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, activity.project.SitiDwiUASScanQR.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}