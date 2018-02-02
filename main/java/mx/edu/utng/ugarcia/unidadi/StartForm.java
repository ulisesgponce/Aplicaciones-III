package mx.edu.utng.ugarcia.unidadi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ulise on 01/02/2018.
 */

public class StartForm extends Activity {

    private Button btnShowInfo;

    private EditText edtName;
    private EditText edtAge;
    private EditText edtPho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_form);
        edtName = findViewById(R.id.type_name);
        edtAge = findViewById(R.id.type_age);
        edtPho = findViewById(R.id.type_phone);
        btnShowInfo = findViewById(R.id.submit_info);


        btnShowInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data =  "Your name is " + edtName.getText().toString() + ", your age is : "
                        +edtAge.getText().toString()+", your phone is: "+edtPho.getText().toString();

                Intent intent = new Intent(StartForm.this,FormData.class);
                intent.putExtra( "data", data);
                startActivity(intent);

            }

        });





    }








}
