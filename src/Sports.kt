
import com.google.gson.annotations.SerializedName

data class Sports(
    @SerializedName("ServerTime")
    var serverTime: String?,
    @SerializedName("SportCount")
    var sportCount: List<SportCount?>?,
    @SerializedName("StatusCode")
    var statusCode: Int?,
    @SerializedName("StatusDesc")
    var statusDesc: String?
) {
    data class SportCount(
        @SerializedName("Count")
        var count: Int?,
        @SerializedName("EarlyFECount")
        var earlyFECount: Int?,
        @SerializedName("EventGroupTypes")
        var eventGroupTypes: List<EventGroupType?>?,
        @SerializedName("IsCombo")
        var isCombo: Boolean?,
        @SerializedName("IsHasLive")
        var isHasLive: Boolean?,
        @SerializedName("ORCount")
        var oRCount: Int?,
        @SerializedName("OrderNumber")
        var orderNumber: Int?,
        @SerializedName("ProgrammeList")
        var programmeList: List<Any?>?,
        @SerializedName("RBFECount")
        var rBFECount: Int?,
        @SerializedName("SportId")
        var sportId: Int?,
        @SerializedName("SportName")
        var sportName: String?,
        @SerializedName("TodayFECount")
        var todayFECount: Int?
    ) {
        data class EventGroupType(
            @SerializedName("Count")
            var count: Int?,
            @SerializedName("EarlyFECount")
            var earlyFECount: Int?,
            @SerializedName("EventGroupTypeId")
            var eventGroupTypeId: Int?,
            @SerializedName("IsHasLive")
            var isHasLive: Boolean?,
            @SerializedName("ORCount")
            var oRCount: Int?,
            @SerializedName("RBFECount")
            var rBFECount: Int?,
            @SerializedName("TodayFECount")
            var todayFECount: Int?,
            @SerializedName("superId")
            var superId: Int? = 1
        )
    }
}