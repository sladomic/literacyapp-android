package org.literacyapp.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * Master of DAO (schema version 1003004): knows all DAOs.
 */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1003004;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(Database db, boolean ifNotExists) {
        AllophoneDao.createTable(db, ifNotExists);
        LetterDao.createTable(db, ifNotExists);
        AudioDao.createTable(db, ifNotExists);
        ImageDao.createTable(db, ifNotExists);
        JoinAudiosWithLettersDao.createTable(db, ifNotExists);
        JoinAudiosWithNumbersDao.createTable(db, ifNotExists);
        JoinAudiosWithWordsDao.createTable(db, ifNotExists);
        JoinImagesWithLettersDao.createTable(db, ifNotExists);
        JoinImagesWithNumbersDao.createTable(db, ifNotExists);
        JoinImagesWithWordsDao.createTable(db, ifNotExists);
        JoinVideosWithLettersDao.createTable(db, ifNotExists);
        JoinVideosWithNumbersDao.createTable(db, ifNotExists);
        JoinVideosWithWordsDao.createTable(db, ifNotExists);
        VideoDao.createTable(db, ifNotExists);
        NumberDao.createTable(db, ifNotExists);
        WordDao.createTable(db, ifNotExists);
        DeviceDao.createTable(db, ifNotExists);
        JoinStudentsWithDevicesDao.createTable(db, ifNotExists);
        StudentDao.createTable(db, ifNotExists);
        StudentImageDao.createTable(db, ifNotExists);
        StudentImageFeatureDao.createTable(db, ifNotExists);
        StudentImageCollectionEventDao.createTable(db, ifNotExists);
    }

    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(Database db, boolean ifExists) {
        AllophoneDao.dropTable(db, ifExists);
        LetterDao.dropTable(db, ifExists);
        AudioDao.dropTable(db, ifExists);
        ImageDao.dropTable(db, ifExists);
        JoinAudiosWithLettersDao.dropTable(db, ifExists);
        JoinAudiosWithNumbersDao.dropTable(db, ifExists);
        JoinAudiosWithWordsDao.dropTable(db, ifExists);
        JoinImagesWithLettersDao.dropTable(db, ifExists);
        JoinImagesWithNumbersDao.dropTable(db, ifExists);
        JoinImagesWithWordsDao.dropTable(db, ifExists);
        JoinVideosWithLettersDao.dropTable(db, ifExists);
        JoinVideosWithNumbersDao.dropTable(db, ifExists);
        JoinVideosWithWordsDao.dropTable(db, ifExists);
        VideoDao.dropTable(db, ifExists);
        NumberDao.dropTable(db, ifExists);
        WordDao.dropTable(db, ifExists);
        DeviceDao.dropTable(db, ifExists);
        JoinStudentsWithDevicesDao.dropTable(db, ifExists);
        StudentDao.dropTable(db, ifExists);
        StudentImageDao.dropTable(db, ifExists);
        StudentImageFeatureDao.dropTable(db, ifExists);
        StudentImageCollectionEventDao.dropTable(db, ifExists);
    }

    /**
     * WARNING: Drops all table on Upgrade! Use only during development.
     * Convenience method using a {@link DevOpenHelper}.
     */
    public static DaoSession newDevSession(Context context, String name) {
        Database db = new DevOpenHelper(context, name).getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        return daoMaster.newSession();
    }

    public DaoMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoMaster(Database db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(AllophoneDao.class);
        registerDaoClass(LetterDao.class);
        registerDaoClass(AudioDao.class);
        registerDaoClass(ImageDao.class);
        registerDaoClass(JoinAudiosWithLettersDao.class);
        registerDaoClass(JoinAudiosWithNumbersDao.class);
        registerDaoClass(JoinAudiosWithWordsDao.class);
        registerDaoClass(JoinImagesWithLettersDao.class);
        registerDaoClass(JoinImagesWithNumbersDao.class);
        registerDaoClass(JoinImagesWithWordsDao.class);
        registerDaoClass(JoinVideosWithLettersDao.class);
        registerDaoClass(JoinVideosWithNumbersDao.class);
        registerDaoClass(JoinVideosWithWordsDao.class);
        registerDaoClass(VideoDao.class);
        registerDaoClass(NumberDao.class);
        registerDaoClass(WordDao.class);
        registerDaoClass(DeviceDao.class);
        registerDaoClass(JoinStudentsWithDevicesDao.class);
        registerDaoClass(StudentDao.class);
        registerDaoClass(StudentImageDao.class);
        registerDaoClass(StudentImageFeatureDao.class);
        registerDaoClass(StudentImageCollectionEventDao.class);
    }

    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }

    /**
     * Calls {@link #createAllTables(Database, boolean)} in {@link #onCreate(Database)} -
     */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

}
