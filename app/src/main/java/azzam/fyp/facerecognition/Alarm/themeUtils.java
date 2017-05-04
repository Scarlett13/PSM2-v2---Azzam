package azzam.fyp.facerecognition.Alarm;

import android.app.Activity;
import android.content.Intent;

import azzam.fyp.facerecognition.R;


public class themeUtils

{

    private static int cTheme;
    public final static int sl = 0;
    public final static int gr = 1;
    public final static int gol = 2;
    public final static int green = 3;
    public final static int hp = 4;
    public final static int rc = 5;
    public final static int pt = 6;

    public static void changeToTheme(Activity activity, int theme)
    {
        cTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (cTheme)
        {
            default:

            case gr:
                activity.setTheme(R.style.Gryffindor);
                break;

            case sl:
                activity.setTheme(R.style.slytherin);
                break;

            case gol:
                activity.setTheme(R.style.gol);
                break;

            case green:
                activity.setTheme(R.style.green);
                break;
            case hp:
                activity.setTheme(R.style.hufflepuff);
                break;
            case pt:
                activity.setTheme(R.style.pastel);
                break;
            case rc:
                activity.setTheme(R.style.rc);
                break;
        }

    }

}