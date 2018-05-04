package com.goldensnake.startingprojectcleanmvp.presentation;

/**
 * Created by juliens on 11/10/2017.
 */

// From google android blueprint
public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);

}
