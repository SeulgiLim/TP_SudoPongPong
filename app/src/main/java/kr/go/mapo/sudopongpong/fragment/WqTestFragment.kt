package kr.go.mapo.sudopongpong.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.fragment_wqtest.*
import kr.go.mapo.sudopongpong.R


class WqTestFragment : Fragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        wb_wq.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true //자바스크립트 사용

        }

        wb_wq.loadUrl("https://ilovewater.or.kr/web/onLineReq?pMENU_NO=191")

    }





    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wqtest, container, false)
    }
}

