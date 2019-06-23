package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    int turn = 0,flag=0 , table[][]={{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}}, count = 0;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, reset;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        reset=findViewById(R.id.reset);
        t = findViewById(R.id.Turn);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetting();
            }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                if (turn == 0) {
                    b1.setText("X");
                    table[0][0]=1;
                    turn = 1;
                    b1.setEnabled(false);
                    t.setText("Player O's turn");
                    count++;
                    if(count>=3)
                        check();
                } else {
                    b1.setText("O");
                    table[0][0]=0;
                    turn = 0;
                    b1.setEnabled(false);
                    t.setText("Player X's turn");
                    count++;
                    if(count>=3)
                        check();
                }

                break;
            case R.id.button2:
                if (turn == 0) {
                    b2.setText("X");
                    table[0][1]=1;
                    turn = 1;
                    b2.setEnabled(false);
                    t.setText("Player O's turn");
                    count++;
                    if(count>=3)
                        check();
                } else {
                    b2.setText("O");
                    table[0][1]=0;
                    turn = 0;
                    b2.setEnabled(false);
                    t.setText("Player X's turn");
                    count++;
                    if(count>=3)
                        check();
                }

                break;
            case R.id.button3:
                if (turn == 0) {
                    b3.setText("X");
                    table[0][2]=1;
                    turn = 1;
                    b3.setEnabled(false);
                    t.setText("Player O's turn");
                    count++;
                    if(count>=3)
                        check();
                } else {
                    b3.setText("O");
                    table[0][2]=0;
                    turn = 0;
                    b3.setEnabled(false);
                    t.setText("Player X's turn");
                    count++;
                    if(count>=3)
                        check();
                }

                break;
            case R.id.button4:
                if (turn == 0) {
                    b4.setText("X");
                    table[1][0]=1;
                    turn = 1;
                    b4.setEnabled(false);
                    t.setText("Player O's turn");
                    count++;
                    if(count>=3)
                        check();
                } else {
                    b4.setText("O");
                    table[1][0]=0;
                    turn = 0;
                    b4.setEnabled(false);
                    t.setText("Player X's turn");
                    count++;
                    if(count>=3)
                        check();
                }

                break;
            case R.id.button5:
                if (turn == 0) {
                    b5.setText("X");
                    table[1][1]=1;
                    turn = 1;
                    b5.setEnabled(false);
                    t.setText("Player O's turn");
                    count++;
                    if(count>=3)
                        check();
                } else {
                    b5.setText("O");
                    table[1][1]=0;
                    turn = 0;
                    b5.setEnabled(false);
                    t.setText("Player X's turn");
                    count++;
                    if(count>=3)
                        check();
                }

                break;
            case R.id.button6:
                if (turn == 0) {
                    b6.setText("X");
                    table[1][2]=1;
                    turn = 1;
                    b6.setEnabled(false);
                    t.setText("Player O's turn");
                    count++;
                    if(count>=3)
                        check();
                } else {
                    b6.setText("O");
                    table[1][2]=0;
                    turn = 0;
                    b6.setEnabled(false);
                    t.setText("Player X's turn");
                    count++;
                    if(count>=3)
                        check();
                }

                break;
            case R.id.button7:
                if (turn == 0) {
                    b7.setText("X");
                    table[2][0]=1;
                    turn = 1;
                    b7.setEnabled(false);
                    t.setText("Player O's turn");
                    count++;
                    if(count>=3)
                        check();
                } else {
                    b7.setText("O");
                    table[2][0]=0;
                    turn = 0;
                    b7.setEnabled(false);
                    t.setText("Player X's turn");
                    count++;
                    if(count>=3)
                        check();
                }

                break;
            case R.id.button8:
                if (turn == 0) {
                    b8.setText("X");
                    table[2][1]=1;
                    turn = 1;
                    b8.setEnabled(false);
                    t.setText("Player O's turn");
                    count++;
                    if(count>=3)
                        check();
                } else {
                    b8.setText("O");
                    table[2][1]=0;
                    turn = 0;
                    b8.setEnabled(false);
                    t.setText("Player X's turn");
                    count++;
                    if(count>=3)
                        check();
                }

                break;
            case R.id.button9:
                if (turn == 0) {
                    b9.setText("X");
                    table[2][2]=1;
                    turn = 1;
                    b9.setEnabled(false);
                    t.setText("Player O's turn");
                    count++;
                    if(count>=3)
                        check();
                } else {
                    b9.setText("O");
                    table[2][2]=0;
                    turn = 0;
                    b9.setEnabled(false);
                    t.setText("Player X's turn");
                    count++;
                    if(count>=3)
                        check();
                }

                break;
        }

        if (count == 9 && flag==0) {
            t.setText("Match Drawn");
            Intent explicit=new Intent(GameActivity.this,CustomDialog.class);
            explicit.putExtra("val", "Match Drawn!");
            startActivity(explicit);
        }

    }

    private void check() {
        Intent explicit=new Intent(GameActivity.this,CustomDialog.class);
        for (int i = 0; i <= 2; i++) {
            if (table[i][0] == table[i][1] && table[i][0] == table[i][2]){
                if (table[i][0] == 1 ) {
                    t.setText("Player X wins");
                    flag=1;
                    explicit.putExtra("val","Player X Wins!!");
                    control(false);
                    startActivity(explicit);
                    break;
                }
                else if (table[i][0] == 0 ) {
                    t.setText("Player O wins");
                    flag=1;
                    explicit.putExtra("val","Player O Wins!!");
                    control(false);
                    startActivity(explicit);
                    break;
                }
            }
        }
        for (int i = 0; i <= 2; i++) {
            if (table[0][i] == table[1][i] && table[0][i] == table[2][i]){
                if (table[0][i] == 1) {
                    t.setText("Player X wins");
                    flag=1;
                    explicit.putExtra("val","Player X Wins!!");
                    control(false);
                    startActivity(explicit);
                    break;
                }
                else if (table[0][i] == 0) {
                    t.setText("Player O wins");
                    flag=1;
                    explicit.putExtra("val","Player O Wins!!");
                    control(false);
                    startActivity(explicit);
                    break;
                }
            }
        }
        if (table[0][0] == table[1][1] && table[0][0] == table[2][2]) {
            if (table[1][1] == 1) {
                t.setText("Player X wins");
                flag=1;
                explicit.putExtra("val","Player X Wins!!");
                control(false);
                startActivity(explicit);
            } else if(table[1][1] == 0){
                t.setText("Player O wins");
                flag=1;
                explicit.putExtra("val","Player O Wins!!");
                control(false);
                startActivity(explicit);
            }
        }
        if(table[0][2] == table[1][1] && table[0][2] == table[2][0]) {
            if (table[1][1] == 1) {
                t.setText("Player X wins");
                flag=1;
                explicit.putExtra("val","Player X Wins!!");
                control(false);
                startActivity(explicit);
            } else if(table[1][1] == 0){
                t.setText("Player O wins");
                flag=1;
                explicit.putExtra("val","Player O Wins!!");
                control(false);
                startActivity(explicit);
            }
        }
    }
    protected void control(boolean val)
    {
        b1.setEnabled(val);
        b2.setEnabled(val);
        b3.setEnabled(val);
        b4.setEnabled(val);
        b5.setEnabled(val);
        b6.setEnabled(val);
        b7.setEnabled(val);
        b8.setEnabled(val);
        b9.setEnabled(val);
    }
    protected void resetting()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        control(true);
        turn = 0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                table[i][j]=-1;
        count = 0;
        t.setText("");
    }
}
