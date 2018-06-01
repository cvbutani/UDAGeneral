package com.example.chirag.udageneralknowledge;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private RadioButton questionOneAnswerOne;
    private RadioButton questionOneAnswerTwo;
    private RadioButton questionOneAnswerThree;

    private RadioButton questionTwoAnswerOne;
    private RadioButton questionTwoAnswerTwo;
    private RadioButton questionTwoAnswerThree;

    private RadioButton questionThreeAnswerOne;
    private RadioButton questionThreeAnswerTwo;
    private RadioButton questionThreeAnswerThree;

    private RadioButton questionFourAnswerOne;
    private RadioButton questionFourAnswerTwo;
    private RadioButton questionFourAnswerThree;

    private RadioButton questionFiveAnswerOne;
    private RadioButton questionFiveAnswerTwo;
    private RadioButton questionFiveAnswerThree;

    private RadioButton questionSixAnswerOne;
    private RadioButton questionSixAnswerTwo;
    private RadioButton questionSixAnswerThree;

    private RadioButton questionSevenAnswerOne;
    private RadioButton questionSevenAnswerTwo;
    private RadioButton questionSevenAnswerThree;

    private RadioButton questionEightAnswerOne;
    private RadioButton questionEightAnswerTwo;
    private RadioButton questionEightAnswerThree;

    private RadioButton questionNineAnswerOne;
    private RadioButton questionNineAnswerTwo;
    private RadioButton questionNineAnswerThree;

    private RadioButton questionTenAnswerOne;
    private RadioButton questionTenAnswerTwo;
    private RadioButton questionTenAnswerThree;

    private EditText firstName;

    private TextView textView;

    private int correctAns = 0;

    String displayMessage;

    private EditText emailId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViewById();
        quesAnsCheck();
    }

    /**
     * This method will display correct answers given by user when Submit
     * button is pressed.
     *
     * @param view
     */

    public void submitOrder(View view) {
        quesAnsCheck();
        displayMessage = firstName.getText() + " scored " + correctAns + " out of 10";
        textView.setText(displayMessage);
    }

    /**
     * This method will send an email to the user whose email id is displayed in the EditBox.
     */

    public void emailOrder(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + emailId.getText().toString())); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Your Score " + firstName.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, displayMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * This method resets everything in app when Reset button is pressed.
     */

    public void resetOrder(View view) {
        questionOneAnswerOne.setChecked(false);
        questionOneAnswerTwo.setChecked(false);
        questionOneAnswerThree.setChecked(false);

        questionTwoAnswerOne.setChecked(false);
        questionTwoAnswerTwo.setChecked(false);
        questionTwoAnswerThree.setChecked(false);

        questionThreeAnswerOne.setChecked(false);
        questionThreeAnswerTwo.setChecked(false);
        questionThreeAnswerThree.setChecked(false);

        questionFourAnswerOne.setChecked(false);
        questionFourAnswerTwo.setChecked(false);
        questionFourAnswerThree.setChecked(false);

        questionFiveAnswerOne.setChecked(false);
        questionFiveAnswerTwo.setChecked(false);
        questionFiveAnswerThree.setChecked(false);

        questionSixAnswerOne.setChecked(false);
        questionSixAnswerTwo.setChecked(false);
        questionSixAnswerThree.setChecked(false);

        questionSevenAnswerOne.setChecked(false);
        questionSevenAnswerTwo.setChecked(false);
        questionSevenAnswerThree.setChecked(false);

        questionEightAnswerOne.setChecked(false);
        questionEightAnswerTwo.setChecked(false);
        questionEightAnswerThree.setChecked(false);

        questionNineAnswerOne.setChecked(false);
        questionNineAnswerTwo.setChecked(false);
        questionNineAnswerThree.setChecked(false);

        questionTenAnswerOne.setChecked(false);
        questionTenAnswerTwo.setChecked(false);
        questionTenAnswerThree.setChecked(false);
        correctAns = 0;
        firstName.setText("");
        textView.setText("");
        emailId.setText("");
    }

    /**
     * This method checks if user selected correct answer.
     * If, so then correctAns will be incremented by one.
     */


    public void quesAnsCheck() {
        if (questionOneAnswerThree.isChecked()) {
            correctAns++;
        }
        if (questionTwoAnswerOne.isChecked()) {
            correctAns++;
        }
        if (questionThreeAnswerTwo.isChecked()) {
            correctAns++;
        }
        if (questionFourAnswerOne.isChecked()) {
            correctAns++;
        }
        if (questionFiveAnswerOne.isChecked()) {
            correctAns++;
        }
        if (questionSixAnswerOne.isChecked()) {
            correctAns++;
        }
        if (questionSevenAnswerTwo.isChecked()) {
            correctAns++;
        }
        if (questionEightAnswerOne.isChecked()) {
            correctAns++;
        }
        if (questionNineAnswerThree.isChecked()) {
            correctAns++;
        }
        if (questionTenAnswerThree.isChecked()) {
            correctAns++;
        }
    }

    /**
     * This method finds all views used in app.
     */

    public void findAllViewById() {

        questionOneAnswerOne = findViewById(R.id.qOneAnsOne);
        questionOneAnswerTwo = findViewById(R.id.qOneAnsTwo);
        questionOneAnswerThree = findViewById(R.id.qOneAnsThree);

        questionTwoAnswerOne = findViewById(R.id.qTwoAnsOne);
        questionTwoAnswerTwo = findViewById(R.id.qTwoAnsTwo);
        questionTwoAnswerThree = findViewById(R.id.qTwoAnsThree);

        questionThreeAnswerOne = findViewById(R.id.qThreeAnsOne);
        questionThreeAnswerTwo = findViewById(R.id.qThreeAnsTwo);
        questionThreeAnswerThree = findViewById(R.id.qThreeAnsThree);

        questionFourAnswerOne = findViewById(R.id.qFourAnsOne);
        questionFourAnswerTwo = findViewById(R.id.qFourAnsTwo);
        questionFourAnswerThree = findViewById(R.id.qFourAnsThree);

        questionFiveAnswerOne = findViewById(R.id.qFiveAnsOne);
        questionFiveAnswerTwo = findViewById(R.id.qFiveAnsTwo);
        questionFiveAnswerThree = findViewById(R.id.qFiveAnsThree);

        questionSixAnswerOne = findViewById(R.id.qSixAnsOne);
        questionSixAnswerTwo = findViewById(R.id.qSixAnsTwo);
        questionSixAnswerThree = findViewById(R.id.qSixAnsThree);

        questionSevenAnswerOne = findViewById(R.id.qSevenAnsOne);
        questionSevenAnswerTwo = findViewById(R.id.qSevenAnsTwo);
        questionSevenAnswerThree = findViewById(R.id.qSevenAnsThree);

        questionEightAnswerOne = findViewById(R.id.qEightAnsOne);
        questionEightAnswerTwo = findViewById(R.id.qEightAnsTwo);
        questionEightAnswerThree = findViewById(R.id.qEightAnsThree);

        questionNineAnswerOne = findViewById(R.id.qNineAnsOne);
        questionNineAnswerTwo = findViewById(R.id.qNineAnsTwo);
        questionNineAnswerThree = findViewById(R.id.qNineAnsThree);

        questionTenAnswerOne = findViewById(R.id.qTenAnsOne);
        questionTenAnswerTwo = findViewById(R.id.qTenAnsTwo);
        questionTenAnswerThree = findViewById(R.id.qTenAnsThree);

        textView = findViewById(R.id.answer);
        firstName = findViewById(R.id.firstName);
        emailId = findViewById(R.id.emailName);
    }

}
