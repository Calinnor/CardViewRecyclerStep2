package ocr.exercice.cardviewandrecyclerstep2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdaptater;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CardViewItem> cardViewList = new ArrayList<>();
        cardViewList.add(new CardViewItem(R.drawable.parix,"Line1","Line2","LX","KI","FR"));
        cardViewList.add(new CardViewItem(R.drawable.ppd,"Line3","Line4","LX","KI","FR"));
        cardViewList.add(new CardViewItem(R.drawable.paris_seconde_photo,"Line5","Line6","LX","KI","FR"));
        cardViewList.add(new CardViewItem(R.drawable.gjh,"Line5","Line6","LX","KI","FR"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdaptater = new CardViewAdapter(cardViewList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdaptater);
    }
}
