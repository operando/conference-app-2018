package io.github.droidkaigi.confsched2018.data.api.response

import com.squareup.moshi.JsonClass
import org.threeten.bp.Instant

@JsonClass(generateAdapter = true)
data class Session(
        val id: String,
        val isServiceSession: Boolean?,
        val isPlenumSession: Boolean?,
        val speakers: List<String?>?,
        val description: String?,
        val startsAt: Instant?,
        val title: String?,
        val endsAt: Instant?,
        val roomId: Int?,
        val categoryItems: IntArray?,
        val message: SessionMessage?
)
