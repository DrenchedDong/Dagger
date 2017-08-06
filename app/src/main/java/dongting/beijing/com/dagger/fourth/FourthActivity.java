package dongting.beijing.com.dagger.fourth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

import dongting.beijing.com.dagger.R;

public class FourthActivity extends Activity {

    @Inject
    FourthPresenter fourthPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        FourthApplication.fourthComponent.inject(this);

        System.out.println("1==fourthPresenter = " + fourthPresenter);

        findViewById(R.id.fourth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FourthActivity.this,FourthTestActivity.class));
            }
        });

    }
}
