# Android Sample APP with Room Database
Room is a persistence library, part of the Android Architecture Components. It makes it easier to work with SQLiteDatabase objects in your app, , decreasing the amount of boilerplate code and verifying SQL queries at compile time.

# Add User 
    
    @Insert
    void insertAll(User... users);

# Delete User 
  
    @Delete
    void delete(User user);
    
# Query Users 
    
    @Query("SELECT * FROM users")
    List<User> getAll();

# User Table sample code 

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
