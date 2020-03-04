package ocr.exercice.cardviewandrecyclerstep2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdaptater;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Date actualDate = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();

        ArrayList<CardViewItem> cardViewList = new ArrayList<>();
        cardViewList.add(new CardViewItem(R.drawable.paris_seconde_photo,"Line1","Ceci est le contenu des news en deux et blablabla","LX",dateFormat.format(actualDate)));
        cardViewList.add(new CardViewItem(R.drawable.ppd,"Line3","Oula c'est pour tester les directives tout ca","LX",dateFormat.format(actualDate)));
        cardViewList.add(new CardViewItem(R.drawable.paris_seconde_photo,"Line5","Un autre cast pour savoir si ca fonctionne","LX",dateFormat.format(actualDate)));
        cardViewList.add(new CardViewItem(R.drawable.laaparis,"Line5","Ici le texte blablabla c'est comme ca pour pouvoir vérifier si il y a une ligne, deux ou beacoup plus. encore une fois :Ici le texte blablabla c'est comme ca pour pouvoir vérifier" +
                "                  si il y a une ligne, deux ou beacoup plus\"","LX",dateFormat.format(actualDate)));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdaptater = new CardViewAdapter(cardViewList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdaptater); 
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.snap){
            Toast.makeText(getApplicationContext(),"Pourquoi ca ne marche pas ???",Toast.LENGTH_SHORT);}
        else if(id == R.id.blob){
            Toast.makeText(getApplicationContext(),"Blob...lui il fonctionne. Mais euh.",Toast.LENGTH_SHORT);
        }
        return true;
    }
}
