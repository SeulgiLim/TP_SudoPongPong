

package kr.go.mapo.sudopongpong.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_info.*
import kotlinx.android.synthetic.main.fragment_tip.*
import kotlinx.android.synthetic.main.fragment_tip.view.*
import kr.go.mapo.sudopongpong.MainActivity

import kr.go.mapo.sudopongpong.R
import kr.go.mapo.sudopongpong.adapter.BoardTapAdapter
import kr.go.mapo.sudopongpong.adapter.BoardTapAdapter2


class TipFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_tip, container, false)

        rootView.noticeButton.setOnClickListener {
            val tnf = activity as MainActivity?
            tnf?.tnf()
        }

        rootView.imageButton.setOnClickListener {
            val test = activity as MainActivity?
            test?.test()
        }

        rootView.imageButton2.setOnClickListener {
            val test2 = activity as MainActivity?
            test2?.test2()
        }

        rootView.imageButton3.setOnClickListener {
            val test3 = activity as MainActivity?
            test3?.test3()
        }

        rootView.imageButton4.setOnClickListener {
            val test4 = activity as MainActivity?
            test4?.test4()
        }

        return rootView

    }

 /*   override fun onActivityCreated(savedInstanceState: Bundle?) {
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
        view_pager.adapter = BoardTapAdapter2(childFragmentManager, 3)
        info_taps.setupWithViewPager(view_pager)
        val boardTab: View = this.layoutInflater.inflate(R.layout.info_tap, null, false)
        info_taps.getTabAt(0)!!.customView =
                boardTab.findViewById(R.id.tab_tip) as RelativeLayout
        info_taps.getTabAt(1)!!.customView =
                boardTab.findViewById(R.id.tab_wq) as RelativeLayout
        info_taps.getTabAt(2)!!.customView =
                boardTab.findViewById(R.id.tab_bill) as RelativeLayout
    }*/
}