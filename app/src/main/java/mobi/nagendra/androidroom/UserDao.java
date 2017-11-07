package mobi.nagendra.androidroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by nagendra on 11/7/2017.
 */

@Dao
public interface UserDao {
    @Query("SELECT * FROM users")
    List<User> getAll();


    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user);
}
