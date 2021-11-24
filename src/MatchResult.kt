import java.util.*

data class MatchResult(
    var eventId: Int,
    var home:String,
    var away:String,
    var result: List<Result>?
) {
    data class Result(
        val scores: Arrays
    )
}
