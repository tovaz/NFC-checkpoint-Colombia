package sitetech.NFCcheckPoint.db;

import org.greenrobot.greendao.annotation.*;

import sitetech.NFCcheckPoint.db.DaoSession;
import org.greenrobot.greendao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "REGISTRO__TURNO".
 */
@Entity(active = true)
public class Registro_Turno {

    @Id(autoincrement = true)
    private Long id;
    private java.util.Date fecha;
    private Boolean eliminado;
    private String minAtrazado;
    private String minAdelantado;
    private String justificacion;
    private String despacho;
    private String puntoControl;
    private String extraString;
    private Integer extraInt;
    private long busId;
    private long rutaId;
    private long turnoId;
    private long userId;
    private long puntoId;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient Registro_TurnoDao myDao;

    @ToOne(joinProperty = "busId")
    private Bus bus;

    @Generated
    private transient Long bus__resolvedKey;

    @ToOne(joinProperty = "rutaId")
    private Ruta ruta;

    @Generated
    private transient Long ruta__resolvedKey;

    @ToOne(joinProperty = "turnoId")
    private Turno turno;

    @Generated
    private transient Long turno__resolvedKey;

    @ToOne(joinProperty = "userId")
    private Usuario usuario;

    @Generated
    private transient Long usuario__resolvedKey;

    @ToOne(joinProperty = "puntoId")
    private Punto punto;

    @Generated
    private transient Long punto__resolvedKey;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Registro_Turno() {
    }

    public Registro_Turno(Long id) {
        this.id = id;
    }

    @Generated
    public Registro_Turno(Long id, java.util.Date fecha, Boolean eliminado, String minAtrazado, String minAdelantado, String justificacion, String despacho, String puntoControl, String extraString, Integer extraInt, long busId, long rutaId, long turnoId, long userId, long puntoId) {
        this.id = id;
        this.fecha = fecha;
        this.eliminado = eliminado;
        this.minAtrazado = minAtrazado;
        this.minAdelantado = minAdelantado;
        this.justificacion = justificacion;
        this.despacho = despacho;
        this.puntoControl = puntoControl;
        this.extraString = extraString;
        this.extraInt = extraInt;
        this.busId = busId;
        this.rutaId = rutaId;
        this.turnoId = turnoId;
        this.userId = userId;
        this.puntoId = puntoId;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getRegistro_TurnoDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getFecha() {
        return fecha;
    }

    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getMinAtrazado() {
        return minAtrazado;
    }

    public void setMinAtrazado(String minAtrazado) {
        this.minAtrazado = minAtrazado;
    }

    public String getMinAdelantado() {
        return minAdelantado;
    }

    public void setMinAdelantado(String minAdelantado) {
        this.minAdelantado = minAdelantado;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getPuntoControl() {
        return puntoControl;
    }

    public void setPuntoControl(String puntoControl) {
        this.puntoControl = puntoControl;
    }

    public String getExtraString() {
        return extraString;
    }

    public void setExtraString(String extraString) {
        this.extraString = extraString;
    }

    public Integer getExtraInt() {
        return extraInt;
    }

    public void setExtraInt(Integer extraInt) {
        this.extraInt = extraInt;
    }

    public long getBusId() {
        return busId;
    }

    public void setBusId(long busId) {
        this.busId = busId;
    }

    public long getRutaId() {
        return rutaId;
    }

    public void setRutaId(long rutaId) {
        this.rutaId = rutaId;
    }

    public long getTurnoId() {
        return turnoId;
    }

    public void setTurnoId(long turnoId) {
        this.turnoId = turnoId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPuntoId() {
        return puntoId;
    }

    public void setPuntoId(long puntoId) {
        this.puntoId = puntoId;
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Bus getBus() {
        long __key = this.busId;
        if (bus__resolvedKey == null || !bus__resolvedKey.equals(__key)) {
            __throwIfDetached();
            BusDao targetDao = daoSession.getBusDao();
            Bus busNew = targetDao.load(__key);
            synchronized (this) {
                bus = busNew;
            	bus__resolvedKey = __key;
            }
        }
        return bus;
    }

    @Generated
    public void setBus(Bus bus) {
        if (bus == null) {
            throw new DaoException("To-one property 'busId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.bus = bus;
            busId = bus.getId();
            bus__resolvedKey = busId;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Ruta getRuta() {
        long __key = this.rutaId;
        if (ruta__resolvedKey == null || !ruta__resolvedKey.equals(__key)) {
            __throwIfDetached();
            RutaDao targetDao = daoSession.getRutaDao();
            Ruta rutaNew = targetDao.load(__key);
            synchronized (this) {
                ruta = rutaNew;
            	ruta__resolvedKey = __key;
            }
        }
        return ruta;
    }

    @Generated
    public void setRuta(Ruta ruta) {
        if (ruta == null) {
            throw new DaoException("To-one property 'rutaId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.ruta = ruta;
            rutaId = ruta.getId();
            ruta__resolvedKey = rutaId;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Turno getTurno() {
        long __key = this.turnoId;
        if (turno__resolvedKey == null || !turno__resolvedKey.equals(__key)) {
            __throwIfDetached();
            TurnoDao targetDao = daoSession.getTurnoDao();
            Turno turnoNew = targetDao.load(__key);
            synchronized (this) {
                turno = turnoNew;
            	turno__resolvedKey = __key;
            }
        }
        return turno;
    }

    @Generated
    public void setTurno(Turno turno) {
        if (turno == null) {
            throw new DaoException("To-one property 'turnoId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.turno = turno;
            turnoId = turno.getId();
            turno__resolvedKey = turnoId;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Usuario getUsuario() {
        long __key = this.userId;
        if (usuario__resolvedKey == null || !usuario__resolvedKey.equals(__key)) {
            __throwIfDetached();
            UsuarioDao targetDao = daoSession.getUsuarioDao();
            Usuario usuarioNew = targetDao.load(__key);
            synchronized (this) {
                usuario = usuarioNew;
            	usuario__resolvedKey = __key;
            }
        }
        return usuario;
    }

    @Generated
    public void setUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new DaoException("To-one property 'userId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.usuario = usuario;
            userId = usuario.getId();
            usuario__resolvedKey = userId;
        }
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Punto getPunto() {
        long __key = this.puntoId;
        if (punto__resolvedKey == null || !punto__resolvedKey.equals(__key)) {
            __throwIfDetached();
            PuntoDao targetDao = daoSession.getPuntoDao();
            Punto puntoNew = targetDao.load(__key);
            synchronized (this) {
                punto = puntoNew;
            	punto__resolvedKey = __key;
            }
        }
        return punto;
    }

    @Generated
    public void setPunto(Punto punto) {
        if (punto == null) {
            throw new DaoException("To-one property 'puntoId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.punto = punto;
            puntoId = punto.getId();
            punto__resolvedKey = puntoId;
        }
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
