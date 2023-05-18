package sg.edu.rp.c346.id22020995.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSummary;
    TextView tvC203;
    TextView tvC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Module C203 = new Module("C203","Web AppIn Development",2023,1,4,"W65D");
        Module C346 = new Module("C236","Android Programming",2023,1,4,"E63A");

        tvC203 = findViewById(R.id.textViewC203);
        tvC346 = findViewById(R.id.textViewC346);
        tvSummary = findViewById(R.id.textViewSummary);

        int totalCredit = C203.getCredit()+C346.getCredit();
        String summary = String.format("Academic Year: %d \nSemester: %d \nTotal Modular Credits: %d \nModules: ",
                C203.getYear(),C203.getSemester(),totalCredit);
        tvSummary.setText(summary);

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","tvC203 onClick() called");
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module","C203");
                startActivity(intent);
            }
        });
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","tvC346 onClick() called");
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module","C346");
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