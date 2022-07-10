package com.example.menuappl;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;
        import android.widget.Toast;
        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                startActivity(new Intent(MainActivity.this, FYBCA_act.class));
                return true;
            case R.id.item2:
                startActivity(new Intent(MainActivity.this, SYBCA_act.class));
                return true;
            case R.id.item3:
                startActivity(new Intent(MainActivity.this, TYBCA_act.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}