package sg.edu.rp.c346.id20019648.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvCode, tvName, tvSem, tvYr, tvMC, tvVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvCode = findViewById(R.id.tvCode);
        tvName = findViewById(R.id.tvName);
        tvSem = findViewById(R.id.tvSem);
        tvYr = findViewById(R.id.tvYr);
        tvMC = findViewById(R.id.tvMC);
        tvVenue = findViewById(R.id.tvVenue);
        btnBack = findViewById(R.id.btnBack);

        Intent intentReceived = getIntent();
        String module = intentReceived.getStringExtra("C346");

        tvCode.setText("Module code: C346");
        tvName.setText("Module Name: Android Programming");
        tvYr.setText("Academic Year: 2020");
        tvSem.setText("1");
        tvMC.setText("Module Credit: 4");
        tvVenue.setText("W66M");

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ModuleDetailActivity.this, MainActivity.class);
                i.putExtra("C346", "Android Programming");
                startActivity(i);
            }
        });

    }
}