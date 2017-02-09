package app.portfolio.alertcreationdemo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        AlertDialog dlg = new AlertDialog.Builder(this).setTitle("Alert Alert Alert:")
                .setMessage(R.string.alert).setPositiveButton("Ok",null)
                .create();
        dlg.show();

    }
}
