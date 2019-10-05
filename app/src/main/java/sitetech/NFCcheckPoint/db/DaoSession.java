package sitetech.NFCcheckPoint.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import sitetech.NFCcheckPoint.db.Usuario;
import sitetech.NFCcheckPoint.db.Empresa;
import sitetech.NFCcheckPoint.db.Bus;
import sitetech.NFCcheckPoint.db.Ruta;
import sitetech.NFCcheckPoint.db.Horario;
import sitetech.NFCcheckPoint.db.horarioPorRuta;
import sitetech.NFCcheckPoint.db.Turno;
import sitetech.NFCcheckPoint.db.Registro_Turno;

import sitetech.NFCcheckPoint.db.UsuarioDao;
import sitetech.NFCcheckPoint.db.EmpresaDao;
import sitetech.NFCcheckPoint.db.BusDao;
import sitetech.NFCcheckPoint.db.RutaDao;
import sitetech.NFCcheckPoint.db.HorarioDao;
import sitetech.NFCcheckPoint.db.horarioPorRutaDao;
import sitetech.NFCcheckPoint.db.TurnoDao;
import sitetech.NFCcheckPoint.db.Registro_TurnoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig usuarioDaoConfig;
    private final DaoConfig empresaDaoConfig;
    private final DaoConfig busDaoConfig;
    private final DaoConfig rutaDaoConfig;
    private final DaoConfig horarioDaoConfig;
    private final DaoConfig horarioPorRutaDaoConfig;
    private final DaoConfig turnoDaoConfig;
    private final DaoConfig registro_TurnoDaoConfig;

    private final UsuarioDao usuarioDao;
    private final EmpresaDao empresaDao;
    private final BusDao busDao;
    private final RutaDao rutaDao;
    private final HorarioDao horarioDao;
    private final horarioPorRutaDao horarioPorRutaDao;
    private final TurnoDao turnoDao;
    private final Registro_TurnoDao registro_TurnoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        usuarioDaoConfig = daoConfigMap.get(UsuarioDao.class).clone();
        usuarioDaoConfig.initIdentityScope(type);

        empresaDaoConfig = daoConfigMap.get(EmpresaDao.class).clone();
        empresaDaoConfig.initIdentityScope(type);

        busDaoConfig = daoConfigMap.get(BusDao.class).clone();
        busDaoConfig.initIdentityScope(type);

        rutaDaoConfig = daoConfigMap.get(RutaDao.class).clone();
        rutaDaoConfig.initIdentityScope(type);

        horarioDaoConfig = daoConfigMap.get(HorarioDao.class).clone();
        horarioDaoConfig.initIdentityScope(type);

        horarioPorRutaDaoConfig = daoConfigMap.get(horarioPorRutaDao.class).clone();
        horarioPorRutaDaoConfig.initIdentityScope(type);

        turnoDaoConfig = daoConfigMap.get(TurnoDao.class).clone();
        turnoDaoConfig.initIdentityScope(type);

        registro_TurnoDaoConfig = daoConfigMap.get(Registro_TurnoDao.class).clone();
        registro_TurnoDaoConfig.initIdentityScope(type);

        usuarioDao = new UsuarioDao(usuarioDaoConfig, this);
        empresaDao = new EmpresaDao(empresaDaoConfig, this);
        busDao = new BusDao(busDaoConfig, this);
        rutaDao = new RutaDao(rutaDaoConfig, this);
        horarioDao = new HorarioDao(horarioDaoConfig, this);
        horarioPorRutaDao = new horarioPorRutaDao(horarioPorRutaDaoConfig, this);
        turnoDao = new TurnoDao(turnoDaoConfig, this);
        registro_TurnoDao = new Registro_TurnoDao(registro_TurnoDaoConfig, this);

        registerDao(Usuario.class, usuarioDao);
        registerDao(Empresa.class, empresaDao);
        registerDao(Bus.class, busDao);
        registerDao(Ruta.class, rutaDao);
        registerDao(Horario.class, horarioDao);
        registerDao(horarioPorRuta.class, horarioPorRutaDao);
        registerDao(Turno.class, turnoDao);
        registerDao(Registro_Turno.class, registro_TurnoDao);
    }
    
    public void clear() {
        usuarioDaoConfig.clearIdentityScope();
        empresaDaoConfig.clearIdentityScope();
        busDaoConfig.clearIdentityScope();
        rutaDaoConfig.clearIdentityScope();
        horarioDaoConfig.clearIdentityScope();
        horarioPorRutaDaoConfig.clearIdentityScope();
        turnoDaoConfig.clearIdentityScope();
        registro_TurnoDaoConfig.clearIdentityScope();
    }

    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    public EmpresaDao getEmpresaDao() {
        return empresaDao;
    }

    public BusDao getBusDao() {
        return busDao;
    }

    public RutaDao getRutaDao() {
        return rutaDao;
    }

    public HorarioDao getHorarioDao() {
        return horarioDao;
    }

    public horarioPorRutaDao getHorarioPorRutaDao() {
        return horarioPorRutaDao;
    }

    public TurnoDao getTurnoDao() {
        return turnoDao;
    }

    public Registro_TurnoDao getRegistro_TurnoDao() {
        return registro_TurnoDao;
    }

}
