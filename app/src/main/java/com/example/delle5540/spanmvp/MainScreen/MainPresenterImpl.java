package com.example.delle5540.spanmvp.MainScreen;

import android.util.Log;

import java.util.List;

/**
 * Created by dell e5540 on 5/28/2018.
 */

public class MainPresenterImpl implements IMainPresenter, IFindItemsInteractor.OnFinishedListener {

    private IMainView mainView;
    private IFindItemsInteractor findItemsInteractor;

    public MainPresenterImpl(IMainView mainView, IFindItemsInteractor findItemsInteractor) {
        this.mainView = mainView;
        this.findItemsInteractor = findItemsInteractor;
    }

    @Override
    public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
        }

        findItemsInteractor.findItems(this);
    }

    @Override
    public void onItemClicked(int position) {
        if (mainView != null) {
            mainView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }
    @Override public void onDestroy() {
        mainView = null;
    }


    @Override
    public void onFinished(List<String> items) {
        if (mainView != null) {
            mainView.setItems(items);
            Log.d("SPAN", "fill items");
            mainView.hideProgress();
        }
    }
    public IMainView getMainView() {
        return mainView;
    }
}
