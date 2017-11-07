# Android-Room
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
