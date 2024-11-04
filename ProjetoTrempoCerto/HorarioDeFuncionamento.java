package ProjetoTrempoCerto;

import java.time.LocalTime;
public class HorarioDeFuncionamento {
    private LocalTime horarioAbertura = LocalTime.of(4,0);
    private LocalTime horarioFechamento = LocalTime.of(0, 0);

    public boolean estaDentroDoHorario(){
        LocalTime agora = LocalTime.now();
        return agora.isAfter(horarioAbertura) || agora.isBefore(horarioFechamento);
    }
}
