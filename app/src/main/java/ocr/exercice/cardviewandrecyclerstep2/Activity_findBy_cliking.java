package ocr.exercice.cardviewandrecyclerstep2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_findBy_cliking extends AppCompatActivity {

    //creation var de classe miroir a xml
    ConstraintLayout mConstraintLayoutAc2;
    ImageView mImageViewAc2;
    TextView mTextViewAc2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_by_cliking);


        //referencement des val xml dans les var de classe
        mConstraintLayoutAc2 = findViewById(R.id.constraint_layout_second_activity);
        mImageViewAc2 = findViewById (R.id.imgsecondactivity);
        mTextViewAc2 = findViewById (R.id.text_second_activity);

    }
}
