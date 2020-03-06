package ocr.exercice.cardviewandrecyclerstep2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Activity_findBy_cliking extends AppCompatActivity {
    private ImageView img_sc_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_by_cliking);

        img_sc_activity = findViewById(R.id.imgsecondactivity);

    }
}
