package com.example.pagingtmdbdapr.workmanager.foreground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkInfo
import androidx.work.WorkManager
import com.example.pagingtmdbdapr.workmanager.foreground.WorkManagerForground.Companion.ARG_PROGRESS
class ForegroundMainActivity : AppCompatActivity() {
/*
    private lateinit var binding: ActivityForegroundWorkerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForegroundWorkerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val workManager = WorkManager.getInstance(this)

        binding.start.setOnClickListener {
            val workRequest = OneTimeWorkRequest.from(WorkManagerForground::class.java)
            // observe progress
            workManager.getWorkInfoByIdLiveData(workRequest.id)
                .observe(this) { workInfo: WorkInfo? ->
                    if (workInfo != null) {
                        val progress = workInfo.progress
                        val value = progress.getInt(ARG_PROGRESS, 0)
                        binding.progressBar.progress = value

                        if (workInfo.state == WorkInfo.State.SUCCEEDED) {
                            binding.start.isEnabled = true
                        }
                    }
                }
            // run the worker
            workManager.enqueue(workRequest)

            binding.start.isEnabled = false
        }
    }

 */
}