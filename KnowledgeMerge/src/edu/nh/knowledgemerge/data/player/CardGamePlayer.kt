package edu.nh.knowledgemerge.data.player

import edu.nh.knowledgemerge.data.playable.PlayingCard

class CardGamePlayer(
        name : String
) {

    private val cardsInHand : MutableList<PlayingCard> = arrayListOf()

    init{
        println("Initialized player %s".format(name))
    }

    fun draw(vararg cards: PlayingCard) {
        cardsInHand.addAll(cards)
    }
}