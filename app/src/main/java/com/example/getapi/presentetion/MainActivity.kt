package com.example.getapi.presentetion


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.getapi.R
import com.example.getapi.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.navView.setNavigationItemSelectedListener(this)
        toggle()

    }

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
//        adapter = MainAdapter(this,matchViewModel)
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


    private fun toggle() {


        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)


        } else {
            binding.drawerLayout.openDrawer(GravityCompat.START)

        }


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.La_Liga -> {

                  val navController = findNavController(R.id.fragmentContainerView)
                navController.navigate(
                    MainFragmentDirections.actionMainFragmentToRnakFragment(
                        36
                    )
                )
            //  findNavController().navigateUp()
        }

            R.id.Premier_League -> {
                val navController = findNavController(R.id.fragmentContainerView)
                navController.navigate(
                    MainFragmentDirections.actionMainFragmentToRnakFragment(
                        1
                    )
                )

            }

            R.id.matches -> {
                val navController = findNavController(R.id.fragmentContainerView)
                navController.navigate(
                    MainFragmentDirections.actionMainFragmentToMatchesDBFragment()
                )

            }

            else -> return false
        }
        return true
    }


}