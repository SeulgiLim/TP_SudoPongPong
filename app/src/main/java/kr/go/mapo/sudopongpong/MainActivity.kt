package kr.go.mapo.sudopongpong

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import kr.go.mapo.sudopongpong.fragment.*


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    //위치 정보 권한
    val permission_list = arrayOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
    )


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Permission
        requestPermissions(permission_list, 0)

        //Tool Bar
        setSupportActionBar(findViewById(R.id.toolbar))
        val noActionBar = supportActionBar!!
        noActionBar.setDisplayShowTitleEnabled(false)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.favorite_unclick)

        //Bottom Navigation Bar
        bottom_nvg.setOnNavigationItemSelectedListener(this)
        bottom_nvg.selectedItemId = R.id.nvg_home
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nvg_home -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.frame_nvg, HomeFragment())
                transaction.commit()
                return true
            }
            R.id.nvg_map -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.frame_nvg, MapFragment())
                transaction.commit()
                return true
            }
            R.id.nvg_info -> {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.frame_nvg, InfoFragment())
                transaction.commit()
                return true
            }
        }
        return false
    }


    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<out String>,
            grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        for (r1 in grantResults) {
            if (r1 == PackageManager.PERMISSION_DENIED) {
                return
            }
        }

        val manager = getSystemService(LOCATION_SERVICE) as LocationManager
        if (ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }

        val location1 = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
        val location2 = manager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)

        if (location1 != null) {
            showInfo(location1)
        } else if (location2 != null) {
            showInfo(location2)
        }

        val listener = LocationListener {
            showInfo(it)
        }
    }

    fun showInfo(location: Location) {
        //val geocoder = Geocoder(this)
        if (location != null) {
            address.text = "경도: ${location.latitude}"
            //textView2.text = "경도: ${location.latitude}"
            //textView3.text = "위도r: ${location.longitude}"
        }
    }

    fun tnf(){
        with(supportFragmentManager.beginTransaction()){
            val frgNotice = TipNoticesFragment()
            replace(R.id.frame_nvg, frgNotice)
            addToBackStack(null)
            commit()
        }
    }





    fun test() {
        with(supportFragmentManager.beginTransaction()) {
            val frgDetail = TipDetailFragment()
            //       val frgTip = supportFragmentManager.findFragmentById(R.id.layoutTip) as TipFragment?
            replace(R.id.frame_nvg, frgDetail)
            addToBackStack(null)
            commit()
        }
    }

    fun test2() {
        with(supportFragmentManager.beginTransaction()) {
            val frgDetail2 = TipDetailFragmentTwo()
            //       val frgTip = supportFragmentManager.findFragmentById(R.id.layoutTip) as TipFragment?
            replace(R.id.frame_nvg, frgDetail2)
            addToBackStack(null)
            commit()
        }
    }

    fun test3() {
        with(supportFragmentManager.beginTransaction()) {
            val frgDetail3 = TipDetailFragmentThree()
            //       val frgTip = supportFragmentManager.findFragmentById(R.id.layoutTip) as TipFragment?
            replace(R.id.frame_nvg, frgDetail3)
            addToBackStack(null)
            commit()
        }
    }

    fun test4() {
        with(supportFragmentManager.beginTransaction()) {
            val frgDetail4 = TipDetailFragmentFour()
            //       val frgTip = supportFragmentManager.findFragmentById(R.id.layoutTip) as TipFragment?
            replace(R.id.frame_nvg, frgDetail4)
            addToBackStack(null)
            commit()
        }
    }
}







