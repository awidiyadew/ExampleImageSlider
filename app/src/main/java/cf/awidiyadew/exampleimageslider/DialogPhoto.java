package cf.awidiyadew.exampleimageslider;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by awidiyadew on 18/10/16.
 */
public class DialogPhoto extends android.app.DialogFragment {
    static String URL_;

    public static DialogPhoto newInstance(String url){
        DialogPhoto dialogPhoto = new DialogPhoto();
        Bundle args = new Bundle();
        args.putString("URL", url);
        dialogPhoto.setArguments(args);
        return dialogPhoto;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            URL_ = getArguments().getString("URL");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_photo, container, false);
        ImageView img = (ImageView) rootView.findViewById(R.id.detailPhoto);
        Picasso.with(getActivity()).load(URL_).skipMemoryCache().into(img);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TAG", "DESTROYVIEW FRAGMENT");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "DESTROY FRAGMENT");
    }
}
