package activity.project.SitiDwiUASScanQR;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.pelitabangsa.sitidwiuasscanqr.R;

public class ScanActivity extends AppCompatActivity {

    Button cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        cancel = findViewById(R.id.btncancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity.project.cc.ScanActivity.this, activity.project.SitiDwiUASScanQR.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}