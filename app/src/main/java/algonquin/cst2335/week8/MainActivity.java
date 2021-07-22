package algonquin.cst2335.week8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

/**
 * @author Tianle Liang
 * @studnet Number: 040922323
 * @version 1.0 Week8
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean isTablet = findViewById( R.id.detailsLocation ) != null; // if it is tablet

        MessageListFragment theFragment = new MessageListFragment(isTablet);
        FragmentManager fMgr = getSupportFragmentManager();
        FragmentTransaction tx = fMgr.beginTransaction();
        tx.add(R.id.fragmentLocation, theFragment);
        tx.commit();

    }
}