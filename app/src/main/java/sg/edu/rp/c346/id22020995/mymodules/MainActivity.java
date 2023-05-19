package sg.edu.rp.c346.id22020995.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvSummary;
    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;
    TextView tvG953;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Module> moduleList = new ArrayList<Module>();
        moduleList.add(new Module("C203","Web AppIn Development",2023,1,4,"W65D"));
        moduleList.add(new Module("C206","Software Development Process",2023,1,4,"W65D"));
        moduleList.add( new Module("C218", "UI/UX Design for Apps", 2023,1,4,"W65D"));
        moduleList.add(new Module("C235", "IT Security and Management",2023,1,4,"W65D"));
        moduleList.add(new Module("C346","Android Programming",2023,1,4,"E63A"));
        moduleList.add(new Module("G953","Life Skills III",2023,1,1,"HBL"));

        tvSummary = findViewById(R.id.textViewSummary);
        tvC203 = findViewById(R.id.textViewC203);
        tvC206 = findViewById(R.id.textViewC206);
        tvC218 = findViewById(R.id.textViewC218);
        tvC235 = findViewById(R.id.textViewC235);
        tvC346 = findViewById(R.id.textViewC346);
        tvG953 = findViewById(R.id.textViewG953);


        int totalCredit = 0;
        for (int i = 0;i < moduleList.size();i++){
            totalCredit = totalCredit+moduleList.get(i).getCredit();
        }
        String summary = String.format("Academic Year: %d \nSemester: %d \nTotal Modular Credits: %d \nModules: ",
                moduleList.get(0).getYear(),moduleList.get(0).getSemester(),totalCredit);
        tvSummary.setText(summary);

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","tvC203 onClick() called");
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module",moduleList.get(0).getCode());
                startActivity(intent);
            }
        });
        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","tvC206 onClick() called");
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module",moduleList.get(1).getCode());
                startActivity(intent);
            }
        });
        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","tvC218 onClick() called");
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module",moduleList.get(2).getCode());
                startActivity(intent);
            }
        });
        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","tvC235 onClick() called");
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module",moduleList.get(3).getCode());
                startActivity(intent);
            }
        });
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","tvC346 onClick() called");
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module",moduleList.get(4).getCode());
                startActivity(intent);
            }
        });
        tvG953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","tvG953 onClick() called");
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module",moduleList.get(5).getCode());
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }
}