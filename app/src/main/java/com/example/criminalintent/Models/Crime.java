package com.example.criminalintent.Models;

import java.util.Date;
import java.util.UUID;

public class Crime
{
    private UUID mID;
    private String title;
    private Date mDate;
    private boolean mSolved;

    public Crime()
    {
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmID()
    {
        return mID;
    }

    public void setmID(UUID mID)
    {
        this.mID = mID;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Date getmDate()
    {
        return mDate;
    }

    public void setmDate(Date mDate)
    {
        this.mDate = mDate;
    }

    public boolean ismSolved()
    {
        return mSolved;
    }

    public void setmSolved(boolean mSolved)
    {
        this.mSolved = mSolved;
    }
}
