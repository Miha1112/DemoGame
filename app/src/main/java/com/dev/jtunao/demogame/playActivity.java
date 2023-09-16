package com.dev.jtunao.demogame;

import static com.dev.jtunao.demogame.MainActivity.total_score;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class playActivity extends AppCompatActivity {
    private Random position;
    private int clickedImg,chekedImg;
    private int remove_cnt = 0;
    private Boolean isAnyCardClicked ;
    private ImageView view_first;
    private ImageView view_second;


    private Integer[] cradsArr = {R.drawable.card_clubs_1,R.drawable.card_clubs_2,R.drawable.card_clubs_3,R.drawable.card_clubs_4,R.drawable.card_clubs_5,R.drawable.card_clubs_6,R.drawable.card_clubs_7,R.drawable.card_clubs_8,R.drawable.card_clubs_9,R.drawable.card_clubs_10,R.drawable.card_clubs_11,R.drawable.card_clubs_12,R.drawable.card_clubs_13
            ,R.drawable.card_diamonds_1,R.drawable.card_diamonds_2,R.drawable.card_diamonds_3,R.drawable.card_diamonds_4,R.drawable.card_diamonds_5,R.drawable.card_diamonds_6,R.drawable.card_diamonds_7,R.drawable.card_diamonds_8,R.drawable.card_diamonds_9,R.drawable.card_diamonds_10,R.drawable.card_diamonds_11,R.drawable.card_diamonds_12,R.drawable.card_diamonds_13
            ,R.drawable.card_hearts_1,R.drawable.card_hearts_2,R.drawable.card_hearts_3,R.drawable.card_hearts_4,R.drawable.card_hearts_5,R.drawable.card_hearts_6,R.drawable.card_hearts_7,R.drawable.card_hearts_8,R.drawable.card_hearts_9,R.drawable.card_hearts_10,R.drawable.card_hearts_11,R.drawable.card_hearts_12,R.drawable.card_hearts_13
            ,R.drawable.card_spades_1,R.drawable.card_spades_2,R.drawable.card_spades_3,R.drawable.card_spades_4,R.drawable.card_spades_5,R.drawable.card_spades_6,R.drawable.card_spades_7,R.drawable.card_spades_8,R.drawable.card_spades_9,R.drawable.card_spades_10,R.drawable.card_spades_11,R.drawable.card_spades_12,R.drawable.card_spades_13};
    private Integer[] backArr = {R.drawable.card_back1,R.drawable.card_back2,R.drawable.card_back3,R.drawable.card_back4};
    private Integer[] cards;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        init();
    }

    private void init(){
        TextView textView = findViewById(R.id.moneyScore);
        textView.setText(Integer.toString(total_score));
        randomaizer(cradsArr);
    }
    private void randomaizer(Integer[] integers){
        Integer[] newCardsArr = {};
        position = new Random();

        for (int i = 0;i < 18;i++){
            newCardsArr[i] = integers[ThreadLocalRandom.current().nextInt(0,35)];
        }
      cards = newCardsArr;
    };

    public void clickOnCrad(View view){
        if (!isAnyCardClicked){
            clickedImg = view.getId();
            isAnyCardClicked = true;
            switch (clickedImg){
                case  R.id.cards_1: {
                    view_first = findViewById(R.id.cards_1);
                    view_first.setImageResource(cards[0]);
                } break;

                case  R.id.cards_2: {
                    view_first = findViewById(R.id.cards_2);
                    view_first.setImageResource(cards[1]);
                } break;
                case  R.id.cards_3: {
                    view_first = findViewById(R.id.cards_3);
                    view_first.setImageResource(cards[2]);
                } break;

                case  R.id.cards_4: {
                    view_first = findViewById(R.id.cards_4);
                    view_first.setImageResource(cards[3]);
                } break;
                case  R.id.cards_5: {
                    view_first = findViewById(R.id.cards_5);
                    view_first.setImageResource(cards[4]);
                } break;
                case  R.id.cards_6: {
                    view_first = findViewById(R.id.cards_6);
                    view_first.setImageResource(cards[5]);
                } break;
                case  R.id.cards_7: {
                    view_first = findViewById(R.id.cards_7);
                    view_first.setImageResource(cards[6]);
                } break;
                case  R.id.cards_8: {
                    view_first = findViewById(R.id.cards_8);
                    view_first.setImageResource(cards[7]);
                } break;
                case  R.id.cards_9: {
                    view_first = findViewById(R.id.cards_9);
                    view_first.setImageResource(cards[8]);
                } break;
                case  R.id.cards_10: {
                    view_first = findViewById(R.id.cards_10);
                    view_first.setImageResource(cards[9]);
                } break;
                case  R.id.cards_11: {
                    view_first = findViewById(R.id.cards_11);
                    view_first.setImageResource(cards[10]);
                } break;
                case  R.id.cards_12: {
                    view_first = findViewById(R.id.cards_12);
                    view_first.setImageResource(cards[11]);
                } break;
                case  R.id.cards_13: {
                    view_first = findViewById(R.id.cards_13);
                    view_first.setImageResource(cards[12]);
                } break;
                case  R.id.cards_14: {
                    view_first = findViewById(R.id.cards_14);

                    view_first.setImageResource(cards[13]);
                } break;
                case  R.id.cards_15: {
                    view_first = findViewById(R.id.cards_15);
                    view_first.setImageResource(cards[14]);
                } break;
                case  R.id.cards_16: {
                    view_first = findViewById(R.id.cards_16);
                    view_first.setImageResource(cards[15]);
                } break;
                case  R.id.cards_17: {
                    view_first = findViewById(R.id.cards_17);

                    view_first.setImageResource(cards[16]);
                } break;
                case  R.id.cards_18: {
                    view_first = findViewById(R.id.cards_18);
                    view_first.setImageResource(cards[17]);
                } break;
                case  R.id.cards_19: {
                    view_first = findViewById(R.id.cards_19);
                    view_first.setImageResource(cards[0]);
                } break;
                case  R.id.cards_20: {
                    view_first = findViewById(R.id.cards_20);
                    view_first.setImageResource(cards[1]);
                } break;
                case  R.id.cards_21: {
                    view_first = findViewById(R.id.cards_21);
                    view_first.setImageResource(cards[2]);
                } break;
                case  R.id.cards_22: {
                    view_first = findViewById(R.id.cards_22);
                    view_first.setImageResource(cards[3]);
                } break;
                case  R.id.cards_23: {
                    view_first = findViewById(R.id.cards_23);

                    view_first.setImageResource(cards[4]);
                } break;
                case  R.id.cards_24: {
                    view_first = findViewById(R.id.cards_24);
                    view_first.setImageResource(cards[5]);
                } break;
                case  R.id.cards_25: {
                    view_first = findViewById(R.id.cards_25);
                    view_first.setImageResource(cards[6]);
                } break;
                case  R.id.cards_26: {
                    view_first = findViewById(R.id.cards_26);
                    view_first.setImageResource(cards[7]);
                } break;
                case  R.id.cards_27: {
                    view_first = findViewById(R.id.cards_27);

                    view_first.setImageResource(cards[8]);
                } break;
                case  R.id.cards_28: {
                    view_first = findViewById(R.id.cards_28);
                    view_first.setImageResource(cards[9]);
                } break;
                case  R.id.cards_29: {
                    view_first = findViewById(R.id.cards_29);
                    view_first.setImageResource(cards[10]);
                } break;
                case  R.id.cards_30: {
                    view_first = findViewById(R.id.cards_30);
                    view_first.setImageResource(cards[11]);
                } break;
                case  R.id.cards_31: {
                    view_first = findViewById(R.id.cards_31);

                    view_first.setImageResource(cards[12]);
                } break;
                case  R.id.cards_32: {
                    view_first = findViewById(R.id.cards_32);
                    view_first.setImageResource(cards[13]);
                } break;
                case  R.id.cards_33: {
                    view_first = findViewById(R.id.cards_33);
                    view_first.setImageResource(cards[14]);
                } break;
                case  R.id.cards_34: {
                    view_first = findViewById(R.id.cards_34);
                    view_first.setImageResource(cards[15]);
                } break;
                case  R.id.cards_35: {
                    view_first = findViewById(R.id.cards_35);

                    view_first.setImageResource(cards[16]);
                } break;
                case  R.id.cards_36: {
                    view_first = findViewById(R.id.cards_36);
                    view_first.setImageResource(cards[17]);
                } break;
            }
        }else {
            chekedImg = view.getId();
            switch (chekedImg){
                case  R.id.cards_1: {
                    view_second = findViewById(R.id.cards_1);
                    view_first.setImageResource(cards[0]);
                } break;

                case  R.id.cards_2: {
                    view_second = findViewById(R.id.cards_2);
                    view_first.setImageResource(cards[1]);
                } break;
                case  R.id.cards_3: {
                    view_second = findViewById(R.id.cards_3);
                    view_first.setImageResource(cards[2]);
                } break;

                case  R.id.cards_4: {
                     view_second = findViewById(R.id.cards_4);
                    view_first.setImageResource(cards[3]);
                } break;
                case  R.id.cards_5: {
                     view_second = findViewById(R.id.cards_5);
                    view_first.setImageResource(cards[4]);
                } break;
                case  R.id.cards_6: {
                     view_second = findViewById(R.id.cards_6);
                    view_first.setImageResource(cards[5]);
                } break;
                case  R.id.cards_7: {
                     view_second = findViewById(R.id.cards_7);
                    view_first.setImageResource(cards[6]);
                } break;
                case  R.id.cards_8: {
                     view_second = findViewById(R.id.cards_8);
                    view_first.setImageResource(cards[7]);
                } break;
                case  R.id.cards_9: {
                     view_second = findViewById(R.id.cards_9);
                    view_first.setImageResource(cards[8]);
                } break;
                case  R.id.cards_10: {
                     view_second = findViewById(R.id.cards_10);
                    view_first.setImageResource(cards[9]);
                } break;
                case  R.id.cards_11: {
                     view_second = findViewById(R.id.cards_11);

                    view_first.setImageResource(cards[10]);
                } break;
                case  R.id.cards_12: {
                     view_second = findViewById(R.id.cards_12);
                    view_first.setImageResource(cards[11]);
                } break;
                case  R.id.cards_13: {
                     view_second = findViewById(R.id.cards_13);
                    view_first.setImageResource(cards[12]);
                } break;
                case  R.id.cards_14: {
                     view_second = findViewById(R.id.cards_14);
                    view_first.setImageResource(cards[13]);
                } break;
                case  R.id.cards_15: {
                     view_second = findViewById(R.id.cards_15);
                    view_first.setImageResource(cards[14]);
                } break;
                case  R.id.cards_16: {
                     view_second = findViewById(R.id.cards_16);
                    view_first.setImageResource(cards[15]);
                } break;
                case  R.id.cards_17: {
                     view_second = findViewById(R.id.cards_17);
                    view_first.setImageResource(cards[16]);
                } break;
                case  R.id.cards_18: {
                     view_second = findViewById(R.id.cards_18);
                    view_first.setImageResource(cards[17]);
                } break;
                case  R.id.cards_19: {
                     view_second = findViewById(R.id.cards_19);

                    view_first.setImageResource(cards[0]);
                } break;
                case  R.id.cards_20: {
                     view_second = findViewById(R.id.cards_20);
                    view_first.setImageResource(cards[1]);
                } break;
                case  R.id.cards_21: {
                     view_second = findViewById(R.id.cards_21);
                    view_first.setImageResource(cards[2]);
                } break;
                case  R.id.cards_22: {
                     view_second = findViewById(R.id.cards_22);
                    view_first.setImageResource(cards[3]);
                } break;
                case  R.id.cards_23: {
                     view_second = findViewById(R.id.cards_23);

                    view_first.setImageResource(cards[4]);
                } break;
                case  R.id.cards_24: {
                     view_second = findViewById(R.id.cards_24);
                    view_first.setImageResource(cards[5]);
                } break;
                case  R.id.cards_25: {
                     view_second = findViewById(R.id.cards_25);
                    view_first.setImageResource(cards[6]);
                } break;
                case  R.id.cards_26: {
                     view_second = findViewById(R.id.cards_26);
                    view_first.setImageResource(cards[7]);
                } break;
                case  R.id.cards_27: {
                     view_second = findViewById(R.id.cards_27);
                    view_first.setImageResource(cards[8]);
                } break;
                case  R.id.cards_28: {
                     view_second = findViewById(R.id.cards_28);
                    view_first.setImageResource(cards[9]);
                } break;
                case  R.id.cards_29: {
                     view_second = findViewById(R.id.cards_29);
                    view_first.setImageResource(cards[10]);
                } break;
                case  R.id.cards_30: {
                     view_second = findViewById(R.id.cards_30);
                    view_first.setImageResource(cards[11]);
                } break;
                case  R.id.cards_31: {
                     view_second = findViewById(R.id.cards_31);
                    view_first.setImageResource(cards[12]);
                } break;
                case  R.id.cards_32: {
                     view_second = findViewById(R.id.cards_32);
                    view_first.setImageResource(cards[13]);
                } break;
                case  R.id.cards_33: {
                     view_second = findViewById(R.id.cards_33);
                    view_first.setImageResource(cards[14]);
                } break;
                case  R.id.cards_34: {
                     view_second = findViewById(R.id.cards_34);
                    view_first.setImageResource(cards[15]);
                } break;
                case  R.id.cards_35: {
                     view_second = findViewById(R.id.cards_35);
                    view_first.setImageResource(cards[16]);
                } break;
                case  R.id.cards_36: {
                     view_second = findViewById(R.id.cards_36);
                    view_first.setImageResource(cards[17]);
                } break;
            }

            Drawable drawable1 = view_first.getDrawable();
            Drawable drawable2 = view_second.getDrawable();

            if (drawable1 == drawable2){
                removeCard();
            }else wrongChoose();
        }

    }
    private void removeCard(){
        isAnyCardClicked = false;
        for (int i = 1; i > 0; i-= 0.001){
            view_first.setImageAlpha(i);
            view_second.setImageAlpha(i);
        }
        RelativeLayout main_layout =  findViewById(R.id.main_play_block);
        main_layout.removeView(view_first);
        main_layout.removeView(view_second);
        total_score+=30;
        remove_cnt++;
        if (remove_cnt >= 17){
            
        }
    }
    private void wrongChoose(){
        view_first.setImageResource(backArr[0]);
        view_second.setImageResource(backArr[0]);
        isAnyCardClicked = false;
    }
}