package mx.edu.utng.ugarcia.unidadi;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ulise on 01/02/2018.
 */

public class FormData extends AppCompatActivity {
    private Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_data);

        TextView helloMessage =  findViewById(R.id.message_hello);
        String data = getIntent().getStringExtra("data");
        helloMessage.setText(data);

        btnExit = findViewById(R.id.exit_app);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }



}
