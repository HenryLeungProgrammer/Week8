package algonquin.cst2335.week8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class MessageListFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        View thisLayout = inflater.inflate(R.layout.fragment_layout, container, false);

        return thisLayout;
    }
}
