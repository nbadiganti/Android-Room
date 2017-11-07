package mobi.nagendra.androidroom

import android.annotation.SuppressLint
import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.time.LocalDateTime
import java.util.*
import android.widget.Toast
import android.app.Activity
import android.os.AsyncTask



class MainActivity : AppCompatActivity() {

    private var TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(applicationContext,
                UsersDatabase::class.java, "UserDatabase").build()

        val user = User("1", "Nag")
        val user2 = User("2", "driftycode")
        val user3 = User("2", "android")

        object : AsyncTask<Void, Void, Int>() {
            override fun doInBackground(vararg params: Void): Int? {

                db.userDao().insertAll(user, user2)
                db.userDao().insertAll(user, user2)

                val usersList = db.userDao().getAll()
                Log.d(TAG, "userslist " + usersList.size)
                usersList?.forEach { user: User? -> Log.d(TAG, "**** name " + user?.getmUserName()) }
                db.userDao().insertAll(user, user2)
                return 1
            }

            override fun onPostExecute(result: Int?) {
              Log.d(TAG, "Date is in onPostExcute");
            }
        }.execute()


    }



}
