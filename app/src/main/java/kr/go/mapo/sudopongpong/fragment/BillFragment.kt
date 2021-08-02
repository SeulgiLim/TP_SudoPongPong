package kr.go.mapo.sudopongpong.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_bill.*
import kr.go.mapo.sudopongpong.R


class BillFragment : Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        wb_bill.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true

        }

        wb_bill.loadUrl("https://i121.seoul.go.kr/cs/cyber/front/cgcalc/NR_cgJungInfo.do?_m=m1_1_1")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bill, container, false)
    }

}