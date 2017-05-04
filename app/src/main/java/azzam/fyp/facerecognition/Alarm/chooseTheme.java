package azzam.fyp.facerecognition.Alarm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import azzam.fyp.facerecognition.R;

public class chooseTheme  extends Activity implements View.OnClickListener  {

    @Override

    public void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        themeUtils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);

        findViewById(R.id.ravenclaw).setOnClickListener(this);
        findViewById(R.id.gold).setOnClickListener(this);
        findViewById(R.id.green).setOnClickListener(this);
        findViewById(R.id.gryffindor).setOnClickListener(this);
        findViewById(R.id.hufflepuff).setOnClickListener(this);
        findViewById(R.id.slytherin).setOnClickListener(this);
        findViewById(R.id.pastel).setOnClickListener(this);

    }

    @Override

    public void onClick(View v)

    {
        switch (v.getId()) {
            case R.id.ravenclaw:
                themeUtils.changeToTheme(this, themeUtils.rc);
                break;
            case R.id.gold:
                themeUtils.changeToTheme(this, themeUtils.gol);
                break;
            case R.id.green:
                themeUtils.changeToTheme(this, themeUtils.green);
                break;
            case R.id.gryffindor:
                themeUtils.changeToTheme(this, themeUtils.gr);
                break;
            case  R.id.pastel:
                themeUtils.changeToTheme(this, themeUtils.pt);
                break;
            case R.id.slytherin:
                themeUtils.changeToTheme(this, themeUtils.sl);
                break;
            case R.id.hufflepuff:
                themeUtils.changeToTheme(this, themeUtils.hp);
                break;
            default:
                themeUtils.changeToTheme(this, themeUtils.green);
                break;

        }
    }
}
