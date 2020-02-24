package edu.nh.knowledgemerge.data.playable

import java.util.*

class PlayingCardSymbol(
        value: String
) {

    private val id: UUID = UUID.randomUUID()

    init {
        println("Initialized Playing Card Symbol with id %s, and value %s".format(id, value))
    }
}