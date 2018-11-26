package sla.org.importingjavafxapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class WillQuizRun extends AppCompatActivity {
    Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_will_quiz_run);

        TextView feedback = findViewById(R.id.Feedback);
        ImageView inputQuizImage = findViewById(R.id.Images);
        EditText usersAnswer = findViewById(R.id.UsersAnswer);
        ListView possibleAnswers = findViewById(R.id.PossibleAnswers);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>());
        possibleAnswers.setAdapter(arrayAdapter);

        int[] imageIDs = new int[21];
        imageIDs[0] = R.drawable.bulbasaur;
        imageIDs[1] = R.drawable.charmander;
        imageIDs[2] = R.drawable.squirtle;
        imageIDs[3] = R.drawable.chikorita;
        imageIDs[4] = R.drawable.cyndaquil;
        imageIDs[5] = R.drawable.totodile;
        imageIDs[6] = R.drawable.treecko;
        imageIDs[7] = R.drawable.torchic;
        imageIDs[8] = R.drawable.mudkip;
        imageIDs[9] = R.drawable.turtwig;
        imageIDs[10] = R.drawable.chimchar;
        imageIDs[11] = R.drawable.piplup;
        imageIDs[12] = R.drawable.snivy;
        imageIDs[13] = R.drawable.tepig;
        imageIDs[14] = R.drawable.oshawott;
        imageIDs[15] = R.drawable.chespin;
        imageIDs[16] = R.drawable.fennekin;
        imageIDs[17] = R.drawable.froakie;
        imageIDs[18] = R.drawable.rowlet;
        imageIDs[19] = R.drawable.popplio;
        imageIDs[20] = R.drawable.litten;





        controller = new Controller(inputQuizImage, possibleAnswers, usersAnswer, feedback, imageIDs);

    }



    @Override
    protected void onStop() {
        controller.save();
        super.onStop();
    }
}
