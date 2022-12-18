package spice.lihachev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ActivityFormula extends AppCompatActivity {
    public Number editDeep, editDiametr;
    public CheckBox Waste;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button button_back1=(Button) findViewById(R.id.button_back1);
        button_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent=new Intent(ActivityFormula.this, ActivityHoll.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });



    }
}