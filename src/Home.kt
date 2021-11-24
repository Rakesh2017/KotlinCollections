import com.google.gson.Gson
import org.json.JSONObject

class Home {

    init {

        val str = "{\"code\":0,\"data\":{\"sl\":[{\"des\":\"早盘\",\"ty\":4,\"ssl\":[{\"c\":493,\"sid\":1},{\"c\":0,\"sid\":177},{\"c\":27,\"sid\":2},{\"c\":0,\"sid\":178},{\"c\":20,\"sid\":3},{\"c\":9,\"sid\":5},{\"c\":4,\"sid\":13},{\"c\":0,\"sid\":15},{\"c\":0,\"sid\":47}],\"tc\":553},{\"des\":\"今日+滚球\",\"ty\":6,\"ssl\":[{\"c\":135,\"sid\":1},{\"c\":0,\"sid\":177},{\"c\":51,\"sid\":2},{\"c\":0,\"sid\":178},{\"c\":67,\"sid\":3},{\"c\":16,\"sid\":5},{\"c\":33,\"sid\":13},{\"c\":105,\"sid\":15},{\"c\":8,\"sid\":47}],\"tc\":415},{\"des\":\"竞彩\",\"ty\":5,\"ssl\":[{\"c\":0,\"sid\":1},{\"c\":0,\"sid\":177},{\"c\":0,\"sid\":2},{\"c\":0,\"sid\":178},{\"c\":0,\"sid\":3},{\"c\":0,\"sid\":5},{\"c\":0,\"sid\":13},{\"c\":0,\"sid\":15},{\"c\":0,\"sid\":47}],\"tc\":0},{\"des\":\"今日\",\"ty\":3,\"ssl\":[{\"c\":133,\"sid\":1},{\"c\":0,\"sid\":177},{\"c\":51,\"sid\":2},{\"c\":0,\"sid\":178},{\"c\":67,\"sid\":3},{\"c\":14,\"sid\":5},{\"c\":33,\"sid\":13},{\"c\":98,\"sid\":15},{\"c\":7,\"sid\":47}],\"tc\":403},{\"des\":\"滚球\",\"ty\":1,\"ssl\":[{\"c\":2,\"sid\":1},{\"c\":0,\"sid\":177},{\"c\":0,\"sid\":2},{\"c\":0,\"sid\":178},{\"c\":0,\"sid\":3},{\"c\":2,\"sid\":5},{\"c\":0,\"sid\":13},{\"c\":7,\"sid\":15},{\"c\":1,\"sid\":47}],\"tc\":12},{\"des\":\"冠军赛事\",\"ty\":7,\"ssl\":[{\"c\":1,\"sid\":1},{\"c\":0,\"sid\":177},{\"c\":0,\"sid\":2},{\"c\":0,\"sid\":178},{\"c\":1,\"sid\":3},{\"c\":0,\"sid\":5},{\"c\":0,\"sid\":13},{\"c\":0,\"sid\":15},{\"c\":0,\"sid\":47}],\"tc\":2},{\"des\":\"串关\",\"ty\":2,\"ssl\":[{\"c\":628,\"sid\":1},{\"c\":0,\"sid\":177},{\"c\":0,\"sid\":2},{\"c\":0,\"sid\":178},{\"c\":87,\"sid\":3},{\"c\":0,\"sid\":5},{\"c\":0,\"sid\":13},{\"c\":105,\"sid\":15},{\"c\":0,\"sid\":47}],\"tc\":820}],\"ht\":167,\"hls\":[{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/1a023bd4e288fcceb6ee2d39eb4c54e8.png\",\"na\":\"欧洲冠军联赛\",\"mt\":9,\"id\":11140},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/c2d952772317c94e92df7738d846acef.png\",\"na\":\"英格兰超级联赛\",\"mt\":20,\"id\":11062},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/9aa1019b6854acf872ccf842634cf37f.png\",\"na\":\"西班牙甲级联赛\",\"mt\":20,\"id\":10815},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/dbc79ec2e70554109ccb6447fa06ca3.png\",\"na\":\"澳大利亚超级联赛\",\"mt\":6,\"id\":10406},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/dd317bc61252b327a1d03a979f161321.png\",\"na\":\"意大利甲级联赛\",\"mt\":10,\"id\":11018},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/c0e1d6399440b7b740cef4b664c8cf0e.png\",\"na\":\"德国甲级联赛\",\"mt\":18,\"id\":10807},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/fc15ad4a69dc35a9d72985a5115388f7.png\",\"na\":\"日本甲级职业联赛\",\"mt\":10,\"id\":10706},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/9aeb33a857aa7469998179045473c1a.png\",\"na\":\"法国甲级联赛\",\"mt\":20,\"id\":10983},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/f847883e4fd177386abd031d22a5abe9.png\",\"na\":\"英格兰冠军联赛\",\"mt\":19,\"id\":11030},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/1f0c6bc1ed9e527a441da13811d6f009.png\",\"na\":\"欧足联欧洲联赛\",\"mt\":16,\"id\":10661},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/data/a6978a33316b3b1db95ab584ff1b7e4d.png\",\"na\":\"美国职业篮球联赛\",\"mt\":14,\"id\":11274},{\"lurl\":\"https://ns-static.s3.ap-northeast-1.amazonaws.com/a156c39e155a65665d351f8363e68616.png\",\"na\":\"欧洲篮球联赛\",\"mt\":5,\"id\":11278}],\"tc\":972},\"success\":true,\"message\":\"SUCCESS\"}"
        val obj = Gson().fromJson<FbMenuModel>(str, FbMenuModel::class.java)

        obj?.data?.sl?.map {
            it.ssl.map { child ->
                if (child?.sid == 1) {
                    child?.sname = "soccer"
                } else if (child?.sid == 2) {
                    child?.sname = "tennis"
                } else if (child?.sid == 3) {
                    child?.sname = "basketball"
                } else {
                    child?.sname = "some random name"
                }
            }
        }

        println(Gson().toJson(obj))

    }

}




fun main() {
    Home()
}