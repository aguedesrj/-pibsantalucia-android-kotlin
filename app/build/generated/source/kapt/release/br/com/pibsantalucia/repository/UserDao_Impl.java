package br.com.pibsantalucia.repository;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import br.com.pibsantalucia.model.User;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfUser;

  private final SharedSQLiteStatement __preparedStmtOfDeleteUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `User`(`pesCodigo`,`cpfOrEmail`,`umeSenha`,`umeSenhaTemp`,`pesNome`,`perCodigo`,`urlPhoto`,`token`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getPesCodigo());
        if (value.getCpfOrEmail() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCpfOrEmail());
        }
        if (value.getUmeSenha() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUmeSenha());
        }
        final int _tmp;
        _tmp = value.getUmeSenhaTemp() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getPesNome() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPesNome());
        }
        stmt.bindLong(6, value.getPerCodigo());
        if (value.getUrlPhoto() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUrlPhoto());
        }
        if (value.getToken() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getToken());
        }
      }
    };
    this.__deletionAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `User` WHERE `pesCodigo` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getPesCodigo());
      }
    };
    this.__updateAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `User` SET `pesCodigo` = ?,`cpfOrEmail` = ?,`umeSenha` = ?,`umeSenhaTemp` = ?,`pesNome` = ?,`perCodigo` = ?,`urlPhoto` = ?,`token` = ? WHERE `pesCodigo` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getPesCodigo());
        if (value.getCpfOrEmail() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCpfOrEmail());
        }
        if (value.getUmeSenha() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUmeSenha());
        }
        final int _tmp;
        _tmp = value.getUmeSenhaTemp() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getPesNome() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPesNome());
        }
        stmt.bindLong(6, value.getPerCodigo());
        if (value.getUrlPhoto() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUrlPhoto());
        }
        if (value.getToken() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getToken());
        }
        stmt.bindLong(9, value.getPesCodigo());
      }
    };
    this.__preparedStmtOfDeleteUser = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM User";
        return _query;
      }
    };
  }

  @Override
  public void insertUser(User... user) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUser(User user) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateUser(User user) {
    __db.beginTransaction();
    try {
      __updateAdapterOfUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteUser() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteUser.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteUser.release(_stmt);
    }
  }

  @Override
  public List<User> getAllUsers() {
    final String _sql = "SELECT * FROM User";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPesCodigo = _cursor.getColumnIndexOrThrow("pesCodigo");
      final int _cursorIndexOfCpfOrEmail = _cursor.getColumnIndexOrThrow("cpfOrEmail");
      final int _cursorIndexOfUmeSenha = _cursor.getColumnIndexOrThrow("umeSenha");
      final int _cursorIndexOfUmeSenhaTemp = _cursor.getColumnIndexOrThrow("umeSenhaTemp");
      final int _cursorIndexOfPesNome = _cursor.getColumnIndexOrThrow("pesNome");
      final int _cursorIndexOfPerCodigo = _cursor.getColumnIndexOrThrow("perCodigo");
      final int _cursorIndexOfUrlPhoto = _cursor.getColumnIndexOrThrow("urlPhoto");
      final int _cursorIndexOfToken = _cursor.getColumnIndexOrThrow("token");
      final List<User> _result = new ArrayList<User>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final User _item;
        _item = new User();
        final long _tmpPesCodigo;
        _tmpPesCodigo = _cursor.getLong(_cursorIndexOfPesCodigo);
        _item.setPesCodigo(_tmpPesCodigo);
        final String _tmpCpfOrEmail;
        _tmpCpfOrEmail = _cursor.getString(_cursorIndexOfCpfOrEmail);
        _item.setCpfOrEmail(_tmpCpfOrEmail);
        final String _tmpUmeSenha;
        _tmpUmeSenha = _cursor.getString(_cursorIndexOfUmeSenha);
        _item.setUmeSenha(_tmpUmeSenha);
        final boolean _tmpUmeSenhaTemp;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfUmeSenhaTemp);
        _tmpUmeSenhaTemp = _tmp != 0;
        _item.setUmeSenhaTemp(_tmpUmeSenhaTemp);
        final String _tmpPesNome;
        _tmpPesNome = _cursor.getString(_cursorIndexOfPesNome);
        _item.setPesNome(_tmpPesNome);
        final int _tmpPerCodigo;
        _tmpPerCodigo = _cursor.getInt(_cursorIndexOfPerCodigo);
        _item.setPerCodigo(_tmpPerCodigo);
        final String _tmpUrlPhoto;
        _tmpUrlPhoto = _cursor.getString(_cursorIndexOfUrlPhoto);
        _item.setUrlPhoto(_tmpUrlPhoto);
        final String _tmpToken;
        _tmpToken = _cursor.getString(_cursorIndexOfToken);
        _item.setToken(_tmpToken);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public User getUser() {
    final String _sql = "SELECT * FROM User";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPesCodigo = _cursor.getColumnIndexOrThrow("pesCodigo");
      final int _cursorIndexOfCpfOrEmail = _cursor.getColumnIndexOrThrow("cpfOrEmail");
      final int _cursorIndexOfUmeSenha = _cursor.getColumnIndexOrThrow("umeSenha");
      final int _cursorIndexOfUmeSenhaTemp = _cursor.getColumnIndexOrThrow("umeSenhaTemp");
      final int _cursorIndexOfPesNome = _cursor.getColumnIndexOrThrow("pesNome");
      final int _cursorIndexOfPerCodigo = _cursor.getColumnIndexOrThrow("perCodigo");
      final int _cursorIndexOfUrlPhoto = _cursor.getColumnIndexOrThrow("urlPhoto");
      final int _cursorIndexOfToken = _cursor.getColumnIndexOrThrow("token");
      final User _result;
      if(_cursor.moveToFirst()) {
        _result = new User();
        final long _tmpPesCodigo;
        _tmpPesCodigo = _cursor.getLong(_cursorIndexOfPesCodigo);
        _result.setPesCodigo(_tmpPesCodigo);
        final String _tmpCpfOrEmail;
        _tmpCpfOrEmail = _cursor.getString(_cursorIndexOfCpfOrEmail);
        _result.setCpfOrEmail(_tmpCpfOrEmail);
        final String _tmpUmeSenha;
        _tmpUmeSenha = _cursor.getString(_cursorIndexOfUmeSenha);
        _result.setUmeSenha(_tmpUmeSenha);
        final boolean _tmpUmeSenhaTemp;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfUmeSenhaTemp);
        _tmpUmeSenhaTemp = _tmp != 0;
        _result.setUmeSenhaTemp(_tmpUmeSenhaTemp);
        final String _tmpPesNome;
        _tmpPesNome = _cursor.getString(_cursorIndexOfPesNome);
        _result.setPesNome(_tmpPesNome);
        final int _tmpPerCodigo;
        _tmpPerCodigo = _cursor.getInt(_cursorIndexOfPerCodigo);
        _result.setPerCodigo(_tmpPerCodigo);
        final String _tmpUrlPhoto;
        _tmpUrlPhoto = _cursor.getString(_cursorIndexOfUrlPhoto);
        _result.setUrlPhoto(_tmpUrlPhoto);
        final String _tmpToken;
        _tmpToken = _cursor.getString(_cursorIndexOfToken);
        _result.setToken(_tmpToken);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
