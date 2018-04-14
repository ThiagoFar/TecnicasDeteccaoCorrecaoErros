import javax.swing.JOptionPane;

public class Checksum {

	public void emissor() {
		String mensagem="";
		int repet;
		String mensagemJP = "Informe a mensagem a ser enviada ou digite pular para informar a mensagem a ser recebida" ;
		 mensagem= JOptionPane.showInputDialog(mensagemJP);
		 repet= (mensagem.length())/8;
		 System.out.println("teste1: "+ repet);
		
		String[] segmento= new String[10];
		
		while(repet>0) { //separando os segmentos da mensagem em posições de um vetor a ser somados posteriormente
			   segmento[repet]= mensagem.substring((repet-1)*8, repet*8);
				repet--;
			   
			   //total=	Integer.parseInt(soma,2)+Integer.parseInt(soma,2);
			}
		System.out.println("seg pos 1 = "+ segmento[1]);
		System.out.println("seg pos 2 = "+ segmento[2]);
		
		repet= (mensagem.length())/8;
		int soma=2;
		while(repet>0) {
			soma=Integer.parseInt(segmento[repet],2)+soma;
			repet--;
		}
		soma=soma-2;
		System.out.println("reduindatneaiz: "+soma);
		String redu=Integer.toBinaryString(soma);
		System.out.println("soma: " + soma);
		System.out.println("redu: " + redu);
		
		redu=redu.replaceAll("1", "2");
		redu=redu.replaceAll("0", "1");
		redu=redu.replaceAll("2", "0");
		System.out.println("redu: " + redu);
		
		String bloco=mensagem+redu;
		System.out.println("mensagem igual :" +bloco);
		receptor(bloco);
		
	}

	public void receptor(String bloco) {
		System.out.println("-------------------bloco 2 -----------");
		String[] segmento= new String[10];
		int repet= (bloco.length())/8;
		String exp;
		int redu;
		exp=(bloco.substring((((repet-1)*8)),(bloco.length())));
		
		System.out.println("testeztzxe: "+ exp);
		redu=Integer.parseInt(exp,2);
		repet--;
		while(repet>0) { //separando os segmentos da mensagem em posições de um vetor a ser somados posteriormente
			   segmento[repet]= bloco.substring((repet-1)*8, repet*8);
				repet--;
			   
			 			}
		System.out.println("seg pos 1 = "+ segmento[1]);
		System.out.println("seg pos 2 = "+ segmento[2]);
		System.out.println("seg pos 3 = "+ segmento[3]);
		System.out.println("seg pos 4 = "+ segmento[4]);
		
		
		repet= (bloco.length())/8;
		
		int soma=2;
		
		repet--;
		while(repet>0) { //somando os segmentos
			soma=Integer.parseInt(segmento[repet],2)+soma;
			repet--;
	}
		soma=soma+redu;
		soma=soma-2;
		System.out.println("soma=z "+soma);
		String resultado=Integer.toBinaryString(soma);
		System.out.println("somafinaldapaixão: " + resultado);
		resultado=resultado.replaceAll("1", "0");
		int resultadoz=Integer.parseInt(resultado);
		System.out.println("grr: "+resultadoz);
		if (resultadoz==0){
			JOptionPane.showMessageDialog(null, "não houve erros");
		}else {
		JOptionPane.showMessageDialog(null, "Houveram erros");
		}
	
	
}
}
