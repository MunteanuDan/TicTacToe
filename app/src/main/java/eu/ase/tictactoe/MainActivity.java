package eu.ase.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnPlayGame, btnPlayGameDevice, btnAboutGame;
    private ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9;
    private LinearLayout ll1;

    private TextView tvScoreX, tvScore0;

    boolean r1 = false;
    boolean r2 = false;
    boolean r3 = false;
    boolean r4 = false;
    boolean r5 = false;
    boolean r6 = false;
    boolean r7 = false;
    boolean r8 = false;
    boolean r9 = false;
    boolean x1 = false;
    boolean x2 = false;
    boolean x3 = false;
    boolean x4 = false;
    boolean x5 = false;
    boolean x6 = false;
    boolean x7 = false;
    boolean x8 = false;
    boolean x9 = false;
    boolean zero1 = false;
    boolean zero2 = false;
    boolean zero3 = false;
    boolean zero4 = false;
    boolean zero5 = false;
    boolean zero6 = false;
    boolean zero7 = false;
    boolean zero8 = false;
    boolean zero9 = false;

    boolean device = false;

    int scoreX1vs1 = 0;
    int score01vs1 = 0;

    int scoreXDevice = 0;
    int score0Device = 0;

    boolean zero1Random = false;
    boolean zero2Random = false;
    boolean zero3Random = false;
    boolean zero4Random = false;
    boolean zero5Random = false;
    boolean zero6Random = false;
    boolean zero7Random = false;
    boolean zero8Random = false;
    boolean zero9Random = false;

    int n = 9;

    final int min = 1;
    final int max = 9;

    boolean randomLoop = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();


        btnAboutGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), " The game is played on a grid that's 3 squares by 3 squares.\n" +
                        "        You are X, your friend (or the computer in this case) is O. Players take turns putting their marks in empty squares.\n" +
                        "        The first player to get 3 of her marks in a row (up, down, across, or diagonally) is the winner.\n" +
                        "        When all 9 squares are full, the game is over.", Toast.LENGTH_LONG).show();
            }
        });

        ll1.setVisibility(View.GONE);

        btnPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device = false;
                ll1.setVisibility(View.VISIBLE);
            }
        });

        btnPlayGameDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                device = true;
                ll1.setVisibility(View.VISIBLE);
            }
        });


    }

    private void initComponents() {

        ll1 = findViewById(R.id.ll1);
        btnPlayGame = findViewById(R.id.btn_play_game);
        btnPlayGameDevice = findViewById(R.id.btn_play_game_device);
        btnAboutGame = findViewById(R.id.btn_about_game);
        tvScore0 = findViewById(R.id.tv_score_0);
        tvScoreX = findViewById(R.id.tv_score_x);

        ib1 = findViewById(R.id.ib1);
        ib2 = findViewById(R.id.ib2);
        ib3 = findViewById(R.id.ib3);
        ib4 = findViewById(R.id.ib4);
        ib5 = findViewById(R.id.ib5);
        ib6 = findViewById(R.id.ib6);
        ib7 = findViewById(R.id.ib7);
        ib8 = findViewById(R.id.ib8);
        ib9 = findViewById(R.id.ib9);

    }


    public void handleImageButtonClick(View v) {

        if (!device) {

            if (n != 0) {
                if (n % 2 == 1) {

                    switch (v.getId()) {
                        case R.id.ib1: {
                            if (!r1) {
                                ib1.setImageResource(R.drawable.ximg);
                                r1 = true;
                                x1 = true;
                            }
                        }
                        break;
                        case R.id.ib2: {
                            if (!r2) {
                                ib2.setImageResource(R.drawable.ximg);
                                r2 = true;
                                x2 = true;
                            }
                        }
                        break;
                        case R.id.ib3: {
                            if (!r3) {
                                ib3.setImageResource(R.drawable.ximg);
                                r3 = true;
                                x3 = true;
                            }
                        }
                        break;
                        case R.id.ib4: {
                            if (!r4) {
                                ib4.setImageResource(R.drawable.ximg);
                                r4 = true;
                                x4 = true;
                            }
                        }
                        break;
                        case R.id.ib5: {
                            if (!r5) {
                                ib5.setImageResource(R.drawable.ximg);
                                r5 = true;
                                x5 = true;
                            }
                        }
                        break;
                        case R.id.ib6: {
                            if (!r6) {
                                ib6.setImageResource(R.drawable.ximg);
                                r6 = true;
                                x6 = true;
                            }
                        }
                        break;
                        case R.id.ib7: {
                            if (!r7) {
                                ib7.setImageResource(R.drawable.ximg);
                                r7 = true;
                                x7 = true;
                            }
                        }
                        break;
                        case R.id.ib8: {
                            if (!r8) {
                                ib8.setImageResource(R.drawable.ximg);
                                r8 = true;
                                x8 = true;
                            }
                        }
                        break;
                        case R.id.ib9: {
                            if (!r9) {
                                ib9.setImageResource(R.drawable.ximg);
                                r9 = true;
                                x9 = true;
                            }
                        }
                        break;
                    }
                } else {

                    switch (v.getId()) {
                        case R.id.ib1: {
                            if (!r1) {
                                ib1.setImageResource(R.drawable.zeroimg);
                                r1 = true;
                                zero1 = true;
                            }
                        }
                        break;
                        case R.id.ib2: {
                            if (!r2) {
                                ib2.setImageResource(R.drawable.zeroimg);
                                r2 = true;
                                zero2 = true;
                            }
                        }
                        break;
                        case R.id.ib3: {
                            if (!r3) {
                                ib3.setImageResource(R.drawable.zeroimg);
                                r3 = true;
                                zero3 = true;
                            }
                        }
                        break;
                        case R.id.ib4: {
                            if (!r4) {
                                ib4.setImageResource(R.drawable.zeroimg);
                                r4 = true;
                                zero4 = true;
                            }
                        }
                        break;
                        case R.id.ib5: {
                            if (!r5) {
                                ib5.setImageResource(R.drawable.zeroimg);
                                r5 = true;
                                zero5 = true;
                            }
                        }
                        break;
                        case R.id.ib6: {
                            if (!r6) {
                                ib6.setImageResource(R.drawable.zeroimg);
                                r6 = true;
                                zero6 = true;
                            }
                        }
                        break;
                        case R.id.ib7: {
                            if (!r7) {
                                ib7.setImageResource(R.drawable.zeroimg);
                                r7 = true;
                                zero7 = true;
                            }
                        }
                        break;
                        case R.id.ib8: {
                            if (!r8) {
                                ib8.setImageResource(R.drawable.zeroimg);
                                r8 = true;
                                zero8 = true;
                            }
                        }
                        break;
                        case R.id.ib9: {
                            if (!r9) {
                                ib9.setImageResource(R.drawable.zeroimg);
                                r9 = true;
                                zero9 = true;
                            }
                        }
                        break;
                    }


                }
                n--;

            }


            // reguli pt X
            if (x1 && x2 && x3) {
                scoreX1vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x1 && x4 && x7) {
                scoreX1vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x1 && x5 && x9) {
                scoreX1vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x2 && x5 && x8) {
                scoreX1vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x3 && x5 && x7) {
                scoreX1vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x3 && x6 && x9) {
                scoreX1vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x4 && x5 && x6) {
                scoreX1vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x7 && x8 && x9) {
                scoreX1vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }


            // reguli pt zero
            if (zero1 && zero2 && zero3) {
                score01vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero1 && zero4 && zero7) {
                score01vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero1 && zero5 && zero9) {
                score01vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero2 && zero5 && zero8) {
                score01vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero3 && zero5 && zero7) {
                score01vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero3 && zero6 && zero9) {
                score01vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero4 && zero5 && zero6) {
                score01vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero7 && zero8 && zero9) {
                score01vs1++;
                gameOver1vs1();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }

            if (n == 0) {
                gameOver1vs1();
            }

        } else {
            if (n != 0) {


                switch (v.getId()) {
                    case R.id.ib1: {
                        if (!r1) {
                            ib1.setImageResource(R.drawable.ximg);
                            r1 = true;
                            x1 = true;
                            zero1Random = true;
                            randomLoop = false;
                            n--;
                            deviceMove(v.getId());
                        }
                    }
                    break;
                    case R.id.ib2: {
                        if (!r2) {
                            ib2.setImageResource(R.drawable.ximg);
                            r2 = true;
                            x2 = true;
                            zero2Random = true;
                            randomLoop = false;
                            n--;
                            deviceMove(v.getId());
                        }
                    }
                    break;
                    case R.id.ib3: {
                        if (!r3) {
                            ib3.setImageResource(R.drawable.ximg);
                            r3 = true;
                            x3 = true;
                            zero3Random = true;
                            randomLoop = false;
                            n--;
                            deviceMove(v.getId());
                        }
                    }
                    break;
                    case R.id.ib4: {
                        if (!r4) {
                            ib4.setImageResource(R.drawable.ximg);
                            r4 = true;
                            x4 = true;
                            zero4Random = true;
                            randomLoop = false;
                            n--;
                            deviceMove(v.getId());
                        }
                    }
                    break;
                    case R.id.ib5: {
                        if (!r5) {
                            ib5.setImageResource(R.drawable.ximg);
                            r5 = true;
                            x5 = true;
                            zero5Random = true;
                            randomLoop = false;
                            n--;
                            deviceMove(v.getId());
                        }
                    }
                    break;
                    case R.id.ib6: {
                        if (!r6) {
                            ib6.setImageResource(R.drawable.ximg);
                            r6 = true;
                            x6 = true;
                            zero6Random = true;
                            randomLoop = false;
                            n--;
                            deviceMove(v.getId());
                        }
                    }
                    break;
                    case R.id.ib7: {
                        if (!r7) {
                            ib7.setImageResource(R.drawable.ximg);
                            r7 = true;
                            x7 = true;
                            zero7Random = true;
                            randomLoop = false;
                            n--;
                            deviceMove(v.getId());
                        }
                    }
                    break;
                    case R.id.ib8: {
                        if (!r8) {
                            ib8.setImageResource(R.drawable.ximg);
                            r8 = true;
                            x8 = true;
                            zero8Random = true;
                            randomLoop = false;
                            n--;
                            deviceMove(v.getId());
                        }
                    }
                    break;
                    case R.id.ib9: {
                        if (!r9) {
                            ib9.setImageResource(R.drawable.ximg);
                            r9 = true;
                            x9 = true;
                            zero9Random = true;
                            randomLoop = false;
                            n--;
                            deviceMove(v.getId());
                        }
                    }
                    break;
                }


            }


            // reguli pt X
            if (x1 && x2 && x3) {
                scoreXDevice++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x1 && x4 && x7) {
                scoreXDevice++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x1 && x5 && x9) {
                scoreXDevice++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x2 && x5 && x8) {
                scoreXDevice++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x3 && x5 && x7) {
                scoreXDevice++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x3 && x6 && x9) {
                scoreXDevice++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x4 && x5 && x6) {
                scoreXDevice++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }
            if (x7 && x8 && x9) {
                scoreXDevice++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "X a castigat", Toast.LENGTH_SHORT).show();
            }


            // reguli pt zero
            if (zero1 && zero2 && zero3) {
                score0Device++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero1 && zero4 && zero7) {
                score0Device++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero1 && zero5 && zero9) {
                score0Device++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero2 && zero5 && zero8) {
                score0Device++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero3 && zero5 && zero7) {
                score0Device++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero3 && zero6 && zero9) {
                score0Device++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero4 && zero5 && zero6) {
                score0Device++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }
            if (zero7 && zero8 && zero9) {
                score0Device++;
                gameOverDevice();
                Toast.makeText(getApplicationContext(), "Zero a castigat", Toast.LENGTH_SHORT).show();
            }

            if (n == 0) {
                gameOverDevice();
            }

        }


    }

    private void deviceMove(int id) {

        if (n > 1) {
            while (randomLoop == false) {
                int random = new Random().nextInt((max - min) + 1) + min;

                // if(String.valueOf(random).equals("1") && zero1Random == false)

                switch (random) {
                    case 1: {
                        if (!r1 && String.valueOf(random).equals("1") && zero1Random == false) {
                            ib1.setImageResource(R.drawable.zeroimg);
                            r1 = true;
                            zero1 = true;
                            randomLoop = true;
                            n--;
                        }
                    }
                    break;
                    case 2: {
                        if (!r2 && String.valueOf(random).equals("2") && zero2Random == false) {
                            ib2.setImageResource(R.drawable.zeroimg);
                            r2 = true;
                            zero2 = true;
                            randomLoop = true;
                            n--;
                        }
                    }
                    break;
                    case 3: {
                        if (!r3 && String.valueOf(random).equals("3") && zero3Random == false) {
                            ib3.setImageResource(R.drawable.zeroimg);
                            r3 = true;
                            zero3 = true;
                            randomLoop = true;
                            n--;
                        }
                    }
                    break;
                    case 4: {
                        if (!r4 && String.valueOf(random).equals("4") && zero4Random == false) {
                            ib4.setImageResource(R.drawable.zeroimg);
                            r4 = true;
                            zero4 = true;
                            randomLoop = true;
                            n--;
                        }
                    }
                    break;
                    case 5: {
                        if (!r5 && String.valueOf(random).equals("5") && zero5Random == false) {
                            ib5.setImageResource(R.drawable.zeroimg);
                            r5 = true;
                            zero5 = true;
                            randomLoop = true;
                            n--;
                        }
                    }
                    break;
                    case 6: {
                        if (!r6 && String.valueOf(random).equals("6") && zero6Random == false) {
                            ib6.setImageResource(R.drawable.zeroimg);
                            r6 = true;
                            zero6 = true;
                            randomLoop = true;
                            n--;
                        }
                    }
                    break;
                    case 7: {
                        if (!r7 && String.valueOf(random).equals("7") && zero7Random == false) {
                            ib7.setImageResource(R.drawable.zeroimg);
                            r7 = true;
                            zero7 = true;
                            randomLoop = true;
                            n--;
                        }
                    }
                    break;
                    case 8: {
                        if (!r8 && String.valueOf(random).equals("8") && zero8Random == false) {
                            ib8.setImageResource(R.drawable.zeroimg);
                            r8 = true;
                            zero8 = true;
                            randomLoop = true;
                            n--;
                        }
                    }
                    break;
                    case 9: {
                        if (!r9 && String.valueOf(random).equals("9") && zero9Random == false) {
                            ib9.setImageResource(R.drawable.zeroimg);
                            r9 = true;
                            zero9 = true;
                            randomLoop = true;
                            n--;
                        }
                    }
                    break;
                }
            }
        }

    }

    private void gameOver1vs1() {
        Toast.makeText(getApplicationContext(), "Jocul s-a terminat", Toast.LENGTH_SHORT).show();
        n = 9;
        ll1.setVisibility(View.GONE);
        ib1.setImageResource(R.drawable.tictactoe64);
        ib2.setImageResource(R.drawable.tictactoe64);
        ib3.setImageResource(R.drawable.tictactoe64);
        ib4.setImageResource(R.drawable.tictactoe64);
        ib5.setImageResource(R.drawable.tictactoe64);
        ib6.setImageResource(R.drawable.tictactoe64);
        ib7.setImageResource(R.drawable.tictactoe64);
        ib8.setImageResource(R.drawable.tictactoe64);
        ib9.setImageResource(R.drawable.tictactoe64);

        tvScore0.setText(String.valueOf(score01vs1));
        tvScoreX.setText(String.valueOf(scoreX1vs1));

        r1 = false;
        r2 = false;
        r3 = false;
        r4 = false;
        r5 = false;
        r6 = false;
        r7 = false;
        r8 = false;
        r9 = false;

        x1 = false;
        x2 = false;
        x3 = false;
        x4 = false;
        x5 = false;
        x6 = false;
        x7 = false;
        x8 = false;
        x9 = false;

        zero1 = false;
        zero2 = false;
        zero3 = false;
        zero4 = false;
        zero5 = false;
        zero6 = false;
        zero7 = false;
        zero8 = false;
        zero9 = false;

    }

    private void gameOverDevice() {
        Toast.makeText(getApplicationContext(), "Jocul s-a terminat", Toast.LENGTH_SHORT).show();
        n = 9;
        ll1.setVisibility(View.GONE);
        ib1.setImageResource(R.drawable.tictactoe64);
        ib2.setImageResource(R.drawable.tictactoe64);
        ib3.setImageResource(R.drawable.tictactoe64);
        ib4.setImageResource(R.drawable.tictactoe64);
        ib5.setImageResource(R.drawable.tictactoe64);
        ib6.setImageResource(R.drawable.tictactoe64);
        ib7.setImageResource(R.drawable.tictactoe64);
        ib8.setImageResource(R.drawable.tictactoe64);
        ib9.setImageResource(R.drawable.tictactoe64);

        tvScore0.setText(String.valueOf(score0Device));
        tvScoreX.setText(String.valueOf(scoreXDevice));

        r1 = false;
        r2 = false;
        r3 = false;
        r4 = false;
        r5 = false;
        r6 = false;
        r7 = false;
        r8 = false;
        r9 = false;

        x1 = false;
        x2 = false;
        x3 = false;
        x4 = false;
        x5 = false;
        x6 = false;
        x7 = false;
        x8 = false;
        x9 = false;

        zero1 = false;
        zero2 = false;
        zero3 = false;
        zero4 = false;
        zero5 = false;
        zero6 = false;
        zero7 = false;
        zero8 = false;
        zero9 = false;

        zero1Random = false;
        zero2Random = false;
        zero3Random = false;
        zero4Random = false;
        zero5Random = false;
        zero6Random = false;
        zero7Random = false;
        zero8Random = false;
        zero9Random = false;

    }


}

