package kr.go.mapo.sudopongpong

import com.google.gson.JsonElement
import kr.go.mapo.sudopongpong.waterquality.WaterQuality
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

class WaterQualityAPI{
    companion object {
        val waterQualityUrl = "http://openapi.seoul.go.kr:8088/"
        val apiKey = "5141767669646f6b313135735747575a"
    }
}

interface WaterQualityInterface {
    @GET("{apiKey}/json/AreaQltwtrSttus/1/1")
    fun getWaterQuality(@Path("apiKey") key: String)
    : Call<WaterQuality>
}