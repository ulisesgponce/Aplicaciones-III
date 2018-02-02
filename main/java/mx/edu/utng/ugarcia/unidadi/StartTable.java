package mx.edu.utng.ugarcia.unidadi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ulise on 01/02/2018.
 */

public class StartTable extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
    }

    public void nextActivity(View view) {
        startActivity(new Intent(this, StartCalculator.class));

    }
    public void nextActivity1(View view) {
        startActivity(new Intent(this, StartForm.class));

    }


    @Override
    public void onClick(View view) {

    }
}
