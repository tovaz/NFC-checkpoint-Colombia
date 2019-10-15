package sitetech.NFCcheckPoint.db;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BUS".
*/
public class BusDao extends AbstractDao<Bus, Long> {

    public static final String TABLENAME = "BUS";

    /**
     * Properties of entity Bus.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Placa = new Property(1, String.class, "placa", false, "PLACA");
        public final static Property Interno = new Property(2, String.class, "interno", false, "INTERNO");
        public final static Property TagNfc = new Property(3, String.class, "tagNfc", false, "TAG_NFC");
        public final static Property Recorridos = new Property(4, Long.class, "recorridos", false, "RECORRIDOS");
        public final static Property Eliminado = new Property(5, boolean.class, "eliminado", false, "ELIMINADO");
        public final static Property EmpresaId = new Property(6, long.class, "empresaId", false, "EMPRESA_ID");
    }

    private DaoSession daoSession;


    public BusDao(DaoConfig config) {
        super(config);
    }
    
    public BusDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BUS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"PLACA\" TEXT NOT NULL ," + // 1: placa
                "\"INTERNO\" TEXT," + // 2: interno
                "\"TAG_NFC\" TEXT," + // 3: tagNfc
                "\"RECORRIDOS\" INTEGER," + // 4: recorridos
                "\"ELIMINADO\" INTEGER NOT NULL ," + // 5: eliminado
                "\"EMPRESA_ID\" INTEGER NOT NULL );"); // 6: empresaId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BUS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Bus entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getPlaca());
 
        String interno = entity.getInterno();
        if (interno != null) {
            stmt.bindString(3, interno);
        }
 
        String tagNfc = entity.getTagNfc();
        if (tagNfc != null) {
            stmt.bindString(4, tagNfc);
        }
 
        Long recorridos = entity.getRecorridos();
        if (recorridos != null) {
            stmt.bindLong(5, recorridos);
        }
        stmt.bindLong(6, entity.getEliminado() ? 1L: 0L);
        stmt.bindLong(7, entity.getEmpresaId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Bus entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getPlaca());
 
        String interno = entity.getInterno();
        if (interno != null) {
            stmt.bindString(3, interno);
        }
 
        String tagNfc = entity.getTagNfc();
        if (tagNfc != null) {
            stmt.bindString(4, tagNfc);
        }
 
        Long recorridos = entity.getRecorridos();
        if (recorridos != null) {
            stmt.bindLong(5, recorridos);
        }
        stmt.bindLong(6, entity.getEliminado() ? 1L: 0L);
        stmt.bindLong(7, entity.getEmpresaId());
    }

    @Override
    protected final void attachEntity(Bus entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Bus readEntity(Cursor cursor, int offset) {
        Bus entity = new Bus( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // placa
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // interno
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tagNfc
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // recorridos
            cursor.getShort(offset + 5) != 0, // eliminado
            cursor.getLong(offset + 6) // empresaId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Bus entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPlaca(cursor.getString(offset + 1));
        entity.setInterno(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTagNfc(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setRecorridos(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setEliminado(cursor.getShort(offset + 5) != 0);
        entity.setEmpresaId(cursor.getLong(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Bus entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Bus entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Bus entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getEmpresaDao().getAllColumns());
            builder.append(" FROM BUS T");
            builder.append(" LEFT JOIN EMPRESA T0 ON T.\"EMPRESA_ID\"=T0.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Bus loadCurrentDeep(Cursor cursor, boolean lock) {
        Bus entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Empresa empresa = loadCurrentOther(daoSession.getEmpresaDao(), cursor, offset);
         if(empresa != null) {
            entity.setEmpresa(empresa);
        }

        return entity;    
    }

    public Bus loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Bus> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Bus> list = new ArrayList<Bus>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Bus> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Bus> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
