package mobi.nagendra.androidroom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.Date;
import java.util.UUID;

/**
 * Created by nagendra on 11/7/2017.
 */

@Entity(tableName = "users")
public  class User {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    long uid;

    @ColumnInfo(name = "userid")
    String mId;

    @ColumnInfo(name = "username")
    String mUserName;


    @ColumnInfo(name = "last_update")
    Date mDate;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public User(String id, String userName) {
        this.mId = id;
        this.mUserName = userName;
        this.mDate = new Date(System.currentTimeMillis());
    }
}