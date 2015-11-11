package cool.test.cs246.storage1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile";
    int totalCount;
    TextView count;
    Button saveBTN;
    Button advanceBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = (TextView)findViewById(R.id.tvCount);
        advanceBTN = (Button)findViewById(R.id.btnAdvance);
        saveBTN = (Button)findViewById(R.id.btnSave);
        System.out.println("jfda;lsjfdkls;aghjkghjkghjkghjkgggggggghjkgggggggggggggggggggggggg      =      " + count.getText());
        //SharedPreferences settings = getPreferences();
       // boolean silent = settings.getBoolean("silentMode", false);
       // setSilent(silent);

    }
//
//    @Override
//    protected void onStop(){
//        super.onStop();
//
//        // We need an Editor object to make preference changes.
//        // All objects are from android.context.Context
//
//
//
//    }

}
