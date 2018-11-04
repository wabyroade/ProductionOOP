package com.wyattbyroade.productionoop;

/**
 * The class AudioPlayer derived from Product and implementing methods from MultimediaControl interface.
 *
 * @author  Wyatt Byroade
 * @version 0.8 Beta
 */
public class AudioPlayer extends Product implements MultimediaControl {

    private String audioSpecification;
    private ItemType mediaType;

    /**
     * Instantiates a new Audio player.
     *
     * @param name               the name
     * @param audioSpecification the audio specification
     */
    AudioPlayer(String name, String audioSpecification) {
        super(name);
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.AUDIO;
    }

    /**
     * Outputs "Playing" to console
     */
    @Override
    public void play() {
        System.out.println("Playing");
    }

    /**
     * Outputs "Stopping" to console
     */
    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    /**
     * Outputs "Previous" to console
     */
    @Override
    public void previous() {
        System.out.println("Previous");
    }

    /**
     * Outputs "Next" to console
     */
    @Override
    public void next() {
        System.out.println("Next");
    }

    /**
     * Returns String representation of this object to calling method
     *
     * @return String representation of super class as well as Audio Spec and Type values to console
     */
    public String toString() {
        return super.toString() + "\n"
                + "Audio Spec : " + audioSpecification + "\n"
                + "Type : " + mediaType;
    }
}

