package sg.edu.rp.c346.id22020995.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC203;
    TextView tvC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC203 = findViewById(R.id.textViewC203);
        tvC346 = findViewById(R.id.textViewC346);

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                String[] module = {"C203","Web AppIn Development","2023","1","4","W65D"};
                intent.putExtra("details",module);
                startActivity(intent);
            }
        });
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                String[] module = {"C236","Android Programming","2023","1","4","E63A"};
                intent.putExtra("details",module);
                startActivity(intent);
            }
        });
    }
}