package com.example.delle5540.spanmvp.MainScreen;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dell e5540 on 5/28/2018.
 */

public class FindItemsInteractorImpl implements IFindItemsInteractor {

    @Override public void findItems(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                listener.onFinished(createArrayList());
            }
        }, 2000);
    }

    private List<String> createArrayList() {
        return Arrays.asList(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
                "Item 5",
                "Item 6",
                "Item 7",
                "Item 8",
                "Item 9",
                "Item 10",
                "Item 11",
                "Item 12",
                "Item 13",
                "Item 14",
                "Item 15",
                "Item 16",
                "Item 17"
        );
    }
}
