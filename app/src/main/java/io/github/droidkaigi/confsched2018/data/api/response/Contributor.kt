package io.github.droidkaigi.confsched2018.data.api.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Contributor(
        @Json(name = "login") val name: String,
        var bio: String?,
        @Json(name = "avatar_url") var avatarUrl: String,
        @Json(name = "html_url") var htmlUrl: String,
        var contributions: Int
)
