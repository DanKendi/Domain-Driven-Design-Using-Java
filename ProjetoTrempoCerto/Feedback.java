package ProjetoTrempoCerto;

import java.util.Scanner;

public class Feedback {
    private String feedback;
    public void mensagemFeedback(){
        System.out.println("Sua sugestão ou reclamação é muito importante para a gente!" +
                "\nDeixe a sua sugestão ou reclamação: ");
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
