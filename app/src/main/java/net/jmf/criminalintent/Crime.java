package net.jmf.criminalintent;

import java.util.UUID;

public class Crime {
    public UUID getId() {
        return mId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }
}
