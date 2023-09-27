package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Sidney", 123456);
        agendaContatos.adicionarContato("Sidney", 987654);
        agendaContatos.adicionarContato("Sidney Sperandio", 11111111);
        agendaContatos.adicionarContato("Ivanessa", 456789);
        agendaContatos.adicionarContato("Vita", 654321);
        agendaContatos.adicionarContato("Sidney", 444444);

        agendaContatos.exibirContatos();
        
        agendaContatos.removerContato("Ivanessa");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Sidney Sperandio"));
    }
}