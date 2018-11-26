package sla.org.importingjavafxapps;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Random;

public class Controller {
    private ImageView inputQuizImage;
    private ListView possibleAnswers;
    private ArrayAdapter<String> arrayAdapter;

    private EditText usersAnswer;
    //public Label Score;
    private TextView feedback;
    int[] images;
    String[] answers;
    String correctAnswer;

    Controller(ImageView iv, ListView lv, EditText ua, TextView tv, int[] imgIds) {

        inputQuizImage = iv;
        possibleAnswers = lv;
        arrayAdapter = (ArrayAdapter<String>)possibleAnswers.getAdapter();
        images = imgIds;

        usersAnswer = ua;
        feedback = tv;

        answers = new String[21];
        answers[0] = "bulbasaur";
        answers[1] = "charmander";
        answers[2] = "squirtle";
        answers[3] = "chikorita";
        answers[4] = "cyndaquil";
        answers[5] = "totodile";
        answers[6] = "treecko";
        answers[7] = "torchic";
        answers[8] = "mudkip";
        answers[9] = "turtwig";
        answers[10] = "chimchar";
        answers[11] = "piplup";
        answers[12] = "snivy";
        answers[13] = "tepig";
        answers[14] = "oshawott";
        answers[15] = "chespin";
        answers[16] = "fennekin";
        answers[17] = "froakie";
        answers[18] = "rowlet";
        answers[19] = "popplio";
        answers[20] = "litten";


        Random rand = new Random();
        int imageNum = rand.nextInt(20);

        inputQuizImage.setImageResource(images[imageNum]);

        correctAnswer = answers[imageNum];
        int incorrectNum1 = rand.nextInt(20);
        int incorrectNum2 = rand.nextInt(20);
        String bogusAnswer1 =answers[incorrectNum1];
        String bogusAnswer2 =answers[incorrectNum2];



        // update PossibleAnswers with 1 correct option and 3 incorrect options
        arrayAdapter.add(correctAnswer);
        arrayAdapter.add(bogusAnswer1);
        arrayAdapter.add(bogusAnswer2);

        usersAnswer.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                userAnswered();
                return true;
            }
        });


    }

    public void userAnswered() {
        Editable usersAnswerText = usersAnswer.getText();

        if (usersAnswerText.equals(correctAnswer)) {
            feedback.setText("Correct it was " + correctAnswer);


        } else {

            feedback.setText("Nope it was " + correctAnswer);

        }




        Random rand = new Random();
        int imageNum = rand.nextInt(20);

        inputQuizImage.setImageResource(images[imageNum]);

        correctAnswer = answers[imageNum];
        int incorrectNum1 = rand.nextInt(20);
        int incorrectNum2 = rand.nextInt(20);
        String bogusAnswer1 =answers[incorrectNum1];
        String bogusAnswer2 =answers[incorrectNum2];


        // update PossibleAnswers with 1 correct option and 2 incorrect options
        arrayAdapter.clear();
        arrayAdapter.add(correctAnswer);
        arrayAdapter.add(bogusAnswer1);
        arrayAdapter.add(bogusAnswer2);
    }

    public void userScore() {
        //String score = 0 + ();

    }

    void save() {

    }
}


