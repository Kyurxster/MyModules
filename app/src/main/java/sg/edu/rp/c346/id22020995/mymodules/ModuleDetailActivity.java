package sg.edu.rp.c346.id22020995.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        ArrayList<Module> moduleList = new ArrayList<Module>();
        moduleList.add(new Module("C203","Web AppIn Development",2023,1,4,"W65D"));
        moduleList.add(new Module("C206","Software Development Process",2023,1,4,"W65D"));
        moduleList.add(new Module("C218", "UI/UX Design for Apps", 2023,1,4,"W65D"));
        moduleList.add(new Module("C235", "IT Security and Management",2023,1,4,"W65D"));
        moduleList.add(new Module("C346","Android Programming",2023,1,4,"E63A"));
        moduleList.add(new Module("G953","Life Skills III",2023,1,1,"HBL"));

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String moduleName = intentReceived.getStringExtra("module");
        if (moduleName.equals(moduleList.get(0).getCode())) {
            tvDisplay.setText(moduleList.get(0).display());
        } else if (moduleName.equals(moduleList.get(1).getCode())) {
            tvDisplay.setText(moduleList.get(1).display());
        } else if (moduleName.equals(moduleList.get(2).getCode())) {
            tvDisplay.setText(moduleList.get(2).display());
        } else if (moduleName.equals(moduleList.get(3).getCode())) {
            tvDisplay.setText(moduleList.get(3).display());
        } else if (moduleName.equals(moduleList.get(4).getCode())) {
            tvDisplay.setText(moduleList.get(4).display());
        } else {
            tvDisplay.setText(moduleList.get(05).display());
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