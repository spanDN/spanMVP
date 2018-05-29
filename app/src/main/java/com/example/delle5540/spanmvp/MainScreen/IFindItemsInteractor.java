package com.example.delle5540.spanmvp.MainScreen;

import java.util.List;

/**
 * Created by dell e5540 on 5/28/2018.
 */

public interface IFindItemsInteractor {

    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}
