package ash.com.dicee;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton=(Button)findViewById(R.id.rollButton);

        final ImageView leftDice=findViewById(R.id.image_leftDice);
        final ImageView rightDice=findViewById(R.id.image_rightDice);


        final int[] diceArray={R.drawable.dice1,R.drawable.dice2,
                R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                on pressing roll button the code in here will be executed
                Log.d("Dicee","the button has been pressed");
                Random randomNumberGenerator=new Random();
                int randomNumber=randomNumberGenerator.nextInt(6);
//                stores random no. bet 0 and 5
                Log.d("Dicee","random number is :"+randomNumber);
                leftDice.setImageResource(diceArray[randomNumber]);

                randomNumber=randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[randomNumber]);
            }
        });
    }
}
