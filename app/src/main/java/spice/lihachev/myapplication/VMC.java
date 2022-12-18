package spice.lihachev.myapplication;

import static spice.lihachev.myapplication.R.id.buttonHoll;
import static spice.lihachev.myapplication.R.id.button_back;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class VMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vmc);
        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button button_back1=(Button) findViewById(R.id.button_back);
        button_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent =new Intent(VMC.this,Menu.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });
        TextView buttonHoll=(TextView) findViewById(R.id.buttonHoll);
        buttonHoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent=new Intent(VMC.this,ActivityFormula.class);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });



    }
}