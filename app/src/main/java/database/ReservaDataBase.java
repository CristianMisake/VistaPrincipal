package database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.proyecto.models.cancha.Cancha;
import com.proyecto.models.registro.Registro;
import com.proyecto.models.reserva.Reserva;
import com.proyecto.models.usuario.Usuario;

@Database(entities = {Reserva.class}, version = 1)
public abstract class ReservaDataBase extends RoomDatabase {
    public abstract ReservaDao getReservaDao();
}
