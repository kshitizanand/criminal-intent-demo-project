package com.anandkshitiz.criminalintent;

import java.util.UUID;

/**
 * Created by Kshitiz on 31-12-2015.
 */
public class Crime {
    private UUID mId;
    private String mTitle;


    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime() {
        mId = UUID.randomUUID();
    }
}
