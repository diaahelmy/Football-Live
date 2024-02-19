package com.example.getapi.Presentetion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getapi.BuildConfig
import com.example.getapi.Presentetion.di.AppComponent
import com.example.getapi.Presentetion.di.AppModule
import com.example.getapi.Presentetion.di.DaggerAppComponent
import com.example.getapi.Presentetion.di.Injector
import com.example.getapi.Presentetion.di.NetModule
import com.example.getapi.Presentetion.di.RemoteDataModule
import com.example.getapi.R
import com.example.getapi.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var factory: MyViewModelFactor
    private lateinit var binding: ActivityMainBinding
    private lateinit var matchViewModel: MyViewModel
    private lateinit var adapter: MatchAdapter
    private lateinit var appComponent: AppComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.X_RapidAPI_Host))
            .remoteDataModule(RemoteDataModule(BuildConfig.X_RapidAPI_Key, "1"))
            .build()


//        (application as Injector).createMovieSubComponent().inject(req)
//
//        matchViewModel = ViewModelProvider(this, factory)[MyViewModel::class.java]
//
//        initRecyclerView()
//
//
//        val client = OkHttpClient()
//
//        val request = Request.Builder()
//            .url("https://sports-live-scores.p.rapidapi.com/football/live")
//            .get()
//            .addHeader("X-RapidAPI-Key", "f25abd6f91msh92226ed598045e9p132929jsn409bf584be65")
//            .addHeader("X-RapidAPI-Host", "sports-live-scores.p.rapidapi.com")
//            .build()
//
//
//        lifecycleScope.launch {
//            val response  = withContext(Dispatchers.IO) {
//                 client.newCall(request).execute()
//            }
//
//            callback(response)
//        }
//
//
//    }
//
//    private fun initRecyclerView() {
//
//
//        binding.recyclerView.layoutManager = LinearLayoutManager(this)
//        adapter = MatchAdapter(this,matchViewModel)
//
//        binding.recyclerView.adapter = adapter
//
//        displayPopularMovie()
//
//
//    }
//    @SuppressLint("NotifyDataSetChanged")
//    private fun displayPopularMovie() {
//        binding.progressBar.visibility = View.VISIBLE
//        val responseLiveData = matchViewModel.getMatch()
//        responseLiveData.observe(this, Observer {
//
//            if (it != null) {
//                adapter.setList(it)
//                adapter.notifyDataSetChanged()
//                binding.progressBar.visibility = View.GONE
//
//            } else {
//                binding.progressBar.visibility = View.GONE
//                Toast.makeText(applicationContext, "No Data Available", Toast.LENGTH_LONG).show()
//
//
//            }
//
//        })
//
//
//    }
//    private fun updateMovies() {
//        binding.progressBar.visibility = View.VISIBLE
//        val response = matchViewModel.updateMatch()
//        response.observe(this, Observer {
//            if (it != null) {
//                adapter.setList(it)
//                adapter.notifyDataSetChanged()
//                binding.progressBar.visibility = View.GONE
//
//
//            } else {
//                binding.progressBar.visibility = View.GONE
//
//
//            }
//
//
//        })
//
//
//    }
//    private suspend fun callback(response: Response) {
//
//        withContext(Dispatchers.Main) {
//
//         val x  = response.headers.toString()
//            Log.d("diaa", x)
//        }
//
//    }
      }
}