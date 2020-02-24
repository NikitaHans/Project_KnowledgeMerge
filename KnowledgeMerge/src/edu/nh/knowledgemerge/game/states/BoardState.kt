package edu.nh.knowledgemerge.game.states

import edu.nh.knowledgemerge.data.playable.PlayingCard
import edu.nh.knowledgemerge.data.player.CardGamePlayer
import java.util.function.Consumer

interface BoardState {
    fun getCurrentPlayer(): CardGamePlayer
    fun layCard(card: PlayingCard, cardReturn: Consumer<List<PlayingCard>>)
    fun getCurrentCard(): PlayingCard
    fun endTurn(): PlayingCard?
}