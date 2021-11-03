package com.example.android.musicplayertesting;

public class AudioData {
    private String name;
    private String singer;
    private String path;

    public AudioData(String name, String path,String singer) {
        this.name = name;
        this.singer = singer;
        this.path=path;
    }

    public AudioData() {
        super();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
