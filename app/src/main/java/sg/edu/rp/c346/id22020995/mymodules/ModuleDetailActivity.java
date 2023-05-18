package sg.edu.rp.c346.id22020995.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String[] moduleDetails = intentReceived.getStringArrayExtra("details");
        String display = String.format("Module Code: %s \nModule Name: %s \nAcademic Year: %s \nSemester: %s \nModule Credit: %s \nVenue: %s",
                moduleDetails[0],moduleDetails[1],moduleDetails[2],moduleDetails[3],moduleDetails[4],moduleDetails[5]);
        tvDisplay.setText(display);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReturn = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intentReturn);
            }
        });
    }
}