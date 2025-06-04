package com.errday.object.chapter10.playlist;

public class PersonalPlaylist extends Playlist {

    public void remove(Song song) {
        getTracks().remove(song);
        getSingers().remove(song.getSinger());
    }

}
