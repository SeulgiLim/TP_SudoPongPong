package kr.go.mapo.sudopongpong

//JSON 파싱을 위한 data class
data class ResultWaterQuality(
        var guname: String = "",
        var dongname: String = "",
        var ph: String = "",
        var rc: String = "",
        var tb: String = ""
)