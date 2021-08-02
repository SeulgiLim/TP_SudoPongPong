package kr.go.mapo.sudopongpong.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import kr.go.mapo.sudopongpong.fragment.*

class BoardTapAdapter(fm: FragmentManager, private val fragmentCount: Int): FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> TipFragment() //전체글->팁
            1 -> WqTestFragment() //팁->수질검사(ProductBoard)
            2 -> BillFragment() //제품추천->요금조회(QnaBoard)

            else -> TipFragment()
        }
    }

    override fun getCount(): Int = fragmentCount

}