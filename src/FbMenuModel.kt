
import com.google.gson.annotations.SerializedName

data class FbMenuModel(
    @SerializedName("code")
    var code: Int,
    @SerializedName("data")
    var data: Data,
    @SerializedName("message")
    var message: String,
    @SerializedName("success")
    var success: Boolean
) {
    data class Data(
        @SerializedName("hls")
        var hls: List<Hl>,
        @SerializedName("ht")
        var ht: Int,
        @SerializedName("sl")
        var sl: List<Sl>,
        @SerializedName("tc")
        var tc: Int
    ) {
        data class Hl(
            @SerializedName("id")
            var id: Int,
            @SerializedName("lurl")
            var lurl: String,
            @SerializedName("mt")
            var mt: Int,
            @SerializedName("na")
            var na: String
        )

        data class Sl(
            @SerializedName("des")
            var des: String,
            @SerializedName("ssl")
            var ssl: List<Ssl>,
            @SerializedName("tc")
            var tc: Int,
            @SerializedName("ty")
            var ty: Int
        ) {
            data class Ssl(
                @SerializedName("c")
                var c: Int,
                @SerializedName("sid")
                var sid: Int,
                @SerializedName("sname")
                var sname: String
            )
        }
    }
}