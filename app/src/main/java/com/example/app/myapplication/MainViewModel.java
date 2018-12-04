package com.example.app.myapplication;

import android.app.Activity;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;

import com.example.app.myapplication.network.ApiService;
import com.google.gson.JsonObject;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;


public class MainViewModel extends ViewModel {
    private final CompositeDisposable disposables = new CompositeDisposable();
//    private final MutableLiveData<CalculateResponse> mCalculateResponse = new MutableLiveData<>();


    private final SchedulersFacade schedulersFacade;
    @Inject
    ApiService apiService;


    @Override
    protected void onCleared() {
        disposables.clear();
    }

    public MainViewModel(SchedulersFacade schedulersFacade, ApiService apiService/*, ApiTicketService apiTicketService*/) {
        this.schedulersFacade = schedulersFacade;
        this.apiService = apiService;
//        this.apiTicketService=apiTicketService;
    }


//    public MutableLiveData<DatesResponse> responseDates() {
//        return datesResponse;
//    }


//    public void saveOrder(SaveAttraction saveAtr) {
//
//
//        disposables.add(apiService.saveOrder( Util.GetHeaders(), saveAtr).subscribeOn(schedulersFacade.io())
//                .observeOn(schedulersFacade.ui())
//                .doOnSubscribe(___ -> saveOrderResponse.setValue(SaveOrderResponse.loading()))
//                .subscribe(saveResetPasswordLiveData -> saveOrderResponse
//                                .setValue(SaveOrderResponse.successSaveOrderModel(saveResetPasswordLiveData)),
//                        throwable -> saveOrderResponse.setValue(SaveOrderResponse.error(throwable))));
//    }


}
