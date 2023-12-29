package escola;

public class ProgramaEscola {

	public static void main(String[] args) {
		
		Endereco endJuliana = new Endereco("Rua das Jujubas", 100, "Campeche", "Florianópolis", "SC");
		Endereco endDaniele = new Endereco("Rua das Gomas", 200, "Pedra Branca", "Palhoça", "SC");
		Endereco endBruna = new Endereco("Rua dos Caramelos", 300, "Kobrasol", "São José", "SC");
		Endereco endHelena = new Endereco("Rua dos Pirulitos", 400, "Estreito", "Florianópolis", "SC");
		Endereco endMary = new Endereco("Rua dos Chicletes", 500, "Aririu", "Palhoça", "SC");
		
		Aluno juliana = new Aluno("Juliana", 15, endJuliana);
		Aluno daniele = new Aluno("Daniele", 14, endDaniele);
		Aluno bruna = new Aluno("Bruna", 13, endBruna);
		Aluno helena = new Aluno("Helena", 16, endHelena);
		Aluno mary = new Aluno("Mary", 15, endMary);
		
		
		Endereco endPaula = new Endereco("Rua dos Bombons", 600, "Forquilhinhas", "São José", "SC");
		Endereco endRenata = new Endereco("Rua das Balas", 700, "Capoeiras", "Florianópolis", "SC");
		Endereco endLuiza = new Endereco("Rua das Trufas", 800, "Centro", "Biguaçu", "SC");
		Endereco endBeatriz = new Endereco("Rua dos Doces", 900, "Campinas", "São José", "SC");
		Endereco endSuellen = new Endereco("Rua dos Confetes", 1000, "Capoeiras", "Florianópolis", "SC");
		
		Aluno paula = new Aluno("Paula", 14, endPaula);
		Aluno renata = new Aluno("Renata", 15, endRenata);
		Aluno luiza = new Aluno("Luiza", 15, endLuiza);
		Aluno beatriz = new Aluno("Beatriz", 14, endBeatriz);
		Aluno suellen = new Aluno("Suellen", 17, endSuellen);
		
		Aluno[] alunasA = {juliana, daniele, bruna, helena, mary};
		Aluno[] alunasB = {paula, renata, luiza, beatriz, suellen};
		
		
		Endereco endZeca = new Endereco("Rua das Enciclopédias", 500, "Centro", "Florianópolis", "SC");
		Endereco endPires = new Endereco("Rua dos Dicionários", 750, "Centro", "Florianópolis", "SC");
		
		Professor zeca = new Professor("Zeca", 45, endZeca, "Matemática");
		Professor pires = new Professor("Pires", 40, endPires, "Português");
		
		Turma turmaA = new Turma(7, zeca, alunasA);
		Turma turmaB = new Turma(8, pires, alunasB);
		Turma[] turmas = {turmaA, turmaB};
		
		Endereco endEscola = new Endereco("Rua dos Estudos", 1000, "Centro", "Florianópolis", "SC");
		Escola escola = new Escola("Escola Básica das Meninas de Florianópolis", "3232-3232", endEscola, turmas);
		
		//3-A
		escola.contabilizarAlunas();
		
		//3-B
		escola.localizarEnderecoRegente("Zeca");
		
		//3-C
		escola.listarAlunasPorSerie(8);
		
		//3-D
		escola.identificarRegenteMaisJovem();
		
		//3-E
		escola.listarAlunasPorCidade("São José");
		
	}

}
