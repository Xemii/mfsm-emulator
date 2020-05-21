package ru.iteco.mfsm.emulator;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InteractionEntityRequest {
    @JsonProperty
    private InteractionEntity Interaction;

    public InteractionEntity getInteraction() {
        return Interaction;
    }

    public void setInteraction(InteractionEntity interaction) {
        Interaction = interaction;
    }

    @Override
    public String toString() {
        return "InteractionEntityRequest{" +
                "Interaction=" + Interaction +
                '}';
    }
}
