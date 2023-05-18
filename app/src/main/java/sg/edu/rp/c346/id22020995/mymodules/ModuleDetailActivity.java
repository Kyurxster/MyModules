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
        Module C206 = new Module("C206","Software Development Process",2023,1,4,"W65D");
        Module C218 = new Module("C218", "UI/UX Design for Apps", 2023,1,4,"W65D");
        Module C235 = new Module("C235", "IT Security and Management",2023,1,4,"W65D");
        Module C346 = new Module("C346","Android Programming",2023,1,4,"E63A");
        Module G953 = new Module("G953","Life Skills III",2023,1,1,"HBL");

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String moduleName = intentReceived.getStringExtra("module");
        if (moduleName.equals("C203")) {
            tvDisplay.setText(C203.display());
        } else if (moduleName.equals("C206")) {
            tvDisplay.setText(C206.display());
        } else if (moduleName.equals("C218")) {
            tvDisplay.setText(C218.display());
        } else if (moduleName.equals("C235")) {
            tvDisplay.setText(C235.display());
        } else if (moduleName.equals("C346")) {
            tvDisplay.setText(C346.display());
        } else {
            tvDisplay.setText(G953.display());
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