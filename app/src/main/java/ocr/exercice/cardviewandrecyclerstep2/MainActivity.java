package ocr.exercice.cardviewandrecyclerstep2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements CardViewAdapter.OnCardviewListerner {

    //private static final String TAG ="" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
//configuration of button to second activity (test)
        Button buttonTestForSecondActivity = findViewById(R.id.button_to_next_activity_for_test);
        buttonTestForSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_findBy_cliking();
            }
        });
//end configuraztion button*/

//configuration toolbar
        this.configureToolbar();


//configuration date
        Date actualDate = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();


//configuration arraylist of cardview item
        ArrayList<CardViewItem> cardViewList = new ArrayList<>();
        cardViewList.add(new CardViewItem(R.drawable.paris_seconde_photo, "Line1", "Ceci est le contenu des news en deux et blablabla", "LX", dateFormat.format(actualDate)));
        cardViewList.add(new CardViewItem(R.drawable.ppd, "Line3", "Oula c'est pour tester les directives tout ca", "LX", dateFormat.format(actualDate)));
        cardViewList.add(new CardViewItem(R.drawable.paris_seconde_photo, "Line5", "Un autre cast pour savoir si ca fonctionne", "LX", dateFormat.format(actualDate)));
        cardViewList.add(new CardViewItem(R.drawable.laaparis, "Line5", "Ici le texte blablabla c'est comme ca pour pouvoir vérifier si il y a une ligne, deux ou beacoup plus. encore une fois :Ici le texte blablabla c'est comme ca pour pouvoir vérifier" +
                "                  si il y a une ligne, deux ou beacoup plus\"", "LX", dateFormat.format(actualDate)));
//end configuration array list

//configuration recyclerview
        RecyclerView mRecyclerView = findViewById(R.id.recyclerViewId);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        RecyclerView.Adapter mAdaptater = new CardViewAdapter(cardViewList,this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdaptater);
//end configuration of recyclerview

    }//end oncreate


/*
//create intent methode for button test + start activity
    public void openActivity_findBy_cliking(){
        Intent intent = new Intent(this, Activity_findBy_cliking.class);
        startActivity(intent);
    }*/

//referencement toolbar + share button config
    private void configureToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

//inflater of button share in toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.share_button) {
            Toast.makeText(this, "Il ne faut pas oublier de mettre le .show apres le lengh toast sinon ca ne marche pas !!!" +
                    " Deux heures de perdues à cause de ça...", Toast.LENGTH_LONG).show();
            return true;
        }
                return super.onOptionsItemSelected(item);
        }//end of configuration toolbar+share button


    @Override
    public void onCardviewClik(int position) {
       //Log.d(TAG, "onCardviewClik: cliked");
        Intent intent = new Intent(this, Activity_findBy_cliking.class);
        startActivity(intent);
    }
}//end main


