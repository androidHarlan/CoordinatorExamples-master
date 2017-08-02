package saulmm.coordinatorexamples;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CollapsingToolbarLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);
    }
    public static void start(Context c) {
        c.startActivity(new Intent(c, CollapsingToolbarLayout.class));
    }
}
