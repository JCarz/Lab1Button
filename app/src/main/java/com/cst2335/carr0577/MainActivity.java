package com.cst2335.carr0577;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import org.jetbrains.annotations.Nullable;

public final class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear); // shows the layout

        Button clickHereButton = findViewById(R.id.button2); // created a variable that holds button
        Switch switchButton = findViewById(R.id.switch1); // created a variable for switch button

        clickHereButton.setOnClickListener((v)->
            Toast.makeText(getApplicationContext(),"Here is more information ",Toast.LENGTH_LONG).show());
            //using lamda expression when button is clicked text will show for long period of time

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton switchButton, boolean isChecked) {

                String onOff = isChecked ? "The switch is now on" :
                "The switch is now off";

                Snackbar snackbar = Snackbar.make(switchButton, onOff,Snackbar.LENGTH_LONG);
                snackbar.setAction("Undo",click -> switchButton.setChecked(!isChecked));
                snackbar.show();
            }
        });

}
}
