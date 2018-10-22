package minamita.app.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by annisatahira on 13/10/18.
 */

public class DetailActivity extends AppCompatActivity {

    private TextView txtData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtData = (TextView) findViewById(R.id.txt_data);

        String dataku = getIntent().getStringExtra("dataku");
        txtData.setText(dataku);
    }

}
