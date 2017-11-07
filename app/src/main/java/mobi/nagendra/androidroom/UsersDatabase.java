package mobi.nagendra.androidroom;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

/**
 * Created by nagendra on 11/7/2017.
 */
@Database(entities = {User.class}, version = 1)
@TypeConverters(Converters.class)
public abstract class UsersDatabase extends RoomDatabase {

    private static UsersDatabase INSTANCE;

    public abstract UserDao userDao();


}
