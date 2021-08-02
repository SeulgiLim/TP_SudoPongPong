package kr.go.mapo.sudopongpong.fragment



import android.content.Context.LOCATION_SERVICE
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_map.*
import kr.go.mapo.sudopongpong.R
import net.daum.mf.map.api.MapView



class MapFragment : Fragment() {

   // var mLocationManager: LocationManager? = null
   // var mLocationListener: LocationListener? = null

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
/*
        mLocationManager = mContext.getSystemService(LOCATION_SERVICE) as LocationManager
        mLocationListener = object : LocationListener {
            override fun onLocationChanged(location: Location?) {
                var lat = 0.0
                var lng = 0.0
                if (location != null) {
                    lat = location.latitude
                    lng = location.longitude
                    Log.d("map", "Lat: ${lat}, lon: ${lng}")
                }
                var currentLocation = LatLng(lat, lng)
                mapView!!.addMarker(MarkerOptions().position(currentLocation).title("현재위치"))
                gMap!!.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 15f))
            }

            override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {}
            override fun onProviderEnabled(provider: String?) {}
            override fun onProviderDisabled(provider: String?) {}
        }
        //현재 위치 버튼 클릭
        getLocationButton.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    mContext,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(
                    mContext,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                mLocationManager!!.requestLocationUpdates(
                    LocationManager.GPS_PROVIDER,
                    3000L,
                    30f,
                    mLocationListener
                )

            }
        }
    }*/
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_map, container, false)

        //맵
        val mapView = MapView(activity)
        val mapViewContainer = rootView.findViewById(R.id.map_view) as ViewGroup
        mapViewContainer.addView(mapView)

        return rootView
    }




}

    /*
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.search_menu, menu)

        // Get the SearchView and set the searchable configuration
        val searchManager = getSystemService(activity.SEARCH_SERVICE) as SearchManager
        (menu.findItem(R.id.searchView).actionView as SearchView).apply {
            // Assumes current activity is the searchable activity
            //setSearchableInfo(searchManager.getSearchableInfo(componentName))
            //setIconifiedByDefault(false) // Do not iconify the widget; expand it by default
        }
        return true
    }
}

/*
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the options menu from XML
        val inflater = menuInflater
        inflater.inflate(R.menu.options_menu, menu)

        // Get the SearchView and set the searchable configuration
        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (menu.findItem(R.id.menu_search).actionView as SearchView).apply {
            // Assumes current activity is the searchable activity
            setSearchableInfo(searchManager.getSearchableInfo(componentName))
            setIconifiedByDefault(false) // Do not iconify the widget; expand it by default
        }

        return true
    }*/

/*
//마커
val MARKER_POINT = MapPoint.mapPointWithGeoCoord(37.54892296550104, 126.99089033876304)
val marker = MapPOIItem()
marker.setItemName("Default Marker")
marker.setTag(0)
marker.setMapPoint(MARKER_POINT)
marker.setMarkerType(MapPOIItem.MarkerType.BluePin)
marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin)
mapView.addPOIItem(marker)
*/