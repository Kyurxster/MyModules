package sg.edu.rp.c346.id22020995.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDisplay = findViewById(R.id.textViewDisplay);
        Intent intentReceived = getIntent();
        String[] moduleDetails = intentReceived.getStringArrayExtra("details");
        String display = String.format("Module Code: %s \nModule Name: %s \nAcademic Year: %s \nSemester: %s \nModule Credit: %s \nVenue: %s",
                moduleDetails[0],moduleDetails[1],moduleDetails[2],moduleDetails[3],moduleDetails[4],moduleDetails[5]);
        tvDisplay.setText(display);
    }
}