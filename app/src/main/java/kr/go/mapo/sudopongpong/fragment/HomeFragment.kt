package kr.go.mapo.sudopongpong.fragment


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_home.*
import kr.go.mapo.sudopongpong.R
import java.text.SimpleDateFormat
import java.util.*
class HomeFragment : Fragment() {

    //val ppList = listOf(R.raw.gif_pongpong_basic,R.raw.pp_coffee, R.raw.pp_happy)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //백그라운드
        Glide.with(activity!!).load(R.raw.gif_bg_main).centerCrop().into(gif_main_bg)

        //퐁퐁이
        //val random = Random().nextInt(ppList.size)
        Glide.with(activity!!).load(R.raw.gif_pongpong_basic).into(pongpong)


        val currentDateTime = Calendar.getInstance().time
        var dateFormat = SimpleDateFormat("yyyy년 M월 dd일", Locale.KOREA).format(currentDateTime)
        tv_date.text = dateFormat

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val homeView = inflater.inflate(R.layout.fragment_home, container, false)

        return homeView
    }

}