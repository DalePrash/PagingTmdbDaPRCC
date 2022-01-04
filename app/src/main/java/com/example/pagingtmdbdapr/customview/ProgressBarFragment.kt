package com.example.pagingtmdbdapr.customview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.fragment.app.DialogFragment
import com.example.pagingtmdbdapr.R

public class ProgressBarFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val loaderView = inflater.inflate(R.layout.activity_progress_bar, container, false)

     //   val loading = (ProgressBar)loaderView.findViewById(R.id.loadingProgress)
      //  loading.visibility =
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}