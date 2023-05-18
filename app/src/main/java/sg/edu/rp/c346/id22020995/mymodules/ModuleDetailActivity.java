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

        Module C203 = new Module("C203","Web AppIn Development",2023,1,4,"W65D");
        Module C346 = new Module("C236","Android Programming",2023,1,4,"E63A");

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String moduleDetails = intentReceived.getStringExtra("module");
        if (moduleDetails.equals("C203")){
            tvDisplay.setText(C203.display());
        } else {
            tvDisplay.setText(C346.display());
        }

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("ModuleDetailActivity","btnReturn onClick() called");
                Intent intentReturn = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intentReturn);
            }
        });
    }
    @Override
    protected void onStart() {
        Log.d("ModuleDetailActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("ModuleDetailActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("ModuleDetailActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("ModuleDetailActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("ModuleDetailActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("ModuleDetailActivity", "onRestart() called.");
        super.onRestart();
    }
}