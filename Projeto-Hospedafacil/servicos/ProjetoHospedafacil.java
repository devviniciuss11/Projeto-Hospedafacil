import javax.swing.*;
import java.util.Scanner;

public class ProjetoHospedafacil {
    public static void main(String[] args) {
try (Scanner input_do_menu = new Scanner(System.in)) {
    int repetição = 1;
    while (repetição < 2){
        JOptionPane.showMessageDialog(null, "-----------------------------------\nSEJA BEM VINDO(A) AO SITE HOSPEDAFACIL\n-----------------------------------");
        String menu = """
               [1] HOSPEDAFACIL\n
               [2] CADASTRO \n
               [3] CONSULTAS\n
               [4] RESERVA\n
               [5] SAIR\n
                """;
        String entrada = JOptionPane.showInputDialog(menu)
                if (entrada == null) {
                    break;
                }
                int tipo_de_cadastro = Integer.parseInt(entrada);
                JOptionPane.showMessageDialog(null, "\n\n");
                switch (tipo_de_cadastro) {
                    case 1:
                        HospedafacilEx exemplo = new HospedafacilEx();
                        exemplo.ver_HospedaFacil();
                        break;

                    case 2:
                        SubMenu clienteservico = new SubMenu();
                        clienteservico.ver_e_add_cliente();
                        break;
                }
    }
}
    }
}
