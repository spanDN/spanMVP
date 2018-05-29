package com.example.delle5540.spanmvp.MainScreen;

import java.util.List;

/**
 * Created by dell e5540 on 5/28/2018.
 */

public interface IMainView {

    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
