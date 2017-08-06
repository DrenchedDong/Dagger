package dongting.beijing.com.dagger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import dongting.beijing.com.dagger.fourth.FourthActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, FourthActivity.class));
    }
}
