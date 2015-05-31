package github.cesarferreira.colorize.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import github.cesarferreira.colorize.Colorize;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Colorize.HexToColor("#AFC81C");

    }

}
