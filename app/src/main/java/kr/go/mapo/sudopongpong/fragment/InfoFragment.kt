package kr.go.mapo.sudopongpong.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_info.*
import kr.go.mapo.sudopongpong.R
import kr.go.mapo.sudopongpong.adapter.BoardTapAdapter

class InfoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        boardTab()

        info_taps.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
            override fun onTabSelected(tab: TabLayout.Tab?) {
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }
        })
    }

// 수도관련팁, 수질검사신청, 수도요금조회 상단 버튼
    private fun boardTab() {
        view_pager.adapter = BoardTapAdapter(childFragmentManager, 3)
        info_taps.setupWithViewPager(view_pager)
        val boardTab: View = this.layoutInflater.inflate(R.layout.info_tap, null, false)
        info_taps.getTabAt(0)!!.customView =
                boardTab.findViewById(R.id.tab_tip) as RelativeLayout
        info_taps.getTabAt(1)!!.customView =
                boardTab.findViewById(R.id.tab_wq) as RelativeLayout
        info_taps.getTabAt(2)!!.customView =
                boardTab.findViewById(R.id.tab_bill) as RelativeLayout
    }
}