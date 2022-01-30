package com.example.pagingtmdbdapr.mvp.presenter

interface SampleMVPContractor {

    interface InterfacePresenter{
        fun serverCall()

    }

    interface InterfaceView{
        fun showDialog(message:String)

    }
}