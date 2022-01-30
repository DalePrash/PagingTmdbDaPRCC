package com.example.pagingtmdbdapr.mvp.presenter

import android.content.Context
import com.example.pagingtmdbdapr.mvp.view.SampleMVPActivity
import com.example.pagingtmdbdapr.util.Logger

class SampleMVPPresenter(private val context: Context?): SampleMVPContractor.InterfacePresenter {

    val  view = SampleMVPActivity()


    override fun serverCall() {
Logger.i("A","Service call made")
        view.showDialog("Server completed")

    }
}